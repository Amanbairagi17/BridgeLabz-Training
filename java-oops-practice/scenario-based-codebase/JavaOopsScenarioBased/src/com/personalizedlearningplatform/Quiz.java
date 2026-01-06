package com.personalizedlearningplatform;

import java.util.List;

public class Quiz {
	private List<String> questions;     // internal question bank (private)
	private List<String> correctAnswers;
	private int score;
	private String difficulty;
	
	// Constructor with difficulty level
	public Quiz(List<String> questions, List<String> correctAnswers, String difficulty) {
	    this.questions = questions;
	    this.correctAnswers = correctAnswers;
	    this.difficulty = difficulty;
	}
	
	// Answers cannot be modified once evaluated
	public void evaluate(List<String> userAnswers) {
	    score = 0;
	    for (int i = 0; i < correctAnswers.size(); i++) {
	        if (correctAnswers.get(i).equals(userAnswers.get(i))) {
	            score++;
	        }
	    }
	}
	
	public double getPercentage() {
	    return (double) score * 100 / correctAnswers.size(); // operator usage
	}
}
