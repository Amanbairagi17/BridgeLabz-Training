package com.sortingalgorithm.bubblesort;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		
		for(int i=0 ; i<n-1 ; i++) {
			swapped = false;
			for(int j=0 ; j<n-i-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			//it means array already sorted no need to sort 
			if(!swapped) break;
		}
	}
	public static void main(String[] args) {
		int[] arr = {7,8,9,3,1,2};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
