package com.jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONArray;
import org.json.JSONObject;

public class FilterJsonData {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/jsonfiles/people.json"));

            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();

            JSONArray array = new JSONArray(sb.toString());

            for (int i = 0; i < array.length(); i++) {

                JSONObject obj = array.getJSONObject(i);

                int age = obj.getInt("age");

                if (age > 25) {
                    System.out.println(obj);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
