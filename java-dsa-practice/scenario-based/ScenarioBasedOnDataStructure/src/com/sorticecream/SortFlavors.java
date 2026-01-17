package com.sorticecream;

public class SortFlavors {
	IceCream[] arr = new IceCream[10];
	
	public SortFlavors(IceCream[] arr) {
		this.arr = arr;
	}
	
	public void sort() {
		int n = arr.length;
		
		for(int i = 0; i < n; i++)
			for(int j=0 ; j<n-i-1 ; j++) {
				
			if(arr[j].getSoldQuantity() > arr[j+1].getSoldQuantity() ) {
				IceCream temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	
	void display() {
		for(IceCream c : arr) {
			System.out.println("Ice cream falvours : "+c.getFlavors() + " get quantity : " +c.getSoldQuantity());
		}
	}
}
