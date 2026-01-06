package com.searchingalgorithm.binarysearch;

public class RotatedArrayPoint {
	private static int findRotatePoint(int[] arr) {
		int n = arr.length;
		
		int low = 0;
		int high = n-1;
		
		while(low < high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] < arr[high]) {
				high = mid;
			}
			else if (arr[mid] > arr[high]) {
				low = mid + 1;
			}
		}
		return low;
	}
	public static void main(String[] args) {
		int[] arr = {9,8,7,6,1,2,3,4,5};
		int idx = findRotatePoint(arr);
		System.err.println(idx);
	}
}
