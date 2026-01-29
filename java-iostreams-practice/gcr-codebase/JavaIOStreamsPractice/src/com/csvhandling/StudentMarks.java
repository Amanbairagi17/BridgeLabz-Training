package com.csvhandling;

public class StudentMarks {

    private int marks;
    private String grade;

    public StudentMarks(int marks, String grade) {
        this.marks = marks;
        this.grade = grade;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }
}
