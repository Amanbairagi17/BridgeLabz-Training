package com.regex.smartresumefilteringsystem;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {

    // regex patterns
    private static final String EMAIL_REGEX =
            "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

    private static final String PHONE_REGEX =
            "(\\+91[- ]?)?[6-9][0-9]{9}";

    private static final String KEYWORD_REGEX =
            "(Java|Python|Spring)";

    public static void main(String[] args) {

        File folder = new File("resumes");

        // email -> resume data
        Map<String, ResumeData> resumeMap = new HashMap<>();

        List<ResumeData> sortedCandidates = new ArrayList<>();

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Resume folder not found.");
            return;
        }

        File[] files = folder.listFiles();

        for (File file : files) {

            try {

                // Accept only txt and pdf
                if (!file.getName().endsWith(".txt") &&
                    !file.getName().endsWith(".pdf")) {
                    throw new InvalidFormatException("Invalid file: " + file.getName());
                }

                String content = readFile(file);

                String email = extractPattern(content, EMAIL_REGEX);
                String phone = extractPattern(content, PHONE_REGEX);
                int keywordCount = countKeywords(content);

                if (email == null)
                    throw new Exception("Email not found in " + file.getName());

                ResumeData data =
                        new ResumeData(email, phone, keywordCount, file.getName());

                resumeMap.put(email, data);
                sortedCandidates.add(data);

            } catch (Exception e) {
                System.out.println("Skipped → " + e.getMessage());
            }
        }

        // Sort by keyword count (descending)
        sortedCandidates.sort(
                (a, b) -> b.keywordCount - a.keywordCount
        );

        System.out.println("\n===== SORTED CANDIDATES =====");
        for (ResumeData r : sortedCandidates) {
            System.out.println(r);
        }
    }

    //readfile
    private static String readFile(File file) throws IOException {

        StringBuilder sb = new StringBuilder();

        BufferedReader br =
                new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line).append(" ");
        }

        br.close();
        return sb.toString();
    }

   //regex extraction
    private static String extractPattern(String text, String regex) {

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find())
            return matcher.group();

        return null;
    } 

    //keyword count
    private static int countKeywords(String text) {

        Pattern pattern =
                Pattern.compile(KEYWORD_REGEX, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find())
            count++;

        return count;
    }
}
