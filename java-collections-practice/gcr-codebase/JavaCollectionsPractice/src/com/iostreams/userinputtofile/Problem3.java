package com.iostreams.userinputtofile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        FileWriter writer = null;

        try {

            // Read user input
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Write data to file
            writer = new FileWriter("user_details.txt");

            writer.write("User Details\n");
            writer.write("------------------\n");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");
            writer.flush();   
            writer.close(); 
            
            BufferedReader fileReader =
                    new BufferedReader(new FileReader("user_details.txt"));

            String line;

            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }


            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error while reading or writing data.");
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
       
    }
}
