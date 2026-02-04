package com.bharadwaj.employeemanagement;

public class Employee {
	private int id;
	private String name;
	
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	double getSalary() {
		return 0;
	}
	
	@Override
	public String toString() {
		return id + " " + name;
	}

}
