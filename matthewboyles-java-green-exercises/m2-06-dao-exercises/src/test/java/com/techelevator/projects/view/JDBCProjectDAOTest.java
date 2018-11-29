package com.techelevator.projects.view;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;
import com.techelevator.projects.model.jdbc.JDBCProjectDAO;

public class JDBCProjectDAOTest {

private static final String TEST_PROJECT = "Shoehorn Capital";
private static final String TEST_FIRST_NAME = "Derek";
private static final String TEST_LAST_NAME = "Lightning";
private static SingleConnectionDataSource dataSource;
private JDBCProjectDAO dao;
private JDBCEmployeeDAO empDao;

	@BeforeClass
	public static void setupDataSource() 
	{
	    dataSource = new SingleConnectionDataSource();
	    dataSource.setUrl("jdbc:postgresql://localhost:5432/Projects");
	    dataSource.setUsername("postgres");
	    dataSource.setPassword("postgres1");
	    dataSource.setAutoCommit(false);
	}
	
	@AfterClass
	public static void closeDataSource() throws SQLException 
	{
	    dataSource.destroy();
	}
	
	@Before
	public void setup() 
	{
	    empDao = new JDBCEmployeeDAO(dataSource);
	    dao = new JDBCProjectDAO(dataSource);
	}
	
	@After
	public void rollback() throws SQLException 
	{
	    dataSource.getConnection().rollback();
	}
	
	@Test
	public void get_all_active_projects_test() 
	{
	    List<Project> myList = dao.getAllActiveProjects();
	    
	    assertNotNull(myList);
	    assertEquals(2, myList.size());
	}
	
	@Test
	public void remove_employee_from_project_test()
	{
		int count = 0;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sqlInsertEmployee = "INSERT INTO Employee VALUES ("
		+ "DEFAULT, "
		+ "1, "
		+ "?, "
		+ "?, "
		+ "'1987-06-24', "
		+ "'M', "
		+ "'2018-09-17')";
	
		jdbcTemplate.update(sqlInsertEmployee, TEST_FIRST_NAME, TEST_LAST_NAME);
	
		List<Employee> employee = empDao.getEmployeesByProjectId(1L);
		assertNotNull(employee);
	
		dao.addEmployeeToProject(1L, empDao.searchEmployeesByName(TEST_FIRST_NAME, TEST_LAST_NAME).get(0).getId());
		assertNotEquals(employee.size(), empDao.getEmployeesByProjectId(1L).size());
	
		dao.removeEmployeeFromProject(1L, empDao.searchEmployeesByName(TEST_FIRST_NAME, TEST_LAST_NAME).get(0).getId());
		assertEquals(employee.size(), empDao.getEmployeesByProjectId(1L).size());
	
		List<Employee> employee2 = empDao.getEmployeesWithoutProjects();
		for (Employee people : employee2) {
		    if (people.getFirstName().contains(TEST_FIRST_NAME)) {
		        count++;
		    }   
		}
		assertEquals(1, count);  
	}
	
	@Test
	public void add_employee_to_project_test() 
	{
		int count = 0;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sqlInsertEmployee = "INSERT INTO Employee VALUES ("
		+ "DEFAULT, "
		+ "1, "
		+ "?, "
		+ "?, "
		+ "'1987-06-24', "
		+ "'M', "
		+ "'2018-09-17')";

		jdbcTemplate.update(sqlInsertEmployee, TEST_FIRST_NAME, TEST_LAST_NAME);

		List<Employee> employee = empDao.getEmployeesByProjectId(1L);
		assertNotNull(employee);

		dao.addEmployeeToProject(1L, empDao.searchEmployeesByName(TEST_FIRST_NAME, TEST_LAST_NAME).get(0).getId());
		assertNotEquals(employee.size(), empDao.getEmployeesByProjectId(1L).size());

		List<Employee> employee2 = empDao.getEmployeesByProjectId(1L);
		for (Employee people : employee2) {
		    if (people.getFirstName().contains(TEST_FIRST_NAME)) {
		        count++;
		    }   
		}
		assertEquals(1, count); 
	}
	
	private Project getProject(SqlRowSet results) 
	{
	
	    Project proj;
	    proj = new Project();
	    proj.setId(results.getLong("project_id"));
	    proj.setName(results.getString("name"));
	    proj.setStartDate(results.getDate("from_date").toLocalDate());
	    proj.setEndDate(results.getDate("to_date").toLocalDate());
	    return proj;
	}
	
	private void assertDepartmentsAreEqual(Project expected, Project actual) 
	{
	    assertEquals(expected.getId(), actual.getId());
	    assertEquals(expected.getName(), actual.getName());
	    assertEquals(expected.getStartDate(), actual.getStartDate());
	    assertEquals(expected.getEndDate(), actual.getEndDate());
	}
}