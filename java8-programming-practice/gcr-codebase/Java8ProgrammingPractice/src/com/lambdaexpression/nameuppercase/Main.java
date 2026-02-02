package com.lambdaexpression.nameuppercase;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = List.of(
				new Employee("Aman"),
				new Employee("Ravi"),
				new Employee("Kotteswara"),
				new Employee("kartik"),
				new Employee("Raviraj")
				);
		List<String> employees2 = employees.stream()
		        .map(e -> e.getName().toUpperCase())
		        .collect(Collectors.toList());
                                             
        employees2.forEach(System.out::println);
	}
}
