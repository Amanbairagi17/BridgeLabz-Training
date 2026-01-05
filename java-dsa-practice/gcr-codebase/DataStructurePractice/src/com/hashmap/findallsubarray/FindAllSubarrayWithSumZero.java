package com.hashmap.findallsubarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllSubarrayWithSumZero {
	public static void findAllSubarrays(int[] arr) {
	    Map<Integer, List<Integer>> map = new HashMap<>();
	    int currentSum = 0;

	    for (int i = 0; i < arr.length; i++) {
	        currentSum += arr[i];

	        if (currentSum == 0) {
	            System.out.println("Subarray [0..." + i + "]");
	        }

	        if (map.containsKey(currentSum)) {
	            List<Integer> previndex = map.get(currentSum);
	            for (Integer index : previndex) {
	                System.out.println("Subarray [" + (index + 1) + "..." + i + "]");
	            }
	        }

	        if (!map.containsKey(currentSum)) {
	            map.put(currentSum, new ArrayList<>());
	        }
	        map.get(currentSum).add(i);
	    }
	}
	
	public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        findAllSubarrays(arr);
    }

}
