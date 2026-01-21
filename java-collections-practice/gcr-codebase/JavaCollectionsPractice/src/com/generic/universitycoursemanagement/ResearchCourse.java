package com.generic.universitycoursemanagement;

public class ResearchCourse extends CourseType {

    public ResearchCourse() {
        evaluationMethod = "Research Work";
    }

    @Override
    public void evaluateStudent() {
        System.out.println("Evaluation via research paper and presentation.");
    }
}
