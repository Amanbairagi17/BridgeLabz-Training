package com.annotations.serialization;

public class Main {
    public static void main(String[] args) {

        User user =
            new User("Aman", 23, "secret123");

        String json = JsonSerializer.toJson(user);

        System.out.println(json);
    }
}
