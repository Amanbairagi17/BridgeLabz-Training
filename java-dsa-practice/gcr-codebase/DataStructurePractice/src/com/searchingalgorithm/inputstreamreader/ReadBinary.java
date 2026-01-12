package com.searchingalgorithm.inputstreamreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadBinary {
	public static void main(String[] args) {
        try {
        	FileInputStream fis = new FileInputStream("C:\\Users\\Deep Computers\\OneDrive\\Desktop\\Java Programming Workspace\\java-dsa-practice\\gcr-codebase\\DataStructurePractice\\src\\input.txt");
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
