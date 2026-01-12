package com.searchingalgorithm.stringbuilder;

import java.util.HashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String s = "This is initial string";
		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<>();
		
		for(char ch : s.toCharArray()) {
			if(!set.contains(ch)) {
				sb.append(ch);
				set.add(ch);
			}
		}
		
		System.out.println(sb);
	}
}
