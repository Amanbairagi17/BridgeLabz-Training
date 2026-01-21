package com.collections.listinterface;

import java.util.ArrayList;

public class RotateElement {
	public static void reverseList(ArrayList<Integer> list, int i, int j) {
		//int n = list.size()-1;
		
		while(i<j) {
			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j,temp);
			i++;
			j--;
		}
	}
	public static void rorateByK(ArrayList<Integer> list, int k) {
		k = k % list.size();
		
		reverseList(list,0,k-1);
		reverseList(list,k,list.size()-1);
		reverseList(list,0,list.size()-1);
		
		
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(89);
		list.add(78);
		list.add(23);
		list.add(24);
		list.add(9);
		list.add(1);
		
		int k = 9;
		
		//rorateByK(list,k);
		System.out.println("Before Roatating Array : ");
		System.out.println(list);
		rorateByK(list, k);
		System.out.println("After Rotating Array by K steps : ");
		System.out.println(list);
		
		
		
	}
}
