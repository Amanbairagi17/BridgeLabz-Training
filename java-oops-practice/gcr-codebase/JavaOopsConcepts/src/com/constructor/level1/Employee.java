package com.constructor.level1;

public class Employee {
	//Attributes
	public String employeeId;
	protected String department;
	private double salary;
	
	//Constructor
	Employee(String employeeId, String department, double salary){
		this.employeeId = employeeId;
		this.department = department;
		this.salary = salary;
	}
	
	//modify salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//display
	void showDetail() {
		System.out.println(this.employeeId + " : " + this.department + " : " + this.salary);
	}
	
}
