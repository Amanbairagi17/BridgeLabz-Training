package com.annotations.filedvalidation;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Aman123");      //  valid
        System.out.println(user1.getUsername());

        User user2 = new User("VeryLongUsername123"); // exception
    }
}
