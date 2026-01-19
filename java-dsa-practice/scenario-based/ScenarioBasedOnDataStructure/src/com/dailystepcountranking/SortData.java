package com.dailystepcountranking;

import java.util.Arrays;

public class SortData {
	private Person[] data;

	//constructor
	public SortData(Person[] data) {
		this.data = Arrays.copyOf(data, data.length);
	}
	
	void sort() {
		int n = data.length;
		
		for(int i=0 ; i<n ; i++) {
			boolean mark = false;
			for(int j=0 ; j<n-i-1 ; j++) {
				
				if(data[j].getStepCount() > data[j+1].getStepCount() ) {
					Person temPerson = data[j];
					data[j] = data[j+1];
					data[j+1] = temPerson;
					mark = true;
				}
			}
			
			if (!mark) {
				break;
			}
		}
	}
	
	void display() {
		for(Person person : data) {
			System.out.println(person);
		}
	}
}
