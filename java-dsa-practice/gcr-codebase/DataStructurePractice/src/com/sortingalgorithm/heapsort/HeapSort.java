package com.sortingalgorithm.heapsort;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapSort {
	public static void heapSort(int[] arr) {
		int n = arr.length;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a - b);
		
		for(int i=0 ; i<n ; i++) {
			pq.add(arr[i]);
		}
		int i=0;
		
		while(!pq.isEmpty()) {
			arr[i] = pq.poll();
			i++;
		}
	}
	public static void main(String[] args) {
		int[] arr = {7,8,9,3,1,2};
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
