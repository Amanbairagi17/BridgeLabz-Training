package com.hashmap.givenpairsum;

import java.util.ArrayList;
import java.util.HashMap;

public class GivenPairSum {
	private static int solve(int[] arr, int target){
		int n = arr.length;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int pair = 0;
		
		for(int i=0 ; i<n ; i++) {
			int required = target - arr[i];
			
			if(map.containsKey(required)) {
				pair += map.get(required);
			}
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		return pair;
	}
	public static void main(String[] args) {
		int[] arr = {2,2,6,4,8,1,9,9,4};
		int target = 10;
		
		System.out.println(solve(arr, target));
	}
}
