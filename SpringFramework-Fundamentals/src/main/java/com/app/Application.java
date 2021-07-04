package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.config.AppConfig;
import com.app.model.Employee;
import com.app.model.Student;
import com.app.model.User;

public class Application {
	
	public static void main(String[] args) {
		
		//old way to do it, this is tightly coupled and not good
		/*
		User user = new User();
		user.setName("trey");
		System.out.println(user);
		*/
		
		
		//new way to access objects (aka dependency injection), using the ApplicationContext
		
		//open the context defined in the xml
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		//get user object from the context, tell it the class type we expect to see
		User user = context.getBean("userObj", User.class);
		
		//print it out
		System.out.println(user);
		
		//cleanup, close the context
		((AbstractApplicationContext) context).close();
		System.out.println();
		System.out.println();
		
		
		
		//open the context defined in the AppConfig java class
		ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//the bean created and annotated is the getStudentDetails method defined in AppConfig, it will return a Student so we tell it that it is of type Student.class
		Student student = context2.getBean("getStudentDetails", Student.class);
		System.out.println(student);
		
		((AbstractApplicationContext) context2).close();
		System.out.println();
		System.out.println();
		
		
		
		//constructor DI example with the employee class and employee constructor bean in the xml app context
		ApplicationContext context3 = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Employee emp1 = context3.getBean("empObj", Employee.class);
		System.out.println(emp1);
		
		((AbstractApplicationContext) context3).close();
		System.out.println();
		System.out.println();
		
		
		//open the context defined in the AppConfig java class
		ApplicationContext context4 = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//the bean created and annotated is the getStudentDetails method defined in AppConfig, it will return a Student so we tell it that it is of type Student.class
		Employee employee = context4.getBean("getEmployeeDetails", Employee.class);
		System.out.println(employee);
		
		((AbstractApplicationContext) context4).close();
		System.out.println();
		System.out.println();
		
		
		
		
	}

}
