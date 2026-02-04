package com.functionalinterface.examples;

import java.util.function.Function;

public class  CheckStringLength {

    public static void main(String[] args) {

        int maxLimit = 20;

        // Function to get length of the string
        Function<String, Integer> lengthFunction = str -> str.length();

        //String message = "Welcome to Java Functional";//exceed length is 26
        String message = "Hii Aman";

        int length = lengthFunction.apply(message);//apply method

        if (length > maxLimit) {
            System.out.println("Exceeds character limit");
        } else {
            System.out.println("Within character limit");
        }

        System.out.println("Message Length: " + length);
    }
}
