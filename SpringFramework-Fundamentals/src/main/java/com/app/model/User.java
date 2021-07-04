package com.app.model;

//pojo, this is the dependency that we are injecting
public class User {
	
	//if we have more than one entity, we will end up needing an id at some point
	private int id;
	
	//just a property
	private String name;
	
	
	//getter and setter
	public String getName() {
		//System.out.println("User.getName invoked...");
		return name;
	}

	public void setName(String name) {
		//System.out.println("User.setName invoked...");
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	//toString
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}	
}
