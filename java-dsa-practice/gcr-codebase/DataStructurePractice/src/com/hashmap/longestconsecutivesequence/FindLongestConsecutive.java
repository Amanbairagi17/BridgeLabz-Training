package com.hashmap.longestconsecutivesequence;

import java.util.HashSet;

public class FindLongestConsecutive {
	private static int findLongestConsecutive(int[] arr) {
		int n = arr.length;
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			set.add(num);
		}
		
		int max = 0;
		for(int num : set) {
			if(!set.contains(num - 1)) {
				int longestConsecutive = 1;
				while(set.contains(num+1)) {
					num++;
					longestConsecutive++;
				}
				max = Math.max(longestConsecutive, max);
			}
			
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {0,3,7,2,5,8,4,6,0,1};
		
		System.out.println(findLongestConsecutive(arr));
	}
}
