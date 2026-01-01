package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Teacher extends Person{
	//attributes
	public String subject;

    // constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // display
    public void displayRole() {
        System.out.println("Teacher : " + subject);
    }
}
