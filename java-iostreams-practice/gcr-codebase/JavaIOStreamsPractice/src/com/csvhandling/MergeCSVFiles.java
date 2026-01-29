package com.csvhandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {

    public static void main(String[] args) {

        //declare file path and map 
        String studentsFile1 = "src/source/student1.csv";
        String studentsFile2 = "src/source/student2.csv";
        String outputFile = "src/source/merged_students.csv";

        String line;
        boolean isHeader = true;

        Map<String, StudentMarks> marksMap = new HashMap<>();

      
         //Read students2.csv and store marks data using ID
        try (BufferedReader br = new BufferedReader(new FileReader(studentsFile2))) {

            isHeader = true;

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];
                int marks = Integer.parseInt(data[1]);
                String grade = data[2];

                marksMap.put(id, new StudentMarks(marks, grade));
            }

        } catch (IOException e) {
            System.out.println("Error while reading students2.csv");
            e.printStackTrace();
            return;
        }

        //Read students1.csv and merge using ID
        try (
                BufferedReader br = new BufferedReader(new FileReader(studentsFile1));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            isHeader = true;

            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String age = data[2];

                StudentMarks marksData = marksMap.get(id);

                if (marksData != null) {

                    String mergedRow =
                            id + "," +
                            name + "," +
                            age + "," +
                            marksData.getMarks() + "," +
                            marksData.getGrade();

                    bw.write(mergedRow);
                    bw.newLine();
                }
            }

            //Printing output
            System.out.println("CSV files merged successfully.");
            System.out.println("Output file created: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error while merging CSV files.");
            e.printStackTrace();
        }
    }
}
