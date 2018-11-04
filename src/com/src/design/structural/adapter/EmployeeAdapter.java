package com.src.design.structural.adapter;

public class EmployeeAdapter implements Employee {
	public EmployeeAdapter(EmployeeLDAP instance) {
		super();
		this.instance = instance;
	}

	private EmployeeLDAP instance;

	@Override
	public int getId() {
		return 0;
		// return instance.getCn();
	}

	@Override
	public String getFirstName() {
		return instance.getFirstName();
	}

	@Override
	public String getLastName() {
		return instance.getLastName();
	}

	@Override
	public String getEmail() {
		return instance.getEmail();
	}

	@Override
	public String toString() {
		return "ID:" + instance.getCn() + " FirstName:" + instance.getFirstName() + " SecondName:"
				+ instance.getLastName() + " Email:" + instance.getEmail();
	}
}
