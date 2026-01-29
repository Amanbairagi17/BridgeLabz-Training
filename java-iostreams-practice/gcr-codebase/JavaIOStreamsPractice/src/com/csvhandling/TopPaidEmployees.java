package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TopPaidEmployees{

    public static void main(String[] args) {

        //variable and list declaration
        String filePath = "src/source/employees.csv";
        String line;

        boolean isHeader = true;

        List<Employees> employees = new ArrayList<>();

        //fetching data from file and adding it into a list
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                employees.add(new Employees(id, name, department, salary));
            }

        } catch (IOException e) {
            System.out.println("Error while reading the CSV file.");
            e.printStackTrace();
            return;
        }
        
        //sort list based on salary using method reference
        employees.sort(Comparator.comparingDouble(Employees::getSalary).reversed());

       //display top 5 employee
        System.out.println("Top 5 Highest Paid Employees");
        System.out.println("-----------------------------");

        int limit = Math.min(5, employees.size());

        for (int i = 0; i < limit; i++) {
            Employees emp = employees.get(i);
            System.out.println(
                    emp.getName() + " | " +
                    emp.getDepartment() + " | " +
                    emp.getSalary()
            );
        }
    }
}

