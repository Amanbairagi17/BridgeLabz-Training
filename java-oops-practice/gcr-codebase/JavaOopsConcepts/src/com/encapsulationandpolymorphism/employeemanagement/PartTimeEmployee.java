package com.encapsulationandpolymorphism.employeemanagement;

public class PartTimeEmployee extends Employee{
	private int workHours;
	
	public PartTimeEmployee(String employeeId, String name, double baseSalary, int workHours) {
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
		double salary = 130 * workHours;
		System.out.println("Total salary for part time employee : " +salary);
	}
	

}


