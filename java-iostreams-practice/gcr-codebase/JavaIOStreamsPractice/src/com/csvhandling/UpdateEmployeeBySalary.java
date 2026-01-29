package com.csvhandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateEmployeeBySalary {
	public static void main(String[] args) {

        //File path 
        String inputFilePath = "src/source/employees.csv";
        String outputFilePath = "src/source/updated_employees.csv";

        String line;
        boolean isHeader = true;

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))
        ) {

            //logic to update file 
            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    bw.write(line);
                    bw.newLine();
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                String updatedRecord =
                        id + "," +
                        name + "," +
                        department + "," +
                        salary;

                bw.write(updatedRecord);
                bw.newLine();
            }

            // print final result and print path of file
            System.out.println("Employee salary update completed successfully.");
            System.out.println("Updated file created: " + outputFilePath);

        } catch (IOException e) {
            System.out.println("Error while processing the CSV file.");
            e.printStackTrace();
        }
    }
}
