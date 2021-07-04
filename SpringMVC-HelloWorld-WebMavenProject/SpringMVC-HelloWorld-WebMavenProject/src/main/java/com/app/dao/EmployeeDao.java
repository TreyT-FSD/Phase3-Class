package com.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.app.models.Employee;

public class EmployeeDao {
	
	JdbcTemplate template;

	//has to be injected from the MVC config file (spring-context.xml), can put it on the setter (just needs to be defined?)
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Employee> getEmployees(){
		return template.query("SELECT * FROM employee", new RowMapper<Employee>(){
			public Employee mapRow(ResultSet rs, int row) throws SQLException{
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getInt(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
	}
	
	public int save(Employee e) {
		String query="INSERT INTO employee values(?,?,?,?)";
		return 1;
	}
	

}
