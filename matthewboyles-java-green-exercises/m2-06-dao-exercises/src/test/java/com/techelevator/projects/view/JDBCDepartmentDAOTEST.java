package com.techelevator.projects.view;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;

public class JDBCDepartmentDAOTEST {

	private static final String TEST_DEPARTMENT = "ICU";

	/*
	 * Using this particular implementation of DataSource so that every database
	 * interaction is part of the same database session and hence the same database
	 * transaction
	 */
	private static SingleConnectionDataSource dataSource;
	private JDBCDepartmentDAO dao;

	/*
	 * Before any tests are run, this method initializes the datasource for testing.
	 */
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/Projects");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		/*
		 * The following line disables autocommit for connections returned by this
		 * DataSource. This allows us to rollback any changes after each test
		 */
		dataSource.setAutoCommit(false);
	}

	/*
	 * After all tests have finished running, this method will close the DataSource
	 */
	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	}

	@Before
	public void setup() {
		dao = new JDBCDepartmentDAO(dataSource);
	}

	/*
	 * After each test, we rollback any changes that were made to the database so
	 * that everything is clean for the next test
	 */
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	@Test
	public void get_all_departments() {
		List<Department> deptList = dao.getAllDepartments();
		assertNotNull(deptList);
		assertEquals(4, deptList.size());
	}
	
	@Test
	public void search_department_by_name_test() {
	Department depart = getDepartment(TEST_DEPARTMENT);
	depart = dao.createDepartment(depart);

	    List<Department> myList = dao.searchDepartmentsByName(TEST_DEPARTMENT);
	    
	    assertNotNull(myList);
	    assertEquals(TEST_DEPARTMENT, myList.get(0).getName());
	}

	@Test
	public void create_department_test() {
		Department department = getDepartment(TEST_DEPARTMENT);
		department = dao.createDepartment(department);

		Department departmentCopy = dao.getDepartmentById(department.getId());

		assertNotNull(departmentCopy);
		assert_departments_are_equal_test(department, departmentCopy);
	}

	@Test
	public void save_department_test() {
		Department department = getDepartment(TEST_DEPARTMENT);
		department = dao.createDepartment(department);
		department.setName("MedSurg");
		dao.saveDepartment(department);

		Department departmentCopy = dao.getDepartmentById(department.getId());

		assertNotNull(departmentCopy);
		assert_departments_are_equal_test(department, departmentCopy);

	}
	
	@Test
	public void get_department_by_id() {
		Department department = getDepartment(TEST_DEPARTMENT); //creation of fake ID for dept 
		department = dao.createDepartment(department);// made in java world and db world
														// calling back newly created column for id from db
		Department departmentCopy = dao.getDepartmentById(department.getId());
		assertNotNull(departmentCopy);
		assert_departments_are_equal_test(department, departmentCopy);
	}

	private Department getDepartment(String departmentName) {
		Department department;
		department = new Department();
		department.setName(departmentName);
		return department;
	}

	private void assert_departments_are_equal_test(Department expected, Department actual) {
		assertEquals(expected.getId(), actual.getId());
		assertEquals(expected.getName(), actual.getName());
	}
}
