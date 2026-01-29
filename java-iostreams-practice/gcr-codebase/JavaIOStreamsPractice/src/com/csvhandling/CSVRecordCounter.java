package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVRecordCounter {
	public static void main(String[] args) {
		String filePath = "src/source/employees.csv";
		String line;
		int countRows = 0;
		boolean isHeader = true;
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			
			while((line = br.readLine()) != null) {
				//skip header
				if(isHeader) {
					isHeader = false;
					continue;// we can also use br.readLine()
				}
				
				if (!line.trim().isEmpty()) {
					countRows++;
				}
			}
			System.out.println("Total records (excluding header): " + countRows);
			
		}catch (Exception e) {
			System.out.println("File Not Found !!");
			e.printStackTrace();
		}
	}
}
