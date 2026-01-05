package com.campusconnect;

import java.util.ArrayList;
import java.util.List;

public class Course implements ICourseActions {

    private String courseName;
    private Faculty faculty;
    private List<Student> students;

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        this.students = new ArrayList<>();
    }

    //method to add course
    @Override
    public void enrollCourse(Student student) {
        students.add(student);
        System.out.println(student.getName() + " enrolled in " + courseName);
    }

    //method to remove course
    @Override
    public void dropCourse(Student student) {
        students.remove(student);
        System.out.println(student.getName() + " dropped " + courseName);
    }
}
