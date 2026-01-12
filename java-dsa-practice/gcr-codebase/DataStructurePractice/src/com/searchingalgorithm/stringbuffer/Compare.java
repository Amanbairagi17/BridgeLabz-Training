package com.searchingalgorithm.stringbuffer;

public class Compare {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		StringBuffer buffer = new StringBuffer();
		
		long curr = System.nanoTime();
		for(int i = 0; i < 10000000; i++) builder.append("hello");
		System.out.println("Time for string builder : " + (System.nanoTime() - curr));
		
		curr = System.nanoTime();
		for(int i = 0; i < 10000000; i++) buffer.append("hello");
		System.out.println("Time for string buffer : " + (System.nanoTime() - curr));
	}
}
