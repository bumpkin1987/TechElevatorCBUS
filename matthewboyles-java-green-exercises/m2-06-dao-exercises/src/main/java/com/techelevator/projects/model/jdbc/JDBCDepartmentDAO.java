package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;
import com.techelevator.projects.model.Project;

public class JDBCDepartmentDAO implements DepartmentDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Department> getAllDepartments() {

		List<Department> departments = new ArrayList<>();
		String sqlActiveDepartments = "SELECT department_id, name FROM department; ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlActiveDepartments);
		while (results.next()) {
			Department theDepartment = mapRowToDepartment(results);
			departments.add(theDepartment);
		}
		return departments;
	}

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {

		List<Department> departments = new ArrayList<>();
		String sqlActiveDepartments = "SELECT department_id, name FROM department\n " + "WHERE name ILIKE ?; ";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlActiveDepartments, "%" + nameSearch + "%");
		while (results.next()) {
			Department theDepartment = mapRowToDepartment(results);
			departments.add(theDepartment);
		}
		return departments;
	}

	@Override
	public void saveDepartment(Department updatedDepartment) {
		String sqlSaveDepartments = "UPDATE department Set name = ? WHERE department_id = ?; ";
		jdbcTemplate.update(sqlSaveDepartments, updatedDepartment.getName(), updatedDepartment.getId());
	}

	@Override
	public Department createDepartment(Department newDepartment) {

		String sqlCreateDepartments = "INSERT INTO department (name)\n " + "VALUES(?) returning department_id; ";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlCreateDepartments, newDepartment.getName());
			if (results.next()) {
				newDepartment.setId(results.getLong("department_id")); 
			}
		 return newDepartment;
	}

	@Override
	public Department getDepartmentById(Long id) {
		Department departments = null;
		String sqlGetDepartmentsById = "SELECT department_id, name FROM department WHERE department_id = ?; ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetDepartmentsById, id);
		if (results.next()) {
			departments = mapRowToDepartment(results);
		}
		return departments;
	}

	private Department mapRowToDepartment(SqlRowSet results) {

		Department theDepartment = new Department();
		theDepartment.setId(results.getLong("department_id"));
		theDepartment.setName(results.getString("name"));

		return theDepartment;
	}

}
