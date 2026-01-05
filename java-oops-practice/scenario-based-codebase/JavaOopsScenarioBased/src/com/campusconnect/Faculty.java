package com.campusconnect;

public class Faculty extends Person{
	private String department;

    public Faculty(String name, String email, String id, String department) {
        super(name, email, id);
        this.department = department;
    }

    //method to print detail for faculty
    public void printDetails() {
        System.out.println("Faculty Name: " + super.getName());
        System.out.println("Department: " + department);
    }
}
