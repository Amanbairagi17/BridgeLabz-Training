package com.sortartistbytime;
import java.time.LocalTime;

public class SortTime {
	private Artist[] arr;
	
	public SortTime(Artist[] arr) {
		this.arr = arr;
	}
	
	void sort() {
		int n = arr.length;
		
		for(int i=1 ; i<n ; i++) {
			Artist art = arr[i];
			int j=i-1;
			
			while(j >= 0 && art.getRegistrationTime().isBefore(arr[j].getRegistrationTime())) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = art;
		}
		
	}
	
	void display() {
		for(Artist artist : arr) {
			System.out.println("Artist name : " +artist.getName() + " Artist rgistration time : " +artist.getRegistrationTime());
		}
	}
}
