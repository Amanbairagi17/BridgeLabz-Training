package com.generic.universitycoursemanagement;

public class ExamCourse extends CourseType {

    public ExamCourse() {
        evaluationMethod = "Written Exam";
    }

    @Override
    public void evaluateStudent() {
        System.out.println("Evaluation via final written examination.");
    }
}
