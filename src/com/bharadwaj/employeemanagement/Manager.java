package com.bharadwaj.employeemanagement;

public class Manager extends Employee {
	
	private int teamSize;
	
	public Manager(int id, String name, int teamSize) {
		super(id, name);
		this.teamSize = teamSize;
	}
	
	@Override
	double getSalary() {
		return 70000;
	}
	
	@Override
	public String toString() {
		return getId() +" " + getName() + " " + teamSize + " " + getSalary();
	}
}
