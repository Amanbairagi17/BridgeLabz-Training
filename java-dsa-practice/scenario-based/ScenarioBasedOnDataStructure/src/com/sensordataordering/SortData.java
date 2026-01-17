package com.sensordataordering;

import com.ticketpriceoptimizer.Ticket;

public class SortData {
	private Data[] arr = new Data[5];
	
	public SortData(Data[] arr) {
		this.arr = arr;
	}
	
	void sort() {
		quickSort(0,arr.length-1,arr);
		
	}
	
	
	//quick sort
	public void quickSort(int low, int high, Data[] arr) {
		if(low < high) {
			int pivot = partition(low,high,arr);
			
			quickSort(low, pivot-1, arr);
			quickSort(pivot+1, high, arr);
		}
	}
	
	//method to find pivot element
	public int partition(int low, int high, Data[] arr) {
		int pivot = arr[high].getTemp();
		int i = low - 1;
		
		for(int j=low ; j<=high-1 ; j++) {
			if(arr[j].getTemp() < pivot) {
				i++;
				swap(i,j,arr);
			}
		}
		swap(i+1,high,arr);
		return i+1;
	}
	
	public void swap(int i, int j, Data[] arr) {
	    Data temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

	public void display() {
		for(Data a : arr) {
			//calling ticket class toString method
			System.out.println(a.toString());
		}
	}
	
	
}
