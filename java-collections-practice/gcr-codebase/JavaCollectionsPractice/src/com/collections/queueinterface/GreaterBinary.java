package com.collections.queueinterface;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class GreaterBinary {
//	private static void binaryToNumber() {
//		String[] arr = {"1", "10", "11", "100", "101"};
//		int max = Integer.MIN_VALUE;
//		
//		for(int i=0 ; i<arr.length ; i++) {
//			String binary = arr[i];
//			int decimal = Integer.parseInt(binary, 2);
//			max = Math.max(max, decimal);
//		}
//		
//		System.out.println("Greter bianry");
//	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Number upto 14");
		 int n = sc.nextInt();
		 if(n > 14) {
			 System.out.println("Please Enter a number less than 15 ");
			 return;
		 }
		 
		 Queue<Integer> queue = new ArrayDeque<Integer>();
		 
		 for(int i=1 ; i<=n ; i++) {
			 queue.add(i);
		 }
		 
		 String[] arr = new String[n+1];
		 for(int i=1 ; i<=n ; i++) {
			 arr[i] = Integer.toBinaryString(i);
		 }
		 
		 for(int i=1 ; i<=n ; i++) {
			 if(i == n) continue;
			 System.out.print(arr[i]+",");
		 }
		 System.out.println(arr[n]);
	}
}
