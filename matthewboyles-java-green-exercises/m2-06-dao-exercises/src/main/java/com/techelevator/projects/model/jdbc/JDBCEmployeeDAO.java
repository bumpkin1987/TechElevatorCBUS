package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> employees = new ArrayList<>();
		String sqlActiveEmployees = "select employee_id, department_id, first_name, last_name, birth_date, gender, hire_date from employee; ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlActiveEmployees);
		while (results.next()) {
			Employee theEmployee = mapRowToEmployee(results);
			employees.add(theEmployee);
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {

		List<Employee> employees = new ArrayList<>();
		String sqlActiveEmployees = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date FROM employee\n " + "WHERE first_name ILIKE ? AND last_name ILIKE ?; ";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlActiveEmployees, "%" + firstNameSearch + "%",
				"%" + lastNameSearch + "%");
		while (results.next()) {
			Employee theEmployee = mapRowToEmployee(results);
			employees.add(theEmployee);
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		List<Employee> employees = new ArrayList<>();
		String sqlGetEmployeesByDepartmentId = "SELECT employee.employee_id, employee.department_id, employee.first_name, employee.last_name, employee.birth_date, employee.gender, employee.hire_date"
											 + " FROM employee WHERE department_id = ?; ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesByDepartmentId, id);

		while (results.next()) {
			Employee theEmployee = mapRowToEmployee(results);
			employees.add(theEmployee);
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employees = new ArrayList<>();
		String sqlGetEmployeesWithoutProjects = "SELECT e.employee_id, e.department_id, e.first_name, e.last_name, e.birth_date, e.gender, e.hire_date "
											  + "FROM employee as e " + "LEFT JOIN project_employee as pe " 
											  + "on e.employee_id = pe.employee_id "
											  + "WHERE pe.employee_id IS null;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesWithoutProjects);

		while (results.next()) {
			Employee theEmployee = mapRowToEmployee(results);
			employees.add(theEmployee);
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		List<Employee> employees = new ArrayList<>();
		String sqlGetEmployeesByDepartmentId = "SELECT employee.employee_id, employee.department_id, employee.first_name, employee.last_name, employee.birth_date, employee.gender, employee.hire_date " 
											 + "FROM employee JOIN project_employee "
										   	 + "ON employee.employee_id = project_employee.employee_id "
										   	 + "WHERE project_id = ?; ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesByDepartmentId, projectId);

		while (results.next()) {
			Employee theEmployee = mapRowToEmployee(results);
			employees.add(theEmployee);
		}
		return employees;
	}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
		String sqlChangeEmployeesDepartmentId = "UPDATE employee Set department_id = ? "
											  + "WHERE employee_id = ?; ";
		jdbcTemplate.update(sqlChangeEmployeesDepartmentId, departmentId, employeeId);
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
