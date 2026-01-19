package com.productsortingbydiscount;

import java.util.ArrayList;
import java.util.List;

import com.sensordataordering.Data;

public class SortPrice {
	private List<Product> list = new ArrayList<>();
	
	public SortPrice(List<Product> list) {
		this.list = list;
	}
	
	void sortByDiscount() {
		quickSort(0,list.size()-1);
	}
	
	public void quickSort(int low, int high) {
		if(low < high) {
			int pivot = partition(low,high);
			
			quickSort(low, pivot-1);
			quickSort(pivot+1, high);
		}
	}
	
	public int partition(int low, int high) {
		int pivot = list.get(high).getDiscount();
		int i = low - 1;
		
		for(int j=low ; j<=high-1 ; j++) {
			if(list.get(j).getDiscount() < pivot) {
				i++;
				swap(i,j);
			}
		}
		swap(i+1,high);
		return i+1;
	}
	
	public void swap(int i, int j) {
	    Product temp = list.get(i);
	    list.set(i, list.get(j));
	    list.set(j, temp);
	}
	
	public void display() {
		for(Product product : list) {
			System.out.println(product);
		}
	}
}
