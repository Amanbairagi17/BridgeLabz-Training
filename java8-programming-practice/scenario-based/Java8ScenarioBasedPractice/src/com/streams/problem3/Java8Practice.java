package com.streams.problem3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.streams.problem1.Employee;

public class Java8Practice {
	public static void main(String[] args) {
		
		System.out.println("1. Count vowels in a string using Stream");
		String str1 = "programming";
		
		int count = (int) Arrays.stream(str1.split("")).filter(ch -> "aeiouAEIOU".indexOf(ch) != -1).count();
		long vowelCount = str1.chars().mapToObj(c -> (char) c).filter(ch -> "aeiouAEIOU".indexOf(ch) != -1).count();
		System.out.println(count + " " + vowelCount);
		
		System.out.println("2. Count number of words in a sentence");
		String sentence = "Java is a powerful languange";
		int countWord = (int) Arrays.stream(sentence.trim().split("\\s+")).count();
		System.out.println(countWord);
		
		System.out.println("3. Find even numbers from list");
		List<Integer> list = List.of(2,5,7,8,10,13);
	   	List<Integer> eveIntegers = list.stream().filter(n -> n % 2 == 0).toList();
	   	System.out.println(eveIntegers);
	   	
	   	System.out.println("4. Convert list of strings to uppercase");
	   	List<String> wordsString = List.of("java","spring","boot");
	   	List<String> uppercaseStrings = wordsString.stream().map(word -> word.toUpperCase()).toList();
	   	System.out.println(uppercaseStrings);
	   	
	   	System.out.println("5. Find string length list");
	   	List<String> wordStrings = List.of("cat","elephant","dog");
	   	List<Integer> lengthList = wordStrings.stream().map(word -> word.length()).toList();
	   	System.out.println(lengthList);
	   	
	   	System.out.println("6. Count strings starting with ‘a’");
	   	List<String> wordList = List.of("apple","banana","ant","car");
//	   	int countWordStartWithA = (int) wordList.stream().filter(word -> word.startsWith("a")).count();
	   	int countWordStartWithA = (int) wordList.stream().filter(word -> word.charAt(0) == 'a').count();
	   	System.out.println(countWordStartWithA);
	   	
	   	System.out.println("7. Remove empty strings");
	   	List<String> wordList1 = List.of("java","","spring","","boot");
	   	List<String> nonEmptyStringLsiList = wordList1.stream().filter(word -> !word.equals("")).toList();
	   	System.out.println(nonEmptyStringLsiList);
	   	
	   	System.out.println("8. Sum of all numbers using stream");
	   	int[] arr = {1,2,3,4,5};
	   	System.out.println(Arrays.stream(arr).sum());
	    
	   	System.out.println("9. Find max number");
	    int[] arr2 = {10,25,3,99,45};
	    System.out.println(Arrays.stream(arr2).max().getAsInt());
	    
	    System.out.println("10. Reverse each string in list");
	    List<String> wordList2 = List.of("java","api");
//	    List<String> reverseWordString = wordList2.stream()
//	    		.map(word -> new StringBuilder(word).reverse().toString())
//	    		.toList();
	    
	    List<String> reverseWordString = wordList2.stream()
	    		.map(s -> s.chars()
	    				.mapToObj(ch -> String.valueOf((char)ch))
	    				.reduce("",(a,b) -> b+a))
	    		.toList();
	    System.out.println(reverseWordString);
	    
	    System.out.println("11. Remove duplicate elements from list");
	    List<Integer> list2 = List.of(1,2,2,3,4,4,5);
	    List<Integer> removeDulicteIntegers = list2.stream().distinct().toList();
	    System.out.println(removeDulicteIntegers);
	    
	    System.out.println("12. Sort list in descending order");
	    List<Integer> list3 = List.of(9,3,41,2,1);
	    List<Integer> sortedInDescendingOrder = list3.stream()
	                 .sorted(Comparator.reverseOrder())
	                 .toList();

	    System.out.println(sortedInDescendingOrder);
	   
	    System.out.println("13. Find second highest number");
	    List<Integer> list4 = List.of(10,20,40,90,345);
	    list4.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(n -> System.out.println(n));
	    
	    System.out.println("14. Joining String with comma ,");
	    List<String> list5 = List.of("Java", "Spring", "Boot");
	    String result = list5.stream()
	            .collect(Collectors.joining(","));
	    System.out.println(result);
	    
	    System.out.println("15. Frequency of each character");
	    String string = "banana";
//	    Arrays.stream(string.split(""))
//	    .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
//	    .forEach((k, v) -> System.out.println(k + "=" + v));
	    
	    Map<Character, Long> frequencyMap = string.chars()
	    		.mapToObj(ch -> (char)ch)
	    		.collect(Collectors.groupingBy(c -> c,
	    				Collectors.counting())
	    		);
	    frequencyMap.forEach((k,v) -> System.out.println(k + "=" +v));

	    System.out.println("16. Find numbers greater than 50");
	    List<Integer> list6 = List.of(10,55,60,23,90);
	    List<Integer> greaterThan50 = list6.stream().filter(n -> n > 50).toList();
	    System.out.println(greaterThan50);

	    System.out.println("17. Group strings by length");
	    List<String> input = List.of("a", "bb", "ccc", "dd");
	    Map<Integer, List<String>> groupedByLength =
	            input.stream()
	                 .collect(Collectors.groupingBy(String::length));
	    System.out.println(groupedByLength);
	    
	    System.out.println("18. Find first non-repeated character");
	    String input2 = "stress";
	    
	    Character result2 = input2.chars()
	    	.mapToObj(ch -> (char)ch)
	    	.collect(Collectors.groupingBy( c->c ,
	    			LinkedHashMap::new, Collectors.counting()))
	    	.entrySet()
	    	.stream()
	    	.filter(e -> e.getValue() == 1)
	    	.map(Map.Entry::getKey)
	    	.findFirst()
	    	.orElse(null);
	    System.out.println(result2);

//	    Set<Character> seen = new HashSet<>();
//	    Character firstRepeated = input2.chars().mapToObj(c -> (char) c)
//	            .filter(ch -> !seen.add(ch))
//	            .findFirst()
//	            .orElse(null);

	    //System.out.println(firstRepeated);
	    
	    System.out.println("19. Convert List<Integer> to List<String>");
	    List<Integer> listOfIntegers = List.of(1,2,3,5,6,6);
	    List<String> listOfStrings = listOfIntegers.stream().map(n -> String.valueOf(n)).toList();
	    System.out.println(listOfStrings);

	    System.out.println("20. Count occurrences of each word");
	    String sentenceString = "java is java and java is fast";
	    Arrays.stream(sentenceString.split("\\s+"))
	    	.collect(Collectors.groupingBy(word -> word , Collectors.counting()))
	    	.forEach((k,v) -> System.out.println(k + "=" +v));
	    
	    System.out.println("21. Partition numbers into even and odd");
	    List<Integer> list7 = List.of(1, 2, 3, 4, 5, 6);
	    
	    Map<Boolean, List<Integer>> partitionedMap = list7.stream()
	    		.collect(Collectors.partitioningBy(n -> n % 2 == 0));
	    
	    Map<String, List<Integer>> resultedMap = Map.of(
	    		"odd" , partitionedMap.get(false),
	    		"even" , partitionedMap.get(true));
	    System.out.println(resultedMap);
	    
	    HashSet<Integer> repeatedHashSet = new HashSet<Integer>(); 
	    System.out.println("22. Find duplicate elements only");
	    List<Integer> list8 = List.of(1,2,3,2,4,5,1);
	    List<Integer> repeatedOnlyList = list8.stream()
	    		.collect(Collectors.groupingBy(n -> n,
	    				Collectors.counting()))
	    		.entrySet()
	    		.stream()
	    		.filter(n -> n.getValue() > 1)
	    		.map(Map.Entry::getKey)
	    		.toList();
	    System.out.println(repeatedOnlyList);

	    System.out.println("23. Find longest string");
	    List<String> wordList3 = List.of("java", "microservice", "api");
//	    String maxLengthWord = wordList3.stream().max(Comparator.comparingInt(String::length)).orElse(null);
//	    String maxLengthWord = wordList3.stream().max((w1, w2) -> w1.length() - w2.length()).orElse(null);
	    String maxLengthWord = wordList3.stream().sorted(Comparator.comparingInt(String::length).reversed()).findFirst().orElse(null);
	    System.out.println(maxLengthWord);
	    
	    System.out.println("24. Find top 3 highest numbers");
	    List<Integer> list9 = List.of(10,90,30,70,50);
	    List<Integer> topThreeHighestIntegers = list9.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
	    System.out.println(topThreeHighestIntegers);
	    
	    System.out.println("25. Flatten list of lists");

	    List<List<Integer>> input3 = List.of(
	            List.of(1, 2),
	            List.of(3, 4),
	            List.of(5)
	    );

	    List<Integer> flattened =
	            input3.stream()
	                 .flatMap(List::stream)
	                 .toList();

	    System.out.println(flattened);
	    
	    System.out.println("27. Sort map by value");

	    Map<String, Integer> inputMap = Map.of(
	            "A", 3,
	            "B", 1,
	            "C", 2
	    );
	    
	    Map<String, Integer> sortedByValue = inputMap.entrySet()
	    		.stream()
	    		.sorted(Map.Entry.comparingByValue()) // ascending
	    		.collect(Collectors.toMap(Map.Entry::getKey,
	    				Map.Entry::getValue,
	    				(a,b) -> a,
	    				LinkedHashMap::new
	    				));
	    System.out.println(sortedByValue);
	    
	    System.out.println("28. Find employee with highest salary (using stream)");
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
	    
	    System.out.println(Arrays.stream(employees).max(Comparator.comparingDouble(Employee::getSalary)));
//	        double maxEmployeeSalary =  Arrays.stream(employees)
//	        		.max(Comparator.comparingDouble(Employee::getSalary))
//	        		.map(Employee::getSalary)
//	        		.orElse(0.0);
//	        System.out.println(maxEmployeeSalary);
	    
	    System.out.println("29. Find common elements between two lists");

	    List<Integer> inputList1 = List.of(1, 2, 3, 4);
	    List<Integer> inputList2 = List.of(3, 4, 5, 6);
	    
	    List<Integer> commonList = inputList1.stream().filter(inputList2::contains).toList();
	    System.out.println(commonList);
	    
	    System.out.println("30. Find kth smallest element");
	    List<Integer> inputList = List.of(9,1,5,3,7);
	    int k = 2;
	    
	    System.out.println(inputList.stream().sorted().skip(k-1).findFirst().orElse(0));

	   	/*
	   	 *
	   	 *
Input: ["]**/
	}
	
}
