package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Project> getAllActiveProjects() {

		List<Project> projects = new ArrayList<>();
		String sqlActiveProjects = "SELECT project_id, name, from_date, to_date ('0000-00-00', 'yyyy-mm-dd') FROM project\n "
								 + " WHERE (from_date <= '2018-10-22' AND to_date is null)\n "
								 + " OR (from_date <= '2018-10-22' AND to_date > '2018-10-24'); ";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlActiveProjects);
		while (results.next()) {
			Project theProject = mapRowToProject(results);
			projects.add(theProject);
		}
		return projects;
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		String removeEmployee = "DELETE FROM project_employee\n WHERE project_id = ? AND employee_id = ? ";
		jdbcTemplate.update(removeEmployee, projectId, employeeId); // sql query will be passed along with the
																			// params the method calls for
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		String addEmployee = "INSERT INTO project_employee\n VALUES(?, ?) ";
		jdbcTemplate.update(addEmployee, projectId, employeeId);// adding sql insert with the params method
																		// needs
	}

	private Project mapRowToProject(SqlRowSet results) {
		Project theProject = new Project();
		theProject.setId(results.getLong("project_id"));
		theProject.setName(results.getString("name"));
		theProject.setStartDate(results.getDate("from_date").toLocalDate());
		theProject.setEndDate(results.getDate("to_date").toLocalDate());
		return theProject;
	}
}
