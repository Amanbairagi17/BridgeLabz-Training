package com.sortingalgorithm.mergesort;

import java.util.Arrays;

public class MergeSort {
	public static void merge(int[] arr, int low, int mid, int high) {
		//finding the size of both array left and right both are sorted array 
		int n1 = mid - low + 1;
		int n2 = high - mid ;
		
		//declaring temporary array
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		//copy all element into left array for left part into unsorted order
		for(int i=0 ; i<n1 ; i++) {
			left[i] = arr[low+i];
		}
		
		//copy all element into right array for right part into unsorted order
		for(int i=0 ; i<n2 ; i++) {
			right[i] = arr[mid+1+i];
		}
		
		int i=0;
		int j=0;
		int k=low;
		
		//merge both array
		while(i<n1 && j<n2) {
			// left array value less then insert into correct position
			if(left[i] < right[j]) {
				arr[k] = left[i++];
			}else {//insert right value to its correct position
				arr[k] = right[j++];
			}
			k++;
		}
		
		//add remaining array values
		while(i < n1) {
			arr[k] = left[i];
			k++;
			i++;
		}
		
		//add remaining array values for right 
		while(j < n2) {
			arr[k] = right[j];
			k++;
			j++;
		}
	}
	public static void mergeSort(int[] arr, int low, int high) {
		
		if(low < high) {
			int mid = low + (high - low)/2;
			
			//divide array into halves
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			//merger both sorted array
			merge(arr, low, mid, high);
		}
	}
	public static void main(String[] args) {
		int[] arr = {7,8,9,3,1,2};
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
