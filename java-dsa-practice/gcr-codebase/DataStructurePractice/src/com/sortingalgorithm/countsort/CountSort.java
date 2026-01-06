package com.sortingalgorithm.countsort;

import java.util.Arrays;

public class CountSort {
	public static void sort(int[] ages) {
	    int[] count = new int[19];

	    for (int age : ages) count[age]++;

	    int idx = 0;
	    for (int age = 0; age < 19; age++) {
	        while (count[age] > 0) {
	            ages[idx++] = age;
	            count[age]--;
	        }
	    }
	}
	
	public static void main(String[] args) {
		int[] ages = {15, 14, 17, 11, 12, 10};
		sort(ages);
		
		System.out.println(Arrays.toString(ages));
	}
}
