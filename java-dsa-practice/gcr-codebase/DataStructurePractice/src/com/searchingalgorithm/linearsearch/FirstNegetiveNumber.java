package com.searchingalgorithm.linearsearch;

import java.util.Arrays;

public class FirstNegetiveNumber {
	private static int findFirstNegetive(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] < 0) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {8,9,-1,9,-3,2,-3};
		int num = findFirstNegetive(arr);
		System.out.println("First negetive number is : " +num);
		
	}
}
