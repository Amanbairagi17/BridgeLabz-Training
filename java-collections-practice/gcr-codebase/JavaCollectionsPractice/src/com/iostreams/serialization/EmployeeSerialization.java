package com.iostreams.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class EmployeeSerialization {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Aman", "IT", 50000));
        employees.add(new Employee(102, "Rohit", "HR", 42000));
        employees.add(new Employee(103, "Neha", "Finance", 60000));

        try (
            FileOutputStream fos =
                    new FileOutputStream("employees.dat");
            ObjectOutputStream oos =
                    new ObjectOutputStream(fos)
        ) {

            oos.writeObject(employees);

            System.out.println("Employees serialized successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
