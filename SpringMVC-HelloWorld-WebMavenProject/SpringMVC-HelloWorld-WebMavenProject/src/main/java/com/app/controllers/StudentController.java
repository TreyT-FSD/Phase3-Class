package com.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.models.Student;

@Controller
@RequestMapping("/students")
public class StudentController {

	 @RequestMapping(value="/",method=RequestMethod.GET)
	    public String displayUserPage(Model model){
	        Student student = new Student();
	        student.setHiddenMsg("Hello World");
	        model.addAttribute("student", student);
	        initializeFormValues(model);
	        
	        //example of using nested page structure under WEB-INF
	        //the registration.jsp page is under /pages/students.
	        return "/students/registration";
	    }
	   
	 
	    @RequestMapping(value="/register",method=RequestMethod.POST)
	    public String displayUserDetails(@ModelAttribute Student student,Model model){
	        model.addAttribute("student", student);
	        return "/students/success";
	    }
	   
	    private void initializeFormValues(Model model) {
	        List<String> courses = new ArrayList<String>();
	        courses.add("Java");
	        courses.add("J2EE");
	        courses.add("Spring");
	        courses.add("Hibernate");
	        courses.add("Jquery");
	        model.addAttribute("courses", courses);
	       
	        List<String> genders = new ArrayList<String>();
	        genders.add("Male");
	        genders.add("Female");
	        model.addAttribute("genders", genders);
	       
	        List<String> batches = new ArrayList<String>();
	        batches.add("morning");
	        batches.add("evening");
	        model.addAttribute("batches", batches);
	    }

}