package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployeeByName {
	public static void main(String[] args) {

        String filePath = "src/source/employees.csv";
        String line;

        boolean isHeader = true;
        boolean found = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String searchName = sc.nextLine().trim();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            while ((line = br.readLine()) != null) {

                // skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String name = data[1];

                // case-insensitive match
                if (name.equalsIgnoreCase(searchName)) {

                    String department = data[2];
                    String salary = data[3];

                    System.out.println("\nEmployee Found ");
                    System.out.println("-----------------");
                    System.out.println("Name       : " + name);
                    System.out.println("Department : " + department);
                    System.out.println("Salary     : " + salary);

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nEmployee not found ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
	}
}
