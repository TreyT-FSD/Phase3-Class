package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dao.EmployeeDao;
import com.app.models.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/")
	public String getEmployees(Model model) {
		List<Employee> list = dao.getEmployees();
		
		//for testing just print here
		for (Employee employee : list) {
			System.out.println(employee);
		}
				
		//if we wanted to push it to a vew use this
		model.addAttribute("employees", list);
		
		return "/employees/employees";
	}
	

}
