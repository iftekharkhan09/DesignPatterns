package com.src.design.structural.adapter;

public class EmployeeLDAP {
	public EmployeeLDAP(String cn, String firstName, String lastName, String email) {
		super();
		this.setCn(cn);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
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

	private String cn;
	private String firstName;
	private String lastName;
	private String email;

	@Override
	public String toString() {
		return "ID:" + cn + " FirstName:" + firstName + " SecondName:" + lastName + " Email:" + email;
	}

}
