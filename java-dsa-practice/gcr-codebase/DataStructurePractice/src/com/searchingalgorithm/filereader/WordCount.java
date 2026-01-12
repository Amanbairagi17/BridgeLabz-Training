package com.searchingalgorithm.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String targetWord = "java";
        int count = 0;

        try{
        	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Deep Computers\\OneDrive\\Desktop\\Java Programming Workspace\\java-dsa-practice\\gcr-codebase\\DataStructurePractice\\src\\input.txt"));
            String line;
            while ((line = br.readLine()) != null) {

                // Split line into words
                String[] words = line.split(" ");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) count++;
                }
            }

            System.out.println(targetWord + " " + count);

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}