package com.searchingalgorithm.stringbuffer;

public class Concatination {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String[] arr = {"This ", "is ", " concatinated", " string." };
		
		for(String s : arr) {
			sb.append(s);
		}
		
		System.out.println(sb);
	}
}
