package com.bharadwaj.employeemanagement;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Developer(1, "Kondapalli", "Java");
		Employee e2 = new Manager(2, "Bharadwaj", 5);
		
		System.out.println(e1);
		System.out.println(e2);

	}

}
