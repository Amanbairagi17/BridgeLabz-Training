package com.constructor.level1;

public class Student {
	//Attributes
	public String rollNumber;
	protected String name;
	private double cgpa;
	
	Student(String rollNumber, String name, double cgpa){
		this.rollNumber = rollNumber;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	void display() {
		System.out.print(this.rollNumber + " : " + this.name + " : " + this.cgpa);
	}
}
