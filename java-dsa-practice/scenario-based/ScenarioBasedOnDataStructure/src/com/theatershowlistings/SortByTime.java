package com.theatershowlistings;

import java.util.ArrayList;
import java.util.List;

public class SortByTime {
	private List<Movie> list = new ArrayList<>();
	
	public SortByTime(List<Movie> movies) {
		this.list = movies;
	}
	
	void sortByTime() {
		int n = list.size();
		
		for(int i=1 ; i<n ; i++) {
			Movie temp = list.get(i);
			int j = i-1;
			
			while(j >= 0  && temp.getTime().isBefore(list.get(j).getTime())) {
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, temp);
			
			
		}
	}
	
	void display() {
		for(Movie movie : list) {
			System.out.println(movie);
		}
	}
}
