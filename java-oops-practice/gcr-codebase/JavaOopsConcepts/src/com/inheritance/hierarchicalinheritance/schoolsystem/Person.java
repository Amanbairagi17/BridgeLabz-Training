package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Person {
	//attributes
	public String name;
    public int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // display details
    public void displayDetails() {
        System.out.println(name + " | " + age);
    }
}
