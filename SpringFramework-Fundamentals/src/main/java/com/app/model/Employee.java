package com.app.model;

/**
 * 
 * @author Trey-9900K
 * constructor DI
 *
 */

public class Employee {
	private int id;
	private String name;
	
	
	public Employee() {
		super();
		System.out.println("default constructor invoked");

	}

	public Employee(int id, String name) {
		super();
		System.out.println("parameterized constructor1 invoked");
		this.id = id;
		this.name = name;
	}
	
	public Employee(String name, int id) {
		super();
		System.out.println("parameterized constructor2 invoked");
		this.id = id;
		this.name = name;
	}
	
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
