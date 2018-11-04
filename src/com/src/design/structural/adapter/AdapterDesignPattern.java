package com.src.design.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterDesignPattern {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Employee employeeDB = new EmployeeDB(1, "Iftekhar", "Khan", "iftekharkhan629@gmail.com");

		EmployeeLDAP employeeLDAP = new EmployeeLDAP("ifte", "Iftekhar", "Khan", "iftekharkhan629@gmail.com");

		employees.add(new EmployeeAdapter(employeeLDAP));

		employees.add(employeeDB);
		System.out.println(employees);
	}
}
