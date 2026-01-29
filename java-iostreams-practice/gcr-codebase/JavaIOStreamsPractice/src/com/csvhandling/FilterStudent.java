package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStudent {
	
	public static void main(String[] args) {
		String filePath = "src/source/studentcsvreader.csv";
		String line;
		
		boolean isHeader = true;
		
		 try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	           System.out.println("---- Student Records ----");

	            while ((line = br.readLine()) != null) {
	            	
	            	if(isHeader) {
	            		isHeader = false;
	            		continue;
	            	}
	            	
	                // Split by comma
	                String[] data = line.split(",");

	                int id = Integer.parseInt(data[0]);
	                String name = data[1];
	                int age = Integer.parseInt(data[2]);
	                int marks = Integer.parseInt(data[3]);

	                if(marks > 80) {
	                	System.out.println("ID     : " + id);
	 	                System.out.println("Name   : " + name);
	 	                System.out.println("Age    : " + age);
	 	                System.out.println("Marks  : " + marks);
	 	                System.out.println();
	                }
	                
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }	
	}
}
