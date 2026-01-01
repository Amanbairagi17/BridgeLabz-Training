package com.encapsulationandpolymorphism.employeemanagement;

public abstract class Employee implements Department{
	private String employeeId;
	private String name;
	private double baseSalary;
	
	private String departmentName;
	
	public Employee(String employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	abstract void calculateSalary();
	
	void displayDetails() {
		System.out.println("Employee Id : " +this.employeeId+ "Employee name : " +this.name+ "Base Salary : " +this.baseSalary);
	}
	
	public void assignDepartment(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getDepartmentDetails() {
		return this.departmentName;
	}
}
