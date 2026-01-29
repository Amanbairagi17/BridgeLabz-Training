package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateRecords {

    public static void main(String[] args) {

       //Variable and resource declaration
        String filePath = "src/source/employee.csv";
        String line;

        boolean isHeader = true;

        Set<String> uniqueIds = new HashSet<>();

        //logic to remove duplicate records
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];

                if (!uniqueIds.add(id)) {

                    // Printing output 
                    System.out.println("Duplicate record found:");
                    System.out.println(line);
                    System.out.println();
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading CSV file.");
            e.printStackTrace();
        }
    }
}
