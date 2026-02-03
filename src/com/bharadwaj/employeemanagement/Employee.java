package com.bharadwaj.employeemanagement;

public class Employee {
	protected int id;
	protected String name;
	
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	double getSalary() {
		return 0;
	}
	
	@Override
	public String toString() {
		return id + " " + name;
	}

}
