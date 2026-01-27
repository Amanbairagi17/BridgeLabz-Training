package com.iostreams.convertlowertoupper;

import java.io.*;

public class Problem6 {
    public static void main(String[] args) {

        File inputFile = new File("C:\\Users\\Deep Computers\\OneDrive\\Desktop\\Java Programming Workspace\\java-collections-practice\\gcr-codebase\\JavaCollectionsPractice\\src\\com\\iostreams\\convertlowertoupper\\input.txt");
        File outputFile = new File("output.txt");

        // UTF-8 encoding handling
        try (
            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream(inputFile), "UTF-8"));

            BufferedWriter writer =
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    new FileOutputStream(outputFile), "UTF-8"))
        ) {

            String line;

            while ((line = reader.readLine()) != null) {

                // Convert uppercase → lowercase
                String lowerCaseLine = line.toLowerCase();

                writer.write(lowerCaseLine);
                writer.newLine();
            }

            System.out.println(" File converted successfully.");
            System.out.println("Output file location:");
            System.out.println(outputFile.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
