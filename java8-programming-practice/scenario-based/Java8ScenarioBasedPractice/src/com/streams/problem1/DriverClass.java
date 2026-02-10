package com.streams.problem1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DriverClass {
	public static void main(String[] args) {
		Employee[] employees = {
			    new Employee(1, "Aman", 23, "Male", "Sales",
			            LocalDate.of(2001, 5, 15), 50000),

			    new Employee(2, "Riya", 25, "Female", "HR",
			            LocalDate.of(1999, 8, 10), 45000),

			    new Employee(3, "Rahul", 28, "Male", "Finance",
			            LocalDate.of(1996, 3, 20), 60000),

			    new Employee(4, "Neha", 26, "Female", "Sales",
			            LocalDate.of(1998, 11, 5), 48000),

			    new Employee(5, "Karan", 30, "Male", "Operations",
			            LocalDate.of(1994, 1, 12), 65000),

			    new Employee(6, "Priya", 24, "Female", "IT",
			            LocalDate.of(2000, 7, 18), 42000),
			    new Employee(7, "Ravi", 21, "Male", "Product Development",
			            LocalDate.of(2002, 9, 8), 82000)
			};
		
		//Question 1
		System.out.println("Male in orgainization");
		System.out.println(Arrays.stream(employees).filter(a -> a.gender.equalsIgnoreCase("male")).count());
		
		System.out.println("Female in orgainization");
		System.out.println(Arrays.stream(employees).filter(a -> a.gender.equalsIgnoreCase("female")).count());
		
		//Question 2
		System.out.println("Department name : ");
		Arrays.stream(employees).map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		//Question 3
		System.out.println("Get average age of male and female : ");
		Arrays.stream(employees)
			      .collect(Collectors.groupingBy(
			              Employee::getGender,
			              Collectors.summarizingInt(Employee::getAge)
			      ))
			      .forEach((g, stats) ->
			              System.out.println(g + " : " + stats.getAverage()));
		
		//Question 4
		System.out.println("find highest salary : ");
		Arrays.stream(employees)
		.max(Comparator.comparingDouble(Employee::getSalary))
		.ifPresent(e -> {
	          System.out.println("Name: " + e.getName());
	          System.out.println("Department: " + e.getDepartment());
	          System.out.println("Salary: " + e.getSalary());
	      });
		
		//Question 5
		System.out.println("Get employee before 1998");
		Arrays.stream(employees)
					.filter(e -> e.getDoj().getYear() > 1998)
					.map(Employee::getName)
					.forEach(System.out::println);
		
		
		//Question 6
		System.out.println("Get department employees : ");
		Map<String, Long> employeeCountByDept =
		        Arrays.stream(employees)
		              .collect(Collectors.groupingBy(
		                      Employee::getDepartment,
		                      Collectors.counting()
		              ));

		employeeCountByDept.forEach((dept, count) ->
		        System.out.println(dept + " : " + count)
		);
		
		
		//Question 7
		System.out.println("Get average Department Salary ");
		Map<String, Double> getDeptAvgSalary = 
				Arrays.stream(employees)
					.collect(Collectors.groupingBy(
							Employee::getDepartment,
							Collectors.averagingDouble(Employee::getSalary)));
		getDeptAvgSalary.forEach((d,s) -> 
					System.out.println(d + " : " +s)
				);
		
		
		//Question 8
		System.out.println("Minimum Salary of male employee from product development");
		Arrays.stream(employees)
			.filter(e -> e.getDepartment().equalsIgnoreCase("product development"))
			.filter(s -> s.getGender().equalsIgnoreCase("male"))
			.min(Comparator.comparingDouble(Employee::getSalary))
			.ifPresent(e -> System.out.println(e.getName() + " " + e.getSalary()));
		
		
		//Question 9
		System.out.println("Find who has more work experience : ");
		Arrays.stream(employees)
			.min(Comparator.comparing(Employee::getDoj))
			.ifPresent(e -> 
				System.out.print(e.getName() + " : " +e.getDoj())
					);
		
		
		//Question 10 
		System.out.println("Find how many male and female working in salse team ");
		int count =(int) Arrays.stream(employees)
			  .filter(s -> s.getDepartment().equalsIgnoreCase("sales"))
			  .count();
		System.out.println(count);
		
		
		//Question 11
		System.out.println("Average salary of male of oragainization : ");
		double avgSalaryMale = Arrays.stream(employees).filter(a -> a.gender.equalsIgnoreCase("male"))
				.collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(avgSalaryMale);
		
		System.out.println("Average salary of female of orgainization : ");
		double avgSalaryFemale = Arrays.stream(employees).filter(a -> a.gender.equalsIgnoreCase("female"))
				.collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(avgSalaryFemale);
		
		
		//Question 12
		System.out.println("List down the names of all employees in each department : ");
		Arrays.stream(employees)
	      .collect(Collectors.groupingBy(
	              Employee::getDepartment,
	              Collectors.mapping(Employee::getName, Collectors.toList())
	      ))
	      .forEach((dept, names) ->
	              System.out.println(dept + " : " + names)
	      );
			  
		//Question 13
		System.out.println("What is the average salary and total salary of the whole organization : ");
		double avgSalary =
		        Arrays.stream(employees)
		              .collect(Collectors.averagingDouble(Employee::getSalary));

		double totalSalary =
		        Arrays.stream(employees)
		              .mapToDouble(Employee::getSalary)
		              .sum();

		System.out.println("Average Salary : " + avgSalary);
		System.out.println("Total Salary   : " + totalSalary);
		
		//Question 14
		System.out.println("Find Employees those salary is to more than 45K ");
		List<Employee> employees2 = Arrays.stream(employees)
				.filter(s -> s.getSalary() > 45000)
				.toList();
		employees2.forEach(System.out::println);
		
		//Question 15
		System.out.println("Highest paid employee in the orgainization : ");
		System.out.println(Arrays.stream(employees)
				.max(Comparator.comparing(Employee::getSalary)));
		
		//Question 16
		System.out.println("Second highest paid employee in the organization :");
		Arrays.stream(employees)
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(1)
				.findFirst()
				.ifPresent(e -> 
							System.out.println(e.getName() + " : " + e.getDepartment() + " : " +e.getSalary())
						);
		
		//Question 17
		System.out.println("Third highest paid employee in the organization :");
		Arrays.stream(employees)
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(2)
				.findFirst()
				.ifPresent(e -> 
							System.out.print(e.getName() + " : " + e.getDepartment() + " : " +e.getSalary())
						);
		//Question 18
		System.out.println(" Lowest paid employee in the organization :");
		Arrays.stream(employees)
				.sorted(Comparator.comparing(Employee::getSalary))
				.findFirst()
				.ifPresent(e -> 
							System.out.println(e.getName() + " : " + e.getDepartment() + " : " +e.getSalary())
						);
		
		//Question 19
		System.out.println(" Lowest paid employee in the organization :");
		Arrays.stream(employees)
				.sorted(Comparator.comparing(Employee::getSalary))
				.skip(1)
				.findFirst()
				.ifPresent(e -> 
							System.out.println(e.getName() + " : " + e.getDepartment() + " : " +e.getSalary())
						);
		//Question 20
		System.out.println("Five lowest paid employees : ");
		List<Employee> lowestFiveEmployees = Arrays.stream(employees)
	              .sorted(Comparator.comparingDouble(Employee::getSalary)) // ascending
	              .limit(5)
	              .toList(); 
		lowestFiveEmployees.forEach(System.out::println);
		
		//Question 21
				System.out.println("Five lowest paid employees : ");
				List<Employee> highestFiveEmployees = Arrays.stream(employees)
			              .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()) // ascending
			              .limit(5)
			              .toList(); 
				highestFiveEmployees.forEach(System.out::println);

		

	}
}
