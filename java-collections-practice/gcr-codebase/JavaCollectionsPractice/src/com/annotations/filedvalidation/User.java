package com.annotations.filedvalidation;

import java.lang.reflect.Field;

public class User {

	@MaxLength(10)
    private String username;

    public User(String username) {

        // validate using reflection
        validate(username);

        this.username = username;
    }

    private void validate(String value) {
        try {
            Field field = this.getClass().getDeclaredField("username");

            MaxLength maxLength =
                    field.getAnnotation(MaxLength.class);

            if (maxLength != null) {
                int limit = maxLength.value();

                if (value.length() > limit) {
                    throw new IllegalArgumentException(
                        "Username length must not exceed " + limit
                    );
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}
