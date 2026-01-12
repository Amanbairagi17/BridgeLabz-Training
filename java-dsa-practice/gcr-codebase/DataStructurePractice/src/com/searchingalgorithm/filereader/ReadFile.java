package com.searchingalgorithm.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	 public static void main(String[] args) {

	        try {
	        	//mention whole path of file 
	        	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Deep Computers\\OneDrive\\Desktop\\Java Programming Workspace\\java-dsa-practice\\gcr-codebase\\DataStructurePractice\\src\\input.txt"));
	            String line;

	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	        } 
	        catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
