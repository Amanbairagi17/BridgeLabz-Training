package com.personalizedlearningplatform;

import java.util.List;

public class QuizApplication {
	public static void main(String[] args) {

        Learner learner = new Learner("Aman",101, "aman@gmail.com");

        Quiz quiz = new Quiz(
                List.of("Q1", "Q2", "Q3"),
                List.of("A", "B", "C"),
                "Medium"
        );

        quiz.evaluate(List.of("A", "B", "A"));

        System.out.println("Quiz Percentage: " + quiz.getPercentage() + "%");

        ICertifiable course1 = new ShortCourse();
        ICertifiable course2 = new FulltimeCourse();

        course1.generateCertificate();
        course2.generateCertificate();
    }
}
