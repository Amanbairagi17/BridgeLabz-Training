package com.universitymanagement;

public class Course {
	//Attribute
    private String courseCode;
    private String courseName;
    private int credits;

    //constructor
    public Course(String code, String name, int credits) {
        this.courseCode = code;
        this.courseName = name;
        this.credits = credits;
    }

    //getter credit points
    public int getCredits() {
        return credits;
    }

    //setters to for set course
    public String getCourseName() {
        return courseName;
    }
}

