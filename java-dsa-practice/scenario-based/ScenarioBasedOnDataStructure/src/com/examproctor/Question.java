package com.examproctor;

public class Question {
	 private int questionId;
	 private String correctAnswer;
	 private int marks;

	 public Question(int questionId, String correctAnswer, int marks) {
	     this.questionId = questionId;
	     this.correctAnswer = correctAnswer;
	     this.marks = marks;
	 }

	 public int getQuestionId() {
		 return questionId;
	 }

	 public String getCorrectAnswer() {
		 return correctAnswer;
	 }

	 public int getMarks() {
		 return marks;
	 }
	 
}
