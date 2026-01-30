package com.jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValidator {

    public static void main(String[] args) {

        String json = """
                {
                  "name": "Aman",
                  "age": 22,
                  "email": "aman@gmail.com"
                }
                """;
        String json1 = """
                {
                  "name": "Aman",
                  "age": 22,
                  email": "aman@gmail.com"
                }
                """;

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.readTree(json);   // validation happens here
            System.out.println("Valid JSON structure");

        } catch (Exception e) {
            System.out.println("Invalid JSON structure");
        }
        try {
            mapper.readTree(json1);   // validation happens here
            System.out.println("Valid JSON structure");

        } catch (Exception e) {
            System.out.println("Invalid JSON structure");
        }
    }
}
