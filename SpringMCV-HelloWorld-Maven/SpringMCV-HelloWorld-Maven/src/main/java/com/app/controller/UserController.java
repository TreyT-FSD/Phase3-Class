package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	//to use the userService, we autowire it here so that the controller can access it
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/")
	public String userForm() {
		return "userForm";
	}
}
