package com.collections.setinterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {
	public static void main(String[] args) {
		HashSet<Integer>  set = new HashSet<Integer>();
		for(int i=2 ; i<23 ; i += 2) set.add(i);
		
		Set<Integer> sortedSet = new TreeSet<Integer>();
		for(int num : set) sortedSet.add(num);
		
		System.out.println("Sorted Set : "+sortedSet);
	}
}
