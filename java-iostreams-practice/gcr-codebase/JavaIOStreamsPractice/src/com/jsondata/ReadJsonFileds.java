package com.jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONArray;
import org.json.JSONObject;

public class ReadJsonFileds {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/jsonfiles/students.json"));

            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();

            JSONArray array = new JSONArray(sb.toString());

            for (int i = 0; i < array.length(); i++) {

                JSONObject obj = array.getJSONObject(i);

                String name = obj.getString("name");
                String email = obj.getString("email");

                System.out.println(name + " : " + email);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
