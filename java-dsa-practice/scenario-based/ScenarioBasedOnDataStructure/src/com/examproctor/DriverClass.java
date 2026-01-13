package com.examproctor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Question bank
        Map<Integer, Question> questionBank = new HashMap<>();
        questionBank.put(1, new Question(1, "A", 2));
        questionBank.put(2, new Question(2, "B", 2));
        questionBank.put(3, new Question(3, "C", 2));
        questionBank.put(4, new Question(4, "D", 2));

        StudentExamSession session = new StudentExamSession();
        ExamProctorManager proctor = new ExamProctorManager();

        while (true) {
            System.out.println("\n--- Online Exam System ---");
            System.out.println("1. Visit Question");
            System.out.println("2. Answer Question");
            System.out.println("3. Go Back");
            System.out.println("4. Submit Exam");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Question ID: ");
                    int qId = sc.nextInt();
                    sc.nextLine();

                    if (questionBank.containsKey(qId)) {
                        session.visitQuestion(qId);
                    } else {
                        System.out.println("Invalid Question ID");
                    }
                }

                case 2 -> {
                    System.out.print("Enter Question ID: ");
                    int qId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Answer: ");
                    String ans = sc.nextLine();

                    session.answerQuestion(qId, ans);
                }

                case 3 -> session.goBack();

                case 4 -> {
                    int score = proctor.calculateScore(
                            questionBank,
                            session.answers);

                    System.out.println("Exam Submitted!");
                    System.out.println("Final Score: " + score);
                    return;
                }

                case 0 -> {
                    System.out.println("Exiting Exam System...");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
	}
}
