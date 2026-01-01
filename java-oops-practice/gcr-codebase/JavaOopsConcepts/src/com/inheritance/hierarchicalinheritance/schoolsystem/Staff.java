package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Staff extends Person {
	//attributes
	public String department;

    // constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // display details
    public void displayRole() {
        System.out.println("Staff : " + department);
    }
}
