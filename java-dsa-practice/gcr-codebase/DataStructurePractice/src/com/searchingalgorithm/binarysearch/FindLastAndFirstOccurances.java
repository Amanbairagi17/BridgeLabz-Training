package com.searchingalgorithm.binarysearch;

import java.util.Arrays;

public class FindLastAndFirstOccurances {
	private static int findFirstOccurances(int[] arr, int target) {
		int idx = -1;
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == target) {
				idx = mid;
				high = mid - 1;
			}
			
			if(arr[mid] < target) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
			
		}
		return idx;
	}
	
	private static int findLastOccurances(int[] arr, int target) {
		int idx = -1;
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == target) {
				idx = mid;
				low = mid + 1;
			}
			
			if(arr[mid] < target) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
			
		}
		return idx;
	}
	
	private static int[] searchRange(int[] arr, int target) {
		int[] ans = new int[2];
		ans[0] = findFirstOccurances(arr, target);
		ans[1] = findLastOccurances(arr, target);
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {5,7,7,8,8,10};
		int target = 8;
		
		System.out.println(Arrays.toString(searchRange(arr, target)));
		
	}
}
