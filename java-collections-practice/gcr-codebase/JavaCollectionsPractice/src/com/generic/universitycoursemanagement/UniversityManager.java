package com.generic.universitycoursemanagement;

import java.util.List;

public class UniversityManager {

    public static void displayCourses(
            List<? extends CourseType> courseTypes) {

        for (CourseType type : courseTypes) {
            type.evaluateStudent();
        }
    }
}
