package com.examproctor;

import java.util.Map;
public class ExamProctorManager {

    // Function to calculate score

	public int calculateScore(Map<Integer, Question> questionBank, Map<Integer, String> answers) {
		int score = 0;
	
	    for (Map.Entry<Integer, String> entry : answers.entrySet()) {
	
	        int qId = entry.getKey();
	        String studentAnswer = entry.getValue();
	
	        Question question = questionBank.get(qId);
	
	        if (question != null &&
	            studentAnswer.equalsIgnoreCase(question.getCorrectAnswer())) {
	
	            score += question.getMarks();
	        }
	    }
	 return score;
	}
}
