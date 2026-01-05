package com.queueandstack.stockspan;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.function.IntPredicate;

public class SlidingWindowMaximum {
	private static int[] findMaximum(int[] nums, int k) {
		int n = nums.length;
		int[] ans = new int[n-k+1];
		
		
		for(int i=0 ; i<n-k+1 ; i++) {
			int max = nums[i];
			for(int j=i ; j<i+k ; j++) {
				max = Math.max(max, nums[j]);
				ans[i] = max;
			}
			
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = {1,3,-1,-3,5,3,6,7};
 		//int[] nums = {6,5,4,3,2,1};
		//int[] nums = {1,2,3,4,5,6};
		int k = 3;
		
		int[] ans = findMaximum(nums, k);
		
		for(int num : ans) System.out.print(num + " ");
	}
}
