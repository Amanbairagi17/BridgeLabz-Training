package com.tailorshop;

import java.util.ArrayList;
import java.util.List;

public class SortByDeadline {
	private List<Tailor> list = new ArrayList<>();
	
	public SortByDeadline(List<Tailor> list) {
		this.list = list;
	}
	
	void sort() {
		int n = list.size();
		
		for(int i=1 ; i<n ; i++) {
			Tailor tailor = list.get(i);
			int j = i-1;
			
			while(j>=0 && list.get(j).getDeadline() > tailor.getDeadline()) {
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, tailor);
		}
	}
	
	void addOrder(Tailor t) {
		list.add(null);
		int j = list.size()-2;
		
		while(j>=0 && list.get(j).getDeadline() > t.getDeadline()) {
			list.set(j+1, list.get(j));
			j--;
		}
		list.set(j+1, t);

	}
	
	void display() {
		for(Tailor tailor : list) {
			System.out.println(tailor);
		}
	}
}
