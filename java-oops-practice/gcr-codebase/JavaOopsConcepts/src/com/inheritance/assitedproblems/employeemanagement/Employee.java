package com.inheritance.assitedproblems.employeemanagement;

public class Employee {
	//Attributes
	private int id;
	private String name;
	private int salary;
	
	//constructor
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// method to display details
	public void displayDetails() {
		System.out.println(id + " " + name + " " + salary);
	}
	

	// getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
