package com.collections.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicate {
	private static void removeDuplicate(List<Integer> arr) {
		
		for(int i=0 ; i<arr.size() ; i++) {
			for(int j=i+1 ; j<arr.size() ; j++) {
				if(arr.get(i) == arr.get(j)) {
					 arr.remove(j);
					 j--;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//int n = scanner.nextInt();
		
		List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 3));
		
		System.out.println(arr);
		removeDuplicate(arr);
		System.out.println(arr);
		
		
	}
}
