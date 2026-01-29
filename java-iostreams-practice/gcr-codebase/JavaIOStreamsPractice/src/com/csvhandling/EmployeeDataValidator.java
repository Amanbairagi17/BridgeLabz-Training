package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class EmployeeDataValidator {

    public static void main(String[] args) {

        // Variable and resource declaration
        String filePath = "src/source/employeedata.csv";
        String line;

        boolean isHeader = true;

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "^[0-9]{10}$";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        //logic to validate email and phone number
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String email = data[2];
                String phone = data[3];

                boolean validEmail = emailPattern.matcher(email).matches();
                boolean validPhone = phonePattern.matcher(phone).matches();

                if (!validEmail || !validPhone) {

                	//display output
                    System.out.println("Invalid record found");
                    System.out.println("Row Data : " + line);

                    if (!validEmail) {
                        System.out.println("Invalid email format");
                    }

                    if (!validPhone) {
                        System.out.println("Phone number must contain exactly 10 digits");
                    }

                    System.out.println();
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading CSV file.");
            e.printStackTrace();
        }
    }
}
