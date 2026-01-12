package com.searchingalgorithm.filereader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FileAndInputStreamReader {
	private static void readWithFileReader(String path) {
        long start = System.nanoTime();
        long wordCount = 0;

        try{
        	BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    wordCount += line.trim().split(" ").length;
                }
            }

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("FileReader Time : " + (System.nanoTime() - start));
    }

    private static void readWithInputStreamReader(String path) {
        long start = System.nanoTime();
        long wordCount = 0;

        try{
        	FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
         
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    wordCount += line.trim().split(" ").length;
                }
            }

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("InputStreamReader Time : " + (System.nanoTime() - start));
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Deep Computers\\OneDrive\\Desktop\\Java Programming Workspace\\java-dsa-practice\\gcr-codebase\\DataStructurePractice\\src\\input.txt"; 
        readWithFileReader(filePath);
        readWithInputStreamReader(filePath);
    }
}
