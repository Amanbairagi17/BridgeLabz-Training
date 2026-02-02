package com.extras;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LexicalTwist {
	private static boolean isVowels(char ch) {
		if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
		 return false;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] string1 = {"Hello", "Idea" , "Apple" , "Open", "Hello World"};
		String[] string2 = {"olleh", "Ocean" , "Orange" , "Source", "Hello World"};
		
		for(int j=0 ; j<Math.min(string1.length, string2.length) ; j++) {
			String str1 = string1[j];
			String str2 = string2[j];
			
			StringBuilder sb1 =  new StringBuilder(str1);
			StringBuilder sb2 = new StringBuilder();
			
			if(sb1.reverse().toString().equalsIgnoreCase(str2)) {
				for(int i=0 ; i<str2.length() ; i++) {
					if(isVowels(str2.charAt(i))) {
						sb2.append("@");
					}
					else {
						sb2.append(str2.charAt(i));
					}
				}
				
				System.out.println(sb2.toString());
				continue;
			}
			
			else if(str1.trim().contains(" ") || str2.trim().contains(" ")) {
				System.out.println("Invalid word");
				continue;
			}
			else {
				sb2.append(str1.toUpperCase());
				sb2.append(str2.toUpperCase());
				
				
				int vowels = 0;
				int consonent = 0;
				
				HashSet<Character> vowelsSet = new LinkedHashSet<>();
				HashSet<Character> consonentSet = new LinkedHashSet<>();
				//System.out.println(sb2);
				
				for(int i=0 ; i<sb2.length() ; i++) {
					char ch = sb2.charAt(i);
					//System.out.println(ch +" " + i);
					if(isVowels(Character.toLowerCase(ch))) {
						vowels++;
						if(vowelsSet.size() < 2) vowelsSet.add(sb2.charAt(i));
					}else {
						consonent++;
						if(consonentSet.size() < 2) consonentSet.add(sb2.charAt(i));
					}
				}
				
				
				//System.out.println(vowelsBuilder);
				//System.out.println(consonentBuilder);
				//System.out.println(vowels);
				//System.out.println(consonent);
				
				if(vowels > consonent) {
					for(char ch : vowelsSet) System.out.print(ch+"");
					System.out.println();
				}
				else if(consonent > vowels) {
					for(char ch : consonentSet) System.out.print(ch+"");
					System.out.println();
				}
				else {
					System.out.println("Vowels and consonants are equal");
				}
				continue;
				
			}
		}
		
		
	}
}
