package com.regex.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner {

    // valid answer: A B C D
    private static final Pattern ANSWER_PATTERN =
            Pattern.compile("^[A-D](,[A-D])*$");

    // official answer key
    private static final List<String> ANSWER_KEY =
            List.of("A", "B", "C", "D", "A", "B", "C");

    public static void main(String[] args) {

        File file = new File("src/com/regex/source/answersheet/math.csv");

        Map<String, Integer> scoreMap = new HashMap<>();

        // max-heap → highest score first
        PriorityQueue<Map.Entry<String, Integer>> ranking =
                new PriorityQueue<>(
                        (a, b) -> b.getValue() - a.getValue()
                );

        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {

                try {
                    processLine(line, scoreMap);
                } catch (Exception e) {
                    System.out.println("Skipped → " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        ranking.addAll(scoreMap.entrySet());

        System.out.println("\n RESULT RANKING");

        while (!ranking.isEmpty()) {
            var entry = ranking.poll();
            System.out.println(
                    entry.getKey() + " : " + entry.getValue()
            );
        }
    }


    private static void processLine(
            String line,
            Map<String, Integer> scoreMap) {

        String[] parts = line.split(",");

        // name + answers count validation
        if (parts.length != ANSWER_KEY.size() + 1)
            throw new RuntimeException("Invalid comma format");

        String name = parts[0];

        String answerPart =
                String.join(",", Arrays.copyOfRange(parts, 1, parts.length));

        // regex validation
        if (!ANSWER_PATTERN.matcher(answerPart).matches())
            throw new RuntimeException("Invalid option detected");

        List<String> studentAnswers =
                Arrays.asList(answerPart.split(","));

        AnswerSheet<String> sheet =
                new MathAnswerSheet(studentAnswers);

        int score = evaluate(sheet);

        scoreMap.put(name, score);
    }


    private static int evaluate(AnswerSheet<String> sheet) {

        int score = 0;

        for (int i = 0; i < ANSWER_KEY.size(); i++) {
            if (sheet.getAnswers().get(i)
                    .equals(ANSWER_KEY.get(i)))
                score++;
        }
        return score;
    }
}
