package com.searchingalgorithm.linearsearch;

public class FindWordInSentence {
	private static String findWord(String[] str, String word) {
		
		for(String s : str) {
			if(s.equalsIgnoreCase(word)) return "Found";
		}
		return "Not Found";
	}
	public static void main(String[] args) {
		String s = "Hii buddy how r u";
		String[] strings = s.split(" ");
		
		System.out.println(findWord(strings, "Aman"));// Not Found
		System.out.println(findWord(strings, "hii"));// Found
	}
}
