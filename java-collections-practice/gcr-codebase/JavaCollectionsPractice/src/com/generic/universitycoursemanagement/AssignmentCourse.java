package com.generic.universitycoursemanagement;

public class AssignmentCourse extends CourseType {
	 public AssignmentCourse() {
	    evaluationMethod = "Assignments";
	 }

   @Override
   public void evaluateStudent() {
	    System.out.println("Evaluation via assignments and quizzes.");
	}
}