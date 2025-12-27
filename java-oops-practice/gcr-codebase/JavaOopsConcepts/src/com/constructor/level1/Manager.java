package com.constructor.level1;

public class Manager {
	public static void main(String[] args) {
		Employee e1 = new Employee("Emp11", "Tech ", 400000.0);
		e1.showDetail();
		e1.setSalary(90000);
		e1.showDetail();
	}
}
