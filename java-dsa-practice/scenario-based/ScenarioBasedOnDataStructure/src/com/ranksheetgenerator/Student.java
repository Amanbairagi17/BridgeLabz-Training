package com.ranksheetgenerator;

public class Student {
    int roll;
    String name;
    int marks;

    //constructor
    Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    //getters
	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}
    
    
}