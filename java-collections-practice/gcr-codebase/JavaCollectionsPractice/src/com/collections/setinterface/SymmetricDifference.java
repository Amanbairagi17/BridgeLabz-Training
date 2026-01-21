package com.collections.setinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SymmetricDifference {
	private static void findDifference(HashSet<Integer>  set1, HashSet<Integer>  set2) {
		HashSet<Integer> common = new HashSet<>(set1);
		common.retainAll(set2);   // intersection

		set1.removeAll(common);
		set2.removeAll(common);

		List<Integer> ans = new ArrayList<>();
		ans.addAll(set1);
		ans.addAll(set2);
		    
		System.out.println("Final list after sysmmetric difference : " +ans);
	}
	public static void main(String[] args) {
		HashSet<Integer>  set1 = new HashSet<Integer>();
		HashSet<Integer>  set2 = new HashSet<Integer>();
		
		for(int i=2 ; i<23 ; i += 2) set1.add(i);
		for(int i=1 ; i<14 ; i++) set2.add(i);
		System.out.println(set1);
		System.out.println(set2);
		
		findDifference(set1, set2);
	}
	
}
