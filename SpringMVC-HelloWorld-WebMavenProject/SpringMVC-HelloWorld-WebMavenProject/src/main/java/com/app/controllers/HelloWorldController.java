package com.app.controllers;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.models.HelloWorld;

/**
 *  * @author Trey-9900K
 *  
 *  The com.app.controllers will handle dispatching requests to the right page (view)
 *  
 *  
 *
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {
	
	@RequestMapping("/")
	public String getMessage() {
		return "index";
	}
	
	@RequestMapping("/hw")
	public String getMessage2() {
		return "helloworld";
	}
	
	/**
	 * Here 
	 * @param model this is provided by spring.
	 * It allows us to set attributes that can be access in the view
	 * (aka the jsp file we have in the return)
	 * @return
	 */
	@RequestMapping("/message")
	public String getDetails(Model model) {
		HelloWorld helloWorld= new HelloWorld();
		
		helloWorld.setMessage("lets learn spring mvc!");
		helloWorld.setDateTime(LocalDateTime.now().toString());
		
		model.addAttribute("helloWorld", helloWorld);
		
		 
		
		return "/message";
		
		
	}

}
