package com.campusconnect;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private List<Integer> grades;   // encapsulated

    public Student(String name, String email, String id) {
        super(name, email, id);
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Operator usage for GPA
    public double calculateGPA() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return grades.isEmpty() ? 0 : (double) sum / grades.size();
    }

   //method to print details for student
    public void printDetails() {
        System.out.println("Student Name: " + super.getName());
        System.out.println("ID: " + super.getId());
        System.out.println("GPA: " + calculateGPA());
    }
}
