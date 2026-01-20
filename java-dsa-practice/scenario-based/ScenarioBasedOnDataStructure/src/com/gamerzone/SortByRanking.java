package com.gamerzone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SortByRanking {
	private List<Player> list = new ArrayList<>();
	
	public SortByRanking(List<Player> list) {
		this.list = list;
	}
	
	void sort(){
		quickSort(0,list.size()-1);
	}
	
	void quickSort(int low, int high) {
		if(low < high) {
			int pivot = partition(low,high);
			quickSort(low, pivot-1);
			quickSort(pivot+1, high);
		}
	}
	
	int partition(int low, int high) {
		Player pivot = list.get(high);
		
		int i = low - 1;
		
		for(int j=low ; j<=high-1 ; j++) {
			if(list.get(j).getRanking() < pivot.getRanking()) {
				i++;
				swap(i,j);
			}
		}
		i++;
		swap(i,high);
		return i;
	}
	
	void swap(int i, int j) {
		Player temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
	
	void display() {
		for(Player player : list) {
			System.err.println(player);
		}
	}
}
