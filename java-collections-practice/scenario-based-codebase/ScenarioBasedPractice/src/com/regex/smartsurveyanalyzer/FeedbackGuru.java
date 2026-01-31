package com.regex.smartsurveyanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackGuru {

    private static final String RATING_REGEX = "(\\d{1,2})/10";

    public static void main(String[] args) {

        File folder = new File("src/com/regex/source/feedback");

        // Category → feedback messages
        Map<String, List<String>> feedbackMap = new HashMap<>();

        feedbackMap.put("Positive", new ArrayList<>());
        feedbackMap.put("Neutral", new ArrayList<>());
        feedbackMap.put("Negative", new ArrayList<>());

        if (!folder.exists()) {
            System.out.println("Feedback folder not found.");
            return;
        }

        File[] files = folder.listFiles();

        for (File file : files) {

            if (!file.getName().endsWith(".txt"))
                continue;

            processFile(file, feedbackMap);
        }

        System.out.println("\n===== FEEDBACK SUMMARY =====");

        feedbackMap.forEach((k, v) -> {
            System.out.println("\n" + k + " Feedback:");
            v.forEach(System.out::println);
        });
    }


    private static void processFile(
            File file,
            Map<String, List<String>> feedbackMap) {

        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {

                try {

                    Integer rating = extractRating(line);

                    if (rating == null)
                        throw new InvalidFeedbackException(
                                "No rating found");

                    String category = categorize(rating);

                    feedbackMap.get(category).add(line);

                } catch (Exception e) {
                    System.out.println(
                            "Skipped line → " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("File read error: " + file.getName());
        }
    }


    // REGEX extraction
    private static Integer extractRating(String text) {

        Pattern pattern =
                Pattern.compile(RATING_REGEX);

        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            int rating = Integer.parseInt(matcher.group(1));
            if (rating >= 0 && rating <= 10)
                return rating;
        }
        return null;
    }

    // categorization logic
    private static String categorize(int rating) {

        if (rating >= 8)
            return "Positive";

        if (rating >= 5)
            return "Neutral";

        return "Negative";
    }
}
