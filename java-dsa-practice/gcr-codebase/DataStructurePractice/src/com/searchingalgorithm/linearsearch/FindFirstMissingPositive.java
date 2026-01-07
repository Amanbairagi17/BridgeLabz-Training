package com.searchingalgorithm.linearsearch;

import java.util.Arrays;

public class FindFirstMissingPositive {
	private static int findMissingPostive(int[] nums) {
		int n = nums.length;

        if(n == 1 && nums[0] == 1) return 2;
        
        boolean[] seen = new boolean[n+1];
        Arrays.fill(seen , false);
        
        for(int num : nums){
            if(num > 0 && num <=n) seen[num] = true;
        }
        System.out.println(Arrays.toString(seen));
        
        int num = 0;
        for(int i=1 ; i<=n ; i++){
            if(!seen[i]){
               return i;
            }
        }
        
        return n+1;
	}
	public static void main(String[] args) {
		int[] arr = {3,4,-1,1};
		System.out.println(findMissingPostive(arr));
	}
}
