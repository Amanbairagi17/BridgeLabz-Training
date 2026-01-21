package com.collections.setinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class UnionAndIntersection {
	private static void findIntersection(HashSet<Integer>  set1, HashSet<Integer>  set2) {
		List<Integer> ans = new ArrayList<Integer>();
		
		for(int num : set1) {
			if(set2.contains(num)) ans.add(num);
		}
		
		System.out.println("Intersection of two sets : " +ans);
	}
	
	private static void findUnion(HashSet<Integer>  set1, HashSet<Integer>  set2) {
		List<Integer> ans = new ArrayList<Integer>();
		
		for(int num : set1) ans.add(num);
		for(int num : set2) ans.add(num);
		
		System.out.println("Union of two sets : " + ans);
	}
	public static void main(String[] args) {
		HashSet<Integer>  set1 = new HashSet<Integer>();
		HashSet<Integer>  set2 = new HashSet<Integer>();
		
		for(int i=2 ; i<23 ; i += 2) set1.add(i);
		for(int i=1 ; i<14 ; i++) set2.add(i);
		
		findIntersection(set1, set2);
		findUnion(set1, set2);
	}
}
