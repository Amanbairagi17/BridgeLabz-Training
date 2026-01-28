package com.annotations.serialization;

import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object object) {

        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = object.getClass().getDeclaredFields();

        boolean first = true;

        for (Field field : fields) {

            if (!field.isAnnotationPresent(JsonField.class)) {
                continue;
            }

            JsonField annotation =
                    field.getAnnotation(JsonField.class);

            String jsonKey = annotation.name();

            field.setAccessible(true);

            try {
                Object value = field.get(object);

                if (!first) {
                    json.append(", ");
                }

                json.append("\"")
                    .append(jsonKey)
                    .append("\": ");

                // string values need quotes
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                first = false;

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }
}
