package com.encapsulationandpolymorphism.employeemanagement;

public class FullTimeEmployee extends Employee{
	private int workHours;
	
	public FullTimeEmployee(String employeeId, String name, double baseSalary, int workHours) {
		super(employeeId, name, baseSalary);
		this.workHours = workHours;
	}
	
	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	void calculateSalary() {
		double salary = 300 * workHours;
		System.out.println("Total salary for full time employee : " +salary);
	}
	

}
