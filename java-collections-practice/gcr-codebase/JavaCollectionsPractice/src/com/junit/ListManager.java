package com.junit;

import java.util.List;

public class ListManager {
	
	//add element
	public List<Integer> addElement(List<Integer> list, int element){
		list.add(element);
		return list;
	}
	
	//remove element
	public List<Integer> removeElement(List<Integer> list, int element){
		int idx = -1;
		for(int i=0 ; i<list.size() ; i++) {
			if(list.get(i) == element) {
				idx = i;
				break;
			}
		}
		list.remove(idx);
		return list;
	}
	
	//get size
	public int getSize(List<Integer> list){
		return list.size();
	}

}
