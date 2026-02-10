package com.streams.problem1;

import java.time.LocalDate;

public class Employee {
	int id;
	String name;
	int age;
	String gender;
	String department;
	LocalDate doj;
	double salary;
	
	public Employee(int id, String name, int age, String gender, String department, LocalDate doj, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.doj = doj;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", doj=" + doj + ", salary=" + salary + "]";
	}
	
	
	
	
}
