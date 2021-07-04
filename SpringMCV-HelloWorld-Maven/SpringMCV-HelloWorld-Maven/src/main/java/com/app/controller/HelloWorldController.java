package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hw")
public class HelloWorldController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHello() {
		System.out.println("default route");
		return "helloWorld";
	}

}
