package com.bharadwaj.employeemanagement;

public class Developer extends Employee {
	
	private String techStack;
	
	public Developer(int id, String name, String techStack) {
		super(id, name);
		this.techStack = techStack;
	}
	
	@Override
	double getSalary() {
		return 50000;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + techStack + " " + getSalary();
	}

}
