package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hw")
public class HelloWorldController {
	
	//TODO: fix this, currently doesnt work. how to do JSP with SpringBoot?
	@RequestMapping("/")
	public String HelloWorld() {
		return "HelloWorldJSP";
	}

}
