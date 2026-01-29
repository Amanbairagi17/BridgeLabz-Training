package com.csvhandling;

import java.io.FileWriter;

public class Employee {
	public static void main(String[] args) {
		String filePath = "src/source/employees.csv";
		
		try(FileWriter fw = new FileWriter(filePath)){
			//header of file
			fw.append("ID,Name,Department,Salary\n");
			
			 fw.append("101,Aman,IT,55000\n");
	         fw.append("102,Rahul,HR,48000\n");
	         fw.append("103,Priya,Finance,62000\n");
	         fw.append("104,Neha,Marketing,50000\n");
	         fw.append("105,Arjun,Development,70000\n");
	         
	         
	         System.out.println("CSV File Created Successfully");
		}catch (Exception e) {
			System.out.println("File not found, Operation failed!!");
			e.printStackTrace();
		}
	}
}
