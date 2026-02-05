package com.streamapi.transformingnames;

import java.util.Arrays;
import java.util.List;

public class TransformName {
	public static void main(String[] args) {

        List<String> customers = Arrays.asList(
                "aman",
                "rahul",
                "neha",
                "priya",
                "vikas"
        );

        List<String> result =
                customers.stream()
                         .map(String::toUpperCase)   // Convert to uppercase
                         .sorted()                   // Sort alphabetically
                         .toList();

        result.forEach(System.out::println);
    }
}
