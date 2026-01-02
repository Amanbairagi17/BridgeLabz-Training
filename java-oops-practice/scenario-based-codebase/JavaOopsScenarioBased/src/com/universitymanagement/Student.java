package com.universitymanagement;

public abstract class Student {
	//Attributes
    private int studentId;
    private String name;
    private double gpa;   

    //Constructor
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = 0.0;
    }

    // constructor with elective preference
    public Student(int studentId, String name, double initialGpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = initialGpa;
    }

    protected void updateGpa(double newGpa) {
        this.gpa = newGpa;
    }

    public void printTranscript() {
        System.out.println("Student: " + name);
        System.out.println("GPA: " + gpa);
    }
    
    //abstract method
    public abstract String getProgramType();
}
