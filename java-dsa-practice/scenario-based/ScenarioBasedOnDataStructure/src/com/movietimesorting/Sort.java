package com.movietimesorting;

public class Sort {
	private Movie[] arr = new Movie[5];
	
	public  Sort(Movie[] arr) {
		this.arr = arr;
	}
	
	void sort() {
		int n = arr.length;
		
		for(int i = 0; i < n; i++)
			for(int j=0 ; j<n-i-1 ; j++) {
				
			if(arr[j].getTime() > arr[j+1].getTime() ) {
				Movie temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
			
	}

	
	void display() {
		for(Movie m : arr) {
			System.out.println("Movie name : " + m.getName() + " Movie date : " +m.getTime());
		}
	}
}