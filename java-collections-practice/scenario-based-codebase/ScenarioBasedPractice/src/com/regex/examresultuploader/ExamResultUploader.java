package com.regex.examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultUploader {

    // RollNo,Name,Subject,Marks
    private static final Pattern CSV_PATTERN =
            Pattern.compile("\\d+,[A-Za-z ]+,[A-Za-z]+,\\d{1,3}");

    public static void main(String[] args) {

        String fileName = "src/com/regex/source/marks.csv";

        // subject → marks list
        Map<String, List<Integer>> subjectMarks = new HashMap<>();

        // subject → top scorer
        Map<String, PriorityQueue<ExamRecord<ExamType>>> toppers =
                new HashMap<>();

        try (BufferedReader br =
                     new BufferedReader(new FileReader(fileName))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                try {
                    ExamRecord<ExamType> record =
                            parseLine(line, ExamType.FINALS);

                    subjectMarks
                            .computeIfAbsent(
                                    record.getSubject(),
                                    k -> new ArrayList<>())
                            .add(record.getMarks());

                    toppers
                            .computeIfAbsent(
                                    record.getSubject(),
                                    k -> new PriorityQueue<>(
                                            (a, b) ->
                                                    b.getMarks() - a.getMarks()
                                    ))
                            .add(record);

                } catch (InvalidRecordException e) {
                    System.out.println("Skipped -> " + e.getMessage());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // display subject-wise marks
        System.out.println("SUBJECT WISE MARKS ");

        subjectMarks.forEach((sub, list) ->
                System.out.println(sub + " : " + list));

        // Display toppers
        System.out.println("TOP SCORER PER SUBJECT ");

        toppers.forEach((subject, pq) -> {
            ExamRecord<ExamType> top = pq.peek();
            System.out.println(
                    subject + " -> " +
                    top.getName() +
                    " (" + top.getMarks() + ")"
            );
        });
    }

    private static ExamRecord<ExamType> parseLine(
            String line,
            ExamType examType)
            throws InvalidRecordException {

        if (!CSV_PATTERN.matcher(line).matches())
            throw new InvalidRecordException(
                    "Invalid format: " + line);

        String[] data = line.split(",");

        int roll = Integer.parseInt(data[0]);
        String name = data[1];
        String subject = data[2];
        int marks = Integer.parseInt(data[3]);

        if (marks < 0 || marks > 100)
            throw new InvalidRecordException(
                    "Invalid marks: " + line);

        return new ExamRecord<>(
                roll, name, subject, marks, examType);
    }
}
