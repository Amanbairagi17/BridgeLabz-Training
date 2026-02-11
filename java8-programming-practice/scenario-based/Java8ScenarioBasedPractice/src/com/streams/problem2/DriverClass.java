package com.streams.problem2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DriverClass {
	public static void main(String[] args) {
		Student[] students = {
				new Student("Aman",   101, 21, "Male",   "Indore",  62, "9876543210", "Computer Science"),
				new Student("Aman",   113, 20, "Male",   "Bhopal",  92, "9899543210", "Art Science"),
			    new Student("Riya",   102, 20, "Female", "Bhopal",  45, "9876543211", "Mechanical Engineering"),
			    new Student("Rahul",  103, 22, "Male",   "Delhi",  98, "9876543212", "Electrical Engineering"),
			    new Student("Sneha",  104, 21, "Female", "Indore", 83, "9876543213", "Computer Science"),
			    new Student("Kunal",  105, 23, "Male",   "Mumbai", 25, "9876543214", "Civil Engineering"),
			    new Student("Pooja",  106, 20, "Female", "Pune",   78, "9876543215", "Information Technology"),
			    new Student("Arjun",  107, 22, "Male",   "Delhi",  15, "9876543216", "Mechanical Engineering"),
			    new Student("Neha",   108, 21, "Female", "Mumbai", 10, "9876543217", "Computer Science"),
			    new Student("Vikas",  109, 24, "Male",   "Indore", 30, "9876543218", "Civil Engineering"),
			    new Student("Anjali", 110, 19, "Female", "Bhopal", 92, "9876543219", "Electronics Engineering"),
			    new Student("Rohit",  111, 23, "Male",   "Pune",   20, "9876543220", "Information Technology"),
			    new Student("Kavya",  112, 21, "Female", "Delhi",  77, "9876543221", "Computer Science")
		};
		
		// Filtering & Mapping
		System.out.println("Print all students whose rank is less than 50.");
		Arrays.stream(students).filter(s -> s.getRank() < 50).forEach(System.out::println);
		
		System.out.println(" Print all students whose age is greater than 25. " );
		Arrays.stream(students).filter(s -> s.getAge() > 25).forEach(System.out::println);
		
		
		System.out.println("Print the names of all students only");
		Arrays.stream(students).map(s -> s.name).forEach(System.out::println);
		
		
		System.out.println("Print all students belonging to Mechanical Engineering");
		Arrays.stream(students)
	       .filter(s -> s.getStream().equals("Mechanical Engineering")).forEach(s -> System.out.println(s.getName() + " : " + s.getRank() ));
		
		System.out.println("Print all students not from Mumbai ");
		Arrays.stream(students).filter(s -> !s.getCity().equals("Mumbai")).forEach(s -> System.out.println(s.getName() + " : " + s.getCity() ));

		//Sorting & Limiting
		System.out.println("Sort students by rank ascending");
		Arrays.stream(students).sorted(Comparator.comparing(Student::getRank)).forEach(s -> System.out.println(s.getRank() + " : " + s.getName() ));
		
		System.out.println("Sort students by rank descending");
		Arrays.stream(students).sorted(Comparator.comparing(Student::getRank).reversed()).forEach(s -> System.out.println(s.getRank() + " : " + s.getName() ));
		
		System.out.println("Print top 5 students based on rank.");
		Arrays.stream(students).sorted(Comparator.comparing(Student::getRank).reversed())
			.limit(5)
			.forEach(s -> System.out.println(s.getRank() + " : " + s.getName() ));
		
		System.out.println("Print last 3 students based on rank");
		Arrays.stream(students).sorted(Comparator.comparing(Student::getRank))
			.limit(3)
			.forEach(s -> System.out.println(s.getRank() + " : " + s.getName() ));
		
		System.out.println("Print students sorted by name and then rank.");
//		Arrays.stream(students)
//				.sorted((a,b) ->{
//					if(!a.getName().equalsIgnoreCase(b.getName())) return a.getName().compareTo(b.getName());
//					return Integer.compare(b.getRank(), a.getRank());
//				})
//				.forEach(System.out::println);
		Arrays.stream(students)
	      .sorted(Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER)
	                        .thenComparingInt(Student::getRank))
	      .forEach(System.out::println);

		//Grouping & Aggregation
		System.out.println("Count the number of students in each department.");
//		Map<String, Long> groupByName = Arrays.stream(students)
//				.collect(Collectors.groupingBy(Student::getStream
//						,Collectors.counting()));
//		groupByName.forEach((k,v) -> System.out.println(k + " : " +v));

		System.out.println("Count the number of students in each department.");
		Map<String, List<Student>> groupByName = Arrays.stream(students)
				.collect(Collectors.groupingBy(Student::getStream));
		groupByName.forEach((k,v) -> System.out.println(k + " : " +v));
		
		System.out.println("Count the number of students in each city");
		Map<String, Long> countByCity = Arrays.stream(students)
				.collect(Collectors.groupingBy(Student::getCity, Collectors.counting()));
		
		countByCity.forEach((k,v) -> System.out.println(k + " : " + v));
		
		System.out.println("Find the average age of students in each department ");
		Map<String, Double> averageAgeByDepartment = Arrays.stream(students)
				.collect(Collectors.groupingBy(Student::getCity, Collectors.averagingDouble(Student::getAge)));
		
		averageAgeByDepartment.forEach((k,v) -> System.out.println(k + " : " + v));
		
		System.out.println("Find the average rank of students by gender ");
		Map<String, Double> averageRankByGender = Arrays.stream(students)
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getRank)));
		
		averageRankByGender.forEach((k,v) -> System.out.println(k + " : " + v));
		
		System.out.println("Find the total number of students in the organization ");
		int count = (int) Arrays.stream(students).count();
		System.out.println(count);
		
		System.out.println("Find the department with the highest average rank");
		Map<String, Double> averageRankByDepartment =
		        Arrays.stream(students).collect(Collectors.groupingBy(Student::getStream,
		                      Collectors.averagingInt(Student::getRank)
		              ));
		averageRankByDepartment.forEach((k,v) -> System.out.println(k + " : " + v));

		//Min / Max / Ranking Problems
		System.out.println("Find the student with the best (lowest) rank");
//		Arrays.stream(students)
//			.sorted(Comparator.comparing(Student::getRank)).limit(1).forEach(System.out::println);
		Arrays.stream(students)
	      .min(Comparator.comparingInt(Student::getRank))
	      .ifPresent(System.out::println);
		
		System.out.println("Find the student with the worst (highest) rank");
		Arrays.stream(students)
			.sorted(Comparator.comparing(Student::getRank).reversed()).limit(1).forEach(System.out::println);
//		Arrays.stream(students)
//	      .max(Comparator.comparingInt(Student::getRank))
//	      .ifPresent(System.out::println);

		System.out.println("Find the second best rank holder.");
		Arrays.stream(students)
		.sorted(Comparator.comparing(Student::getRank).reversed()).skip(1).findFirst().ifPresent(System.out::println);
		
		System.out.println("Find the second third rank holder.");
		Arrays.stream(students)
		.sorted(Comparator.comparing(Student::getRank).reversed()).skip(2).findFirst().ifPresent(System.out::println);
		
		
		
		System.out.println("Find youngest student");
		Arrays.stream(students)
		.sorted(Comparator.comparing(Student::getAge)).limit(1).forEach(System.out::println);
		
		
		System.out.println("Find oldest student");
		Arrays.stream(students)
		.sorted(Comparator.comparing(Student::getAge).reversed()).limit(1).forEach(System.out::println);
		
		
		System.out.println("Print all contact numbers of all students");
		Arrays.stream(students).map(Student::getContact).distinct().forEach(System.out::println);
		
		
		System.out.println("Count the total number of contact numbers");
		int countContact = (int)Arrays.stream(students).map(Student::getContact).count();
		System.out.println(countContact);
		
		
		System.out.println("Find students who have more than one contact number");
		Arrays.stream(students)
	      .collect(Collectors.groupingBy(Student::getName))
	      .values().stream()
	      .filter(list -> list.size() > 1)
	      .flatMap(List::stream)
	      .forEach(System.out::println);
		
//		System.out.println("Print all character of name");
//		Arrays.stream(students)
//			.map(Student::getName)
//			.flatMap(name -> name.chars().mapToObj(c -> (char)c))
//			.forEach(System.out::print);

		System.out.println("Print unique contact numbers");
		Arrays.stream(students)
			.map(Student::getName)
			.distinct().forEach(System.out::println);
				
		
		
		
		
		
		/**

	FlatMap & Collections

1.

2.Count the total number of contact numbers.

3.Find students who have more than one contact number.

4.


		 */
	}
	
}
