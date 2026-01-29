package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LargeCSVChucnkReader {

    public static void main(String[] args) {
		//variable and resource declaration
        String filePath = "src/source/large_employees.csv";
        String line;

        int chunkSize = 100;
        int totalRecordsProcessed = 0;

        boolean isHeader = true;

        List<String> buffer = new ArrayList<>(chunkSize);

        // logic to process chunk
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                buffer.add(line);

                if (buffer.size() == chunkSize) {

                    totalRecordsProcessed += processChunk(buffer);

                    buffer.clear();
                }
            }

            if (!buffer.isEmpty()) {
                totalRecordsProcessed += processChunk(buffer);
                buffer.clear();
            }

        } catch (IOException e) {
            System.out.println("Error while reading large CSV file.");
            e.printStackTrace();
            return;
        }

        //display final output
        System.out.println("Total records processed: " + totalRecordsProcessed);
    }

    
    //Processes one chunk of records at a time
    private static int processChunk(List<String> records) {

        int processedCount = records.size();

        System.out.println("Processed records count: " + processedCount);

        return processedCount;
    }
}
