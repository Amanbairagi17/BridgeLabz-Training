package com.extras;

import java.util.Scanner;

public class FlipKeys {
	private static String cleanseAndInvert(String str) {
		if(str.length() < 6) {
			//System.out.println("Invalid Input ");
			return "";
		}
		
		str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0 ; i<str.length() ; i++){
			char ch = str.charAt(i);
			if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
				if(ch % 2 != 0) {
					sb.append(ch);
				}
			}
			else if(i % 2 == 0){
				continue;
			}
			else {
				//System.out.println("Invalid Input ");
				return "";
			}
			
		}
		
		sb.reverse();
		
		for(int i=0 ; i<sb.length() ; i++) {
			if(i % 2 == 0) {
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
			}
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number : ");
//		int n = sc.nextInt();
		//sc.nextLine();
		String[] str = {"Aeroplane", "Magic", "Invalid Input", "Aman78", "B@rbie", "Cowages"};
		
		for(int i=0 ; i<str.length ; i++) {
			//System.out.println("Enter String ");
			String string = cleanseAndInvert(str[i]);
			if(string.length() == 0) {
				System.out.println("Invalid input");
			}
			else {
				System.out.println("The generated key is - " +string);
			}
		}
		
	}
}
