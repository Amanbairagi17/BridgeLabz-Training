package com.iostreams.readlargefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem9 {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Deep Computers\\OneDrive\\Desktop\\Java Programming Workspace\\java-collections-practice\\gcr-codebase\\JavaCollectionsPractice\\src\\com\\iostreams\\readlargefile\\large_log_file.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // case-insensitive check
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
