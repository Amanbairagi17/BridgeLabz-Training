package com.universitymanagement;

public class Faculty {

    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void evaluateStudent(Enrollment enrollment, String grade) {
        System.out.println(facultyName + " assigning grade...");
        enrollment.assignGrade(grade);
    }
}

