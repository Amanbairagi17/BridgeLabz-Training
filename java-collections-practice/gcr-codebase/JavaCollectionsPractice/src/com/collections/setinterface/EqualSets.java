package com.collections.setinterface;

import java.util.HashSet;

public class EqualSets {
	private static boolean isEqual(HashSet<Integer>  set1, HashSet<Integer>  set2) {
		for(int num : set1) {
			if(!set2.contains(num)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		HashSet<Integer>  set1 = new HashSet<Integer>();
		HashSet<Integer>  set2 = new HashSet<Integer>();
		
		for(int i=2 ; i<23 ; i += 2) {
			set1.add(i);
			set2.add(i);
		}
		set1.add(7);
		
		System.out.println(isEqual(set1,set2));
		
	}
}
