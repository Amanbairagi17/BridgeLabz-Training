package com.searchingalgorithm.binarysearch;

public class TargetIndex {
	private static int findIndex(int[] arr, int target) {
		int n = arr.length;
		
		int low=0;
		int high=n-1;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target) return mid;
			
			if(arr[mid] < target) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
			
			
			
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.print(findIndex(arr, 4));
		
	}
}
