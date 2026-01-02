package com.bankingmanagementsystem;

public class Employee extends Person{
	//attributes
	public int empId;
	
	//constructor
	public Employee(String name, int age, int empId){
		super(name, age);
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}
	
}
