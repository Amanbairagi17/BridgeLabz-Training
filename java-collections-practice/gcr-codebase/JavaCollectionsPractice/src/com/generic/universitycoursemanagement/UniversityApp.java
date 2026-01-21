package com.generic.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class UniversityApp {
    public static void main(String[] args) {

        Course<ExamCourse> java =
                new Course<>("Java Programming", "CSE", new ExamCourse());

        Course<AssignmentCourse> python =
                new Course<>("Python", "IT", new AssignmentCourse());

        Course<ResearchCourse> ai =
                new Course<>("AI Research", "CSE", new ResearchCourse());

        java.showCourseDetails();
        python.showCourseDetails();
        ai.showCourseDetails();

        System.out.println("\n--- Evaluation Process ---");

        List<ExamCourse> examCourses = new ArrayList<>();
        examCourses.add(new ExamCourse());

        List<AssignmentCourse> assignmentCourses = new ArrayList<>();
        assignmentCourses.add(new AssignmentCourse());

        List<ResearchCourse> researchCourses = new ArrayList<>();
        researchCourses.add(new ResearchCourse());

        UniversityManager.displayCourses(examCourses);
        UniversityManager.displayCourses(assignmentCourses);
        UniversityManager.displayCourses(researchCourses);
    }
}
