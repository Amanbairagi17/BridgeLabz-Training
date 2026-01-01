package com.encapsulationandpolymorphism.employeemanagement;

import java.util.ArrayList;

public class DriverClass {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee e1 = new FullTimeEmployee("E123","Aman Bairagi",10000.0,50);
		Employee e2 = new PartTimeEmployee("E121","Alex Harry",15000.0,30);
		
		e1.assignDepartment("Production");
		e2.assignDepartment("Networking");
		
		employees.add(e1);
		employees.add(e2);
		
		for(Employee e : employees) {
			e.displayDetails();
			e.calculateSalary();
		}
		
	}
}
