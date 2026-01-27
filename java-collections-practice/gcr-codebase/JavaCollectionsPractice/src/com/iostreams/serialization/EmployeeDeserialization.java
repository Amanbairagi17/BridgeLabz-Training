package com.iostreams.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class EmployeeDeserialization {

    public static void main(String[] args) {

        try (
            FileInputStream fis =
                    new FileInputStream("employees.dat");
            ObjectInputStream ois =
                    new ObjectInputStream(fis)
        ) {

            List<Employee> employees =
                    (List<Employee>) ois.readObject();

            System.out.println("===== EMPLOYEE LIST =====");

            for (Employee emp : employees) {
                System.out.println(emp);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found.");
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
