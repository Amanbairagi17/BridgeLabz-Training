package com.examproctor;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
public class StudentExamSession {

    private Stack<Integer> navigationStack = new Stack<>();
     Map<Integer, String> answers = new HashMap<>();

    // Visit question
    void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Answer question
    void answerQuestion(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    // Undo navigation
    void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return;
        }
        navigationStack.pop();
        System.out.println("Moved back to previous question");
    }

    public Map<Integer, String> getAnswers() {
        return answers;
    }
}
