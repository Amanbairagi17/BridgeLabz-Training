package com.streams.problem2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;


public class DriverClass {
	public static void main(String[] args) {
		Student[] students = {
				new Student("Aman",   101, 21, "Male",   "Indore",  62, "9876543210", "Computer Science"),
				new Student("Aman Bairagi",   113, 20, "Male",   "Bhopal",  92, "9899543210", "Art Science"),
			    new Student("Riya",   102, 20, "Female", "Bhopal",  45, "9876543211", "Mechanical Engineering"),
			    new Student("Rahul Rajoriaya",  103, 22, "Male",   "Delhi",  98, "9876543212", "Electrical Engineering"),
			    new Student("Sneha",  104, 21, "Female", "Indore", 83, "9876543213", "Computer Science"),
			    new Student("Kunal",  105, 23, "Male",   "Mumbai", 25, "9876543214", "Civil Engineering"),
			    new Student("Pooja",  106, 20, "Female", "Pune",   78, "9876543215", "Information Technology"),
			    new Student("Arjun",  107, 22, "Male",   "Delhi",  15, "9876543216", "Mechanical Engineering"),
			    new Student("Neha",   108, 21, "Female", "Mumbai", 10, "9876543217", "Computer Science"),
			    new Student("Vikas",  109, 24, "Male",   "Indore", 30, "9876543218", "Biotech Engineering"),
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
		
		//Conditional & Matching
		System.out.println("Check if any student belongs to Biotech Engineering.");
//		Optional<Student> isContains =  Optional.ofNullable(Arrays.stream(students).filter(s -> s.getStream().equals("Biotech Engineering")).findAny().orElse(null));
//		System.out.println(isContains);
		
		Arrays.stream(students).filter(s -> s.getStream().equals("Biotech Engineering")).forEach(System.out::println);
		
		System.out.println("Check if all students are above age 20.");
//		Optional<Boolean> isAnyAbove20 = Optional.ofNullable(Arrays.stream(students).map(s -> s.getAge() > 20).findAny().orElse(false));
//		System.out.println(isAnyAbove20);
		
		// System.out.println(Arrays.stream(students).allMatch(s -> s.getAge() > 10)); // true
		 System.out.println(Arrays.stream(students).allMatch(s -> s.getAge() > 10)); // false
		 
		 System.out.println("Check if no student belongs to Civil Engineering.");
		 System.out.println(Arrays.stream(students).noneMatch(s -> !s.getStream().equals("Civil Engineering")));
		 
		 //Gender-Based Analysis
		 System.out.println("Count male and female students.");
		 int maleStudents =(int) Arrays.stream(students).filter(s -> s.getGender().equalsIgnoreCase("male")).count();
		 int femaleStudents = students.length - maleStudents;
		 System.out.println("Male Students  " + maleStudents + " and Female Students " +femaleStudents);
		 
		 System.out.println("Find the average age of male students.");
		 double avgAgeOfMaleStudents =  Arrays.stream(students)
				 .filter(s -> s.getGender().equalsIgnoreCase("male"))
		 		.collect(Collectors.averagingDouble(Student::getAge));
		 System.out.println(avgAgeOfMaleStudents);
		 		
		 System.out.println("Find the average age of female students.");
		 double avgAgeOfFemaleStudents =  Arrays.stream(students)
				 .filter(s -> s.getGender().equalsIgnoreCase("female"))
		 		.collect(Collectors.averagingDouble(Student::getAge));
		 System.out.println(avgAgeOfFemaleStudents);
		 
		 System.out.println("Find the highest ranked male student.");
		 Arrays.stream(students)
		 .filter(s -> s.getGender().equalsIgnoreCase("male"))
		 .sorted(Comparator.comparing(Student::getRank).reversed())
		 .limit(1).forEach(System.out::println);
		 

		 System.out.println("Find the highest ranked female student.");
		 Arrays.stream(students)
		 .filter(s -> s.getGender().equalsIgnoreCase("female"))
		 .sorted(Comparator.comparing(Student::getRank).reversed())
		 .limit(1).forEach(System.out::println);

		//Department-Specific Queries
		 System.out.println("List students department-wise with names only.");
		 Arrays.stream(students)
		 		.collect(Collectors.groupingBy(Student::getStream,
		 				Collectors.mapping(Student::getName, Collectors.toList())))
		 		.forEach((k,v) -> System.out.print(k +" : " +v));
		 System.out.println();
		
		System.out.println("Find the youngest student in Computer Engineering/Computer Science.");
		Arrays.stream(students)
				.filter(s -> s.getStream().equalsIgnoreCase("Computer Science"))
				.min(Comparator.comparingDouble(Student::getAge))
				.ifPresent( System.out::println);
		
		System.out.println("Find the top-ranked student in Mechanical Engineering.");
		Arrays.stream(students)
		.filter(s -> s.getStream().equalsIgnoreCase("Mechanical Engineering"))
		.max(Comparator.comparingDouble(Student::getRank))
		.ifPresent( System.out::println);
		
		System.out.println("Count students in Electronics Engineering from Karnataka.");
		Arrays.stream(students)
		.filter(s -> s.getStream().equalsIgnoreCase("Electronics Engineering") && s.getCity().equalsIgnoreCase("Bhopal"))
		.max(Comparator.comparingDouble(Student::getRank))
		.ifPresent( System.out::println);
		
		
		//Advanced Level
		System.out.println("Convert the student list into a Map<Id, Name>.");
		
		Map<Integer, String> map1 = Arrays.stream(students)
				.collect(Collectors.toMap(Student::getId, Student::getName)
						);
		System.out.println(map1);
//		
//		int[] arr = {23,4,5,6,7,72,75,4};
//		System.out.println(Arrays.stream(arr).max().getAsInt());
		
		System.out.println("Convert the student list into a Map<Department, List<Student>>.");
		Map<String, List<Student>> map =
			    Arrays.stream(students)
			            .collect(Collectors.groupingBy(Student::getStream));
		System.out.println(map);
		
		System.out.println("Find students whose name starts with ‘S’.");
		Arrays.stream(students).filter(s -> s.getName().startsWith("S")).forEach(System.out::println);

		System.out.println("Find students whose name length is greater than 5.");
		Arrays.stream(students).filter(s -> s.getName().length() > 5).forEach(System.out::println);
		
		System.out.println("Find students whose rank is even.");
		Arrays.stream(students).filter(s -> s.getRank() % 2 == 0).forEach(System.out::println);
		
		System.out.println("Find students whose rank is odd.");
		Arrays.stream(students).filter(s -> s.getRank() % 2 != 0).forEach(System.out::println);
		
		//Bonus Challenges
		System.out.println("Find the top 3 youngest students.");
		Arrays.stream(students).sorted(Comparator.comparing(Student::getAge)).limit(3).forEach(System.out::println);
		
		System.out.println("Find the top 3 oldest students");
		Arrays.stream(students).sorted(Comparator.comparing(Student::getAge).reversed()).limit(3).forEach(System.out::println);
		
		System.out.println("Partition students based on age > 20.");
		
		Map<Boolean, List<Student>> partitionedList = Arrays.stream(students).collect(Collectors.partitioningBy(s -> s.getAge() > 20));
		List<Student> above25 = partitionedList.get(true);
		System.out.println(above25 + " " + above25.size());
		
		System.out.println("Partition students based on rank > 50.");
		Map<Boolean, List<Student>> partitionedList2 = Arrays.stream(students).collect(Collectors.partitioningBy(s -> s.getRank() > 50));
		List<Student> above50Rank = partitionedList2.get(true);
		
		System.out.println(above50Rank.size());
		System.out.println(above50Rank);
		
		System.out.println("Find the city having maximum students");
		String maximumStudentCity = Arrays.stream(students).collect(Collectors.groupingBy(Student::getCity, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
		System.out.println(maximumStudentCity);
		
		System.out.println("Find the department having minimum students");
		String minimumStundentDepartment = Arrays.stream(students).collect(Collectors.groupingBy(Student::getStream, Collectors.counting()))
				.entrySet().stream().min(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey).orElse(null);
		System.out.println(minimumStundentDepartment);
		
		String string = "stress";
		string.chars()
			.mapToObj(ch -> (char)ch)
			.collect(Collectors.groupingBy(
					c -> c,
				LinkedHashMap::new,
				Collectors.counting())
			).entrySet()
			.stream()
			.filter(e -> e.getValue() == 1)
			.map(Map.Entry::getKey)
			.findFirst().ifPresent(System.out::println);
				
		
		System.out.println("All Non repeating Character");
		String string3 = "programming";
		string3.chars()
		.mapToObj(ch -> (char)ch)
		.collect(Collectors.groupingBy(
				c -> c,
			Collectors.counting())
		).entrySet()
		.stream()
		.filter(e -> e.getValue() == 1)
		.map(Map.Entry::getKey)
		.forEach(System.out::print);
		
		String str = "java is java h toh java is a good laguange";
		Arrays.stream(str.trim().split("\\s+"))
			.collect(Collectors.groupingBy(word -> word, Collectors.counting()))
			.forEach((k,v) -> System.out.println(k + " : " +v));
		
		Map<String, Integer> map2 = Map.of(
				"A", 3,
	            "Z", 1,
	            "C", 2
				);
//		map2.entrySet().stream().sorted((e1, e2) -> e1.getValue() - e2.getValue()).forEach(System.out::println);
		map2.entrySet().stream().sorted( Map.Entry.comparingByValue()).forEach(System.out::println);
		map2.entrySet().stream().sorted( Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("Find SEcond highest word from sentence");
		String stringsString = "java is a good programming language";
		int secondHigestStirng = Arrays.stream(stringsString.split("\\s+"))
				.map(word -> word.length())
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(null);
		System.out.println(secondHigestStirng);
		
		String secondHighestLength = Arrays.stream(stringsString.split("\\s+"))
				.sorted(Comparator.comparing(String::length).reversed())
				.skip(1)
				.findFirst()
				.orElse(null);
		System.out.println(secondHighestLength);
		
		
		/**

		 */
	}
	
}
