package com.reflections.objectmapper;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("id", 101);
        data.put("name", "Aman");
        data.put("marks", 89.5);

        Student student =
                ObjectMapperUtil.toObject(Student.class, data);

        System.out.println(student);
    }
}

