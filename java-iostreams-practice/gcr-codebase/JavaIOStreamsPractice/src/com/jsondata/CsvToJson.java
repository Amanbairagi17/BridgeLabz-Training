package com.jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.JSONArray;
import org.json.JSONObject;

public class CsvToJson {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/jsonfiles/students.csv"));

            // read header
            String[] headers = br.readLine().split(",");

            JSONArray jsonArray = new JSONArray();
            String line;

            // read rows
            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");

                JSONObject obj = new JSONObject();

                for (int i = 0; i < headers.length; i++) {
                    obj.put(headers[i], values[i]);
                }

                jsonArray.put(obj);
            }

            br.close();

            // write JSON file
            FileWriter fw = new FileWriter("src/jsonfiles/studentss.json");
            fw.write(jsonArray.toString(4));
            fw.close();

            System.out.println("CSV converted to JSON successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
