package com.src.design.structural.adapter;

public class EmployeeDB implements Employee {
	public EmployeeDB(int id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	private int id;
	private String firstName;
	private String lastName;
	private String email;

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "ID:" + id + " FirstName:" + firstName + " SecondName:" + lastName + " Email:" + email;
	}
}
