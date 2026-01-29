package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ConvertDataIntoObject {
	public static void main(String[] args) {
		String filePath = "src/source/studentcsvreader.csv";
		String line;
		boolean isHeader = true;
		
		List<Student> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			
			while((line = br.readLine()) != null) {
				if(isHeader) {
					isHeader = false;
					continue;
				}
				
				String[] data = line.split(",");
				int id = Integer.parseInt(data[0]);
				String name = data[1];
				int age = Integer.parseInt(data[2]);
				int marks = Integer.parseInt(data[3]);
				
				list.add(new Student(id, name, age, marks));
				
				
			}
			System.out.println("Object created successfully");
			System.out.println(list);
		}catch (Exception e) {
			System.out.println("File Not Found !!");
		}
	}
}
