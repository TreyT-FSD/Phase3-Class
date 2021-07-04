package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.models.*;

@Controller
@RequestMapping("/users")
public class UserController {
	
	/**
	 * for request mapping, we can just define the route and it will default to a GET
	 * @return
	 */
	@RequestMapping("/")
	public String getMessage() {
		
		//if we wanted to nest the user jsp files in a folder under pages we can
		//to do that we would return something like /users/user-list. the folder under pages would be called users
		return "user-list";
	}
	
	@RequestMapping(value = "/register", method=RequestMethod.GET)
	public String registerNewUser(Model model) {
		
		//an empty object for the registration form to use
		User user = new User();
		model.addAttribute("userObj", user);
		
		return "/user-register";
	}
	
	/**
	 * This is the action that we defined in the form, this will get called by our form
	 * 
	 * The ModelAttribute binding binds the Attribute that was set via the form
	 * to the USer object parameter that is being passed into this method.
	 * This lets us access that attribute as as object without having to do 
	 * all the getAttribute() and casting as an object that we used to have to do with JSP/JSTL. 
	 * 
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/userRegistration", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("userObj") User user, Model model) {
		
		//print out the user's data that was submitted in the form
		System.out.println(user);
		
		//now we add the user to the model so that the next page can access it like we normally would with ${user}
		model.addAttribute("user", user);
		
		//route to the success page
		return "user-sucess";
	}
	
	/**
	 * sample from bootstrap site
	 * @return
	 */
	@RequestMapping("bootstrap")
	public String getBootstrap() {
		return "bootstrap-starter";
	}
}
