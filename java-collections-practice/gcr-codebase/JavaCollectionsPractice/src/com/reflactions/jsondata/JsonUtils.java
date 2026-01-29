package com.reflactions.jsondata;

import java.lang.reflect.Field;

public class JsonUtils {

    public static String toJson(Object obj) {

        if (obj == null) {
            return "null";
        }

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        StringBuilder json = new StringBuilder();
        json.append("{\n");

        for (int i = 0; i < fields.length; i++) {

            Field field = fields[i];
            field.setAccessible(true);

            try {
                Object value = field.get(obj);

                json.append("  \"")
                    .append(field.getName())
                    .append("\": ");

                // String handling
                if (value instanceof String || value instanceof Character) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(",");
                }

                json.append("\n");

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        json.append("}");
        return json.toString();
    }
}

