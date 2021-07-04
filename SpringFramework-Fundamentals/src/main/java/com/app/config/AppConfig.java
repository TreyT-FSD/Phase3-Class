package com.app.config;

import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.model.Employee;
import com.app.model.Student;

@Configuration
public class AppConfig {
	
	//in this case the bean is a method that return the student. aka it produces a bean. this is setter dependency injection (DI)
	@Bean
	public Student getStudentDetails() {
		Student student = new Student();
		student.setId(5001);
		student.setName("King");
		return student;
	}
	
	@Bean(name = "empObj")
	public Employee getEmployeeDetails() {
		Employee emp = new Employee(202, "trey");
		return emp;
	}
	

}
