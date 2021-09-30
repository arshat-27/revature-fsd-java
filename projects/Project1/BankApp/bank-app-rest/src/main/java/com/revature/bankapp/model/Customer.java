package com.revature.bankapp.model;

import java.util.Scanner;

public class Customer {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneno;
	
	
	
	public Customer(String firstName, String lastName, String email, String password,String phoneno) {
		super();
		

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneno=phoneno;
	}
	public Customer() {
		
	}

	public void setId(long id) {

	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	

}
