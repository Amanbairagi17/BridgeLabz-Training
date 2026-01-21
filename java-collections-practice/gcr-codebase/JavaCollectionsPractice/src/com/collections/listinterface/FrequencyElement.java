package com.collections.listinterface;

import java.util.HashMap;

public class FrequencyElement {
	private static void findFrequency(String[] fruits) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String string : fruits) {
			map.put(string, map.getOrDefault(string, 0)+1);
		}
	
		for(String string : map.keySet()) {
			System.out.println(string + " : " +map.get(string));
		}
		
	}
	public static void main(String[] args) {
		String[] fruit = {"apple", "banana", "apple", "orange"};
		findFrequency(fruit);
		
	}
}
