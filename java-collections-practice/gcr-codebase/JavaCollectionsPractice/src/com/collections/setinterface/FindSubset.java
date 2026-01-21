package com.collections.setinterface;

import java.util.HashSet;

public class FindSubset {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		for(int i=1 ; i<=5 ; i++) {
			set1.add(i);
		}
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		for(int i=3 ; i<=10 ; i++) {
			set2.add(i);
		}
		
		for(int num : set1) {
			if(!set2.contains(num)) {
				System.out.println("Not Subset");
				return;
			}
		}
		System.out.println("Subset");
		
	}
}
