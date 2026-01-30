package com.jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;


public class ReadJsonFiles {

    public static void main(String[] args) {

        try {
            // Read JSON file
            BufferedReader br = new BufferedReader(
                    new FileReader("src/jsonfiles/data.json"));

            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();

            // Convert text to JSONObject
            JSONObject json = new JSONObject(sb.toString());

            // Print all keys and values
            for (String key : json.keySet()) {
                System.out.println(key + " : " + json.get(key));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
