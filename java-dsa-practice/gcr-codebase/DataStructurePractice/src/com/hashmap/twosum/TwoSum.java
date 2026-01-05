package com.hashmap.twosum;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
	private static ArrayList<Integer> twoSum(int[] arr, int target) {
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0 ; i<arr.length ; i++) {
			int sum = target - arr[i];
			
			if(map.containsKey(sum)) {
				list.add(map.get(sum));
				list.add(i);
				return list;
			}
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		
		return (ArrayList<Integer>) List.of(-1,-1);
	}
	public static void main(String[] args) {
		int[] arr = {2,2,6,4,8,1,9,9,4};
		int target = 10;
		
		System.out.println(twoSum(arr, target));
	}
}
