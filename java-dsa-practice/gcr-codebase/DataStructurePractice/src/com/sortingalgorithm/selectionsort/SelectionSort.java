package com.sortingalgorithm.selectionsort;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0 ; i<n-1 ; i++) {
			int minIdx = i;
			
			for(int j=i+1 ; j<n ; j++) {
				if(arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {7,8,9,3,1,2};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
