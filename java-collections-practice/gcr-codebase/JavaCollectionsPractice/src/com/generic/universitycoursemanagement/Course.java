package com.generic.universitycoursemanagement;

public class Course<T extends CourseType> {

    private String courseName;
    private String department;
    private T courseType;

    public Course(String courseName, String department, T courseType) {
        this.courseName = courseName;
        this.department = department;
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public void showCourseDetails() {
        System.out.println(
                "Course: " + courseName +
                " | Dept: " + department +
                " | Evaluation: " + courseType.getEvaluationMethod()
        );
    }
}
