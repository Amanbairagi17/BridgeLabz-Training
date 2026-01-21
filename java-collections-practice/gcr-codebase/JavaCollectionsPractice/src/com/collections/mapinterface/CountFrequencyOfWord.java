package com.collections.mapinterface;

import java.util.Arrays;
import java.util.HashMap;

public class CountFrequencyOfWord {
	private static void countFrequency(String [] arr) {
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		
		for(String s : arr) {
			mp.put(s, mp.getOrDefault(s, 0)+1);
		}
		
		for(String key : mp.keySet()) {
			System.out.println("Key : " +key+ " , Value : " +mp.get(key));
		}
	}
	public static void main(String[] args) {
		String s = "Hello world, hello Java!";
		
		s = s.replaceAll("[^a-zA-Z ]", "");
		
		String[] str = s.trim().split(" ");
		System.out.println(Arrays.toString(str));
		countFrequency(str);
		
	}
}
