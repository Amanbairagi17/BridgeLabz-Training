package com.universitymanagement;

public class Enrollment implements Graded {
	
	//Attributes
    private Student student;
    private Course course;
    private String grade;

    //Constructor
    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void assignGrade(String grade) {
        this.grade = grade;
        calculateGpaEffect();
    }

    // realistic GPA handling
    private void calculateGpaEffect() {
        double points;

        if (grade.equalsIgnoreCase("A")) points = 4.0;
        else if (grade.equalsIgnoreCase("B")) points = 3.0;
        else if (grade.equalsIgnoreCase("C")) points = 2.0;
        else points = 0.0;

        double gpa = (points * course.getCredits()) / course.getCredits();
        student.updateGpa(gpa);
    }

    //print details
    public void printEnrollment() {
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Grade: " + grade);
    }
}

