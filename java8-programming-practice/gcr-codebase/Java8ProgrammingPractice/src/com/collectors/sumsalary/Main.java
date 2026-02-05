package com.collectors.sumsalary;

import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = List.of(
                new Employee("Aman", "IT", 60000),
                new Employee("Rahul", "HR", 50000),
                new Employee("Sneha", "IT", 70000),
                new Employee("Neha", "HR", 55000),
                new Employee("Raj", "Finance", 65000)
        );
		
		Map<String, Double> avgSalaryByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.averagingDouble(Employee::getSalary)));
		
		avgSalaryByDept.forEach((dept, avgSalary) ->
        System.out.println(dept + " : " + avgSalary));
	}
}
