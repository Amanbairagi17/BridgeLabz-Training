package com.iostreams.studentdatastream;
import java.io.*;

public class Problem7 {
    public static void main(String[] args) {

        String fileName = "student.dat";

        // write data using DataOutputStream
        try (
            FileOutputStream fos = new FileOutputStream(fileName);
            DataOutputStream dos = new DataOutputStream(fos)
        ) {

            int rollNumber = 101;
            String name = "Aman";
            double gpa = 8.75;

            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // read data using DataOutputStream
        try (
            FileInputStream fis = new FileInputStream(fileName);
            DataInputStream dis = new DataInputStream(fis)
        ) {

            int roll = dis.readInt();
            String studentName = dis.readUTF();
            double studentGpa = dis.readDouble();

            System.out.println("\n Student Detail : ");
            System.out.println("Roll Number : " + roll);
            System.out.println("Name        : " + studentName);
            System.out.println("GPA         : " + studentGpa);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
