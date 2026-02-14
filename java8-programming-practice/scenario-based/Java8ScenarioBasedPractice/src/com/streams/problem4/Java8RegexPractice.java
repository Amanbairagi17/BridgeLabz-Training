package com.streams.problem4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Java8RegexPractice {
	public static void main(String[] args) {
		
		System.out.println("1.Character Frequency Count");
		String input1 = "banana";
		Map<Character, Long> charFreqMap = input1.chars()
			.mapToObj(ch -> (char)ch)
			.collect(Collectors.groupingBy(c -> c,
					Collectors.counting())
					);
		System.out.println(charFreqMap);
		
		System.out.println("2.Word Frequency Count");
		String input = "java is java and java is fast";
		Map<String, Long> wordFreqMap = Arrays.stream(input.trim().split("\\s+"))
				.collect(Collectors.groupingBy(word -> word,
						Collectors.counting()));
		System.out.println(wordFreqMap);
				
		System.out.println("3.First Non-Repeating Character");
		
		String str = "stress";
		Character s = str.chars()
		         .mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(ch -> ch,LinkedHashMap::new,
						Collectors.counting()))
				.entrySet()
				.stream()
				.filter(n -> n.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		System.out.println(s);
		
		System.out.println("4.All Non-Repeating Characters");
		String inputString = "programming";
		List<Character> allNonRepeatingCharacters = inputString.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new,
						Collectors.counting()))
				.entrySet()
				.stream()
				.filter(n -> n.getValue() == 1)
				.map(Map.Entry::getKey).toList();
		System.out.println(allNonRepeatingCharacters);
		
		System.out.println("5. Remove Duplicate Characters");
		String inputString2 = "banana";
		//Arrays.stream(inputString2.split("")).distinct().forEach(System.out::print); // not good answer because it may lead "" string
		inputString2.chars().mapToObj(c -> (char)c).distinct().forEach(System.out::print);
		System.out.println();
		
		System.out.println("6.Remove Repeating Characters (Keep Only Unique Once)");
		String inputString3 = "aaaabddddccce";
		Set<Character> seen = new HashSet<>();
		inputString3.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(c -> c,
						LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(n -> n.getValue() == 1)
				.map(Map.Entry::getKey)
				.toList().forEach(System.out::print);
		System.out.println();
		
		System.out.println("7.Remove Non-Alphanumeric Characters");
		String inputString4 =  "ja@va#8!!";
		String result = inputString4.chars()
		        .mapToObj(c -> String.valueOf((char) c))
		        .filter(rs -> rs.matches("[a-zA-Z0-9]"))
		        .collect(Collectors.joining());
		System.out.println(result);
		
		System.out.println("8.Keep Only Alphabets");
		String string = "java8stream2025";
		String result2 = string.chars()
				.mapToObj(c -> String.valueOf((char)c))
				.filter(ch -> ch.matches("[a-zA-Z]"))
				.collect(Collectors.joining());
		System.out.println(result2);
				
		
		System.out.println("9.Keep Only Digits");
		String string2 = "orderId=AB123XZ9";
		String resultString = string2.chars()
				.mapToObj(ch -> String.valueOf((char)ch))
				.filter(c -> c.matches("[0-9]"))
				.collect(Collectors.joining());
		System.out.println(resultString);
		
		System.out.println("10.Count Each Character Except Spaces");
		String lastString = "java streams ";
		Map<Character, Long> charFreqWithoutSpace = lastString.chars()
				.mapToObj( ch -> (char)ch)
				.filter(c -> !c.equals(' '))
				.collect(Collectors.groupingBy(c -> c,
						Collectors.counting())
						);
		System.out.println(charFreqWithoutSpace);
		
		
		/*
		 * 1



Output: {java=3, is=2, and=1, fast=1}**/
	}
}
