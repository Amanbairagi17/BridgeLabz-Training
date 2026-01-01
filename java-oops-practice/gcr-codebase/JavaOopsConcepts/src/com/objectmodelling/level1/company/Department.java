package com.objectmodelling.level1.company;

import java.util.ArrayList;

public class Department {
	//Attribute 
	private String name;
	ArrayList<Employee> employees;
	
	//constructor
	public Department(String name) {
		this.name = name;
		this.employees = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "Department [name=" + name + ", employees=" + employees + "]";
	}

	// method to add employees
	public void addEmployee(int id, String name) {
		employees.add(new Employee(id, name));
	}
	
	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//clear list of employee 
	public void clearEmployees() {
		employees.clear();
	}
}
