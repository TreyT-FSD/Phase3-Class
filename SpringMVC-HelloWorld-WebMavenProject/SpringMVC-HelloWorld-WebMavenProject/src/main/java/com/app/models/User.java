package com.app.models;

/**
 * This is our bean class for the user.
 * @author Trey-9900K
 *
 */
public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	
	
	public String getFirstName() {
		//System.out.println("Using user getFirstName");
		return firstName;
	}
	public void setFirstName(String firstName) {
		//System.out.println("Using user setFirstName");
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", userName=" + userName
				+ ", password=" + password + "]";
	}
}
