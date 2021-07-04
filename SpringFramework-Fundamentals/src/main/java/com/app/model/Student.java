package com.app.model;

/**
 * 
 * @author Trey-9900K
 * bean for setter DI
 *
 */

//Demo using annotations instead of the XML file for defining the dependency
public class Student {
	
	
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
