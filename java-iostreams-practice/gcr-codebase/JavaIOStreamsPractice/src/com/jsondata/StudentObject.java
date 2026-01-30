package com.jsondata;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentObject {
    public static void main(String[] args) {

        JSONObject student = new JSONObject();

        student.put("name", "Aman");
        student.put("age", 22);

        JSONArray subjects = new JSONArray();
        subjects.put("Java");
        subjects.put("DSA");
        subjects.put("Spring Boot");

        student.put("subjects", subjects);

        System.out.println(student.toString(4));
    }
}
