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
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;


public class JDBCEmployeeDAOTest {

private static final String TEST_EMPLOYEEFIRSTNAME = "Matthew";
private static final String TEST_EMPLOYEELASTNAME = "Boyles";
	
	/* Using this particular implementation of DataSource so that
	 * every database interaction is part of the same database
	 * session and hence the same database transaction */
	private static SingleConnectionDataSource dataSource;
	private JDBCEmployeeDAO dao;
	
	/* Before any tests are run, this method initializes the datasource for testing. */
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/Projects");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		/* The following line disables autocommit for connections 
		 * returned by this DataSource. This allows us to rollback
		 * any changes after each test */
		dataSource.setAutoCommit(false);
	}
	
	/* After all tests have finished running, this method will close the DataSource */
	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	}
	
	@Before
	public void setup() {
		String sqlInsertEmployee = "INSERT INTO Employee VALUES ("
								 + "DEFAULT, "
								 + "1, "
								 + "?, "
								 + "?, "
								 + "'1987-06-24', "
								 + "'M', "
								 + "'2018-09-17')";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertEmployee, TEST_EMPLOYEEFIRSTNAME, TEST_EMPLOYEELASTNAME);
		dao = new JDBCEmployeeDAO(dataSource);
	}

	/* After each test, we rollback any changes that were made to the database so that
	 * everything is clean for the next test */
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	@Test
	public void get_all_employees_test() 
	{
		List<Employee> employeeList = dao.getAllEmployees();
		assertNotNull(employeeList);
		assertEquals(13, employeeList.size());
	}
	
	@Test
	public void search_employees_by_name_test() 
	{
		//Employee employee = TEST_EMPLOYEE;
		List<Employee> employee = null;
		employee = dao.searchEmployeesByName(TEST_EMPLOYEEFIRSTNAME, TEST_EMPLOYEELASTNAME);

		List<Employee> myList = dao.searchEmployeesByName(TEST_EMPLOYEEFIRSTNAME, TEST_EMPLOYEELASTNAME);
		    
		assertNotNull(myList);
		assertEquals(TEST_EMPLOYEEFIRSTNAME, myList.get(0).getFirstName());
	}
	
	@Test
	public void get_employees_without_projects_test() 
	{
		List<Employee> employees = dao.getEmployeesWithoutProjects();
		
		assertNotNull(employees);
		assertEquals(3, employees.size());
	}
	
	@Test
	public void get_all_employees_by_department_id() 
	{
		List<Employee> employee = dao.getEmployeesByDepartmentId(2);
	
		assertNotNull(employee);
		assertEquals(3, employee.size());
	}

	@Test
	public void get_employees_by_project_id() 
	{
		List<Employee> employee = dao.getEmployeesByProjectId(3L);
	
		assertNotNull(employee);
		assertEquals(3, employee.size());
	}
	
	@Test
	public void change_employee_department_test() 
	{
		List<Employee> employ = dao.searchEmployeesByName(TEST_EMPLOYEEFIRSTNAME, TEST_EMPLOYEELASTNAME);
		Employee employee = employ.get(0);
		dao.changeEmployeeDepartment(employee.getId(), 2L);
	
		List<Employee> employ2 = dao.searchEmployeesByName(TEST_EMPLOYEEFIRSTNAME, TEST_EMPLOYEELASTNAME);
		Employee employee2 = employ2.get(0);
	
		assertNotNull(employee);
		assertNotNull(employee2);
		assertEquals(2, employee2.getDepartmentId());
	}
	
	private Employee getEmployee(String firstName, String lastName) {
		Employee employee;
		employee = new Employee();
		employee.setFirstName(TEST_EMPLOYEEFIRSTNAME);
		employee.setLastName(TEST_EMPLOYEELASTNAME);
		return employee;
	}
	
	private Employee mapRowToEmployee(SqlRowSet results) {
		Employee employees;
		employees = new Employee();
		employees.setId(results.getLong("employee_id"));
		employees.setDepartmentId(results.getLong("department_id"));
		employees.setFirstName(results.getString("first_name"));
		employees.setLastName(results.getString("last_name"));
		employees.setBirthDay(results.getDate("birth_date").toLocalDate());
		employees.setGender(results.getString("gender").charAt(0));
		employees.setHireDate(results.getDate("hire_date").toLocalDate());
		return employees;
	}
}
