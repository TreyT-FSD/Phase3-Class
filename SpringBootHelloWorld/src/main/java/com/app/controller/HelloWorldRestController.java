package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
	
	@RequestMapping("/")
	public String sayHello() {
		return "Hello world Rest Controller";
	}
	

}
