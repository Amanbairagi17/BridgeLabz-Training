package com.queueandstack.sortstack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SortStack{
	
	//sorting stack using without recursion
//	public static void sortStack(Stack<Integer> st) {
//		
//		Stack<Integer> temp = new Stack<Integer>();
//		
//		while(!st.isEmpty()) {
//			int curr = st.pop();
//			
//			while(!temp.isEmpty() && temp.peek() > curr) {
//				st.push(temp.pop());
//			}
//			
//			temp.push(curr);
//			
//		}
//		
//		while(!temp.isEmpty()) {
//			st.push(temp.pop());
//		}
//	}
	
	public static void sortStack(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		
		int top = st.pop();
		sortStack(st);
		insertSorted(st,top);
	}
	private static void insertSorted(Stack<Integer> st, int x) {
		if(st.isEmpty() || st.peek() <= x) {
			st.push(x);
			return;
		}
		
		int top = st.pop();
		insertSorted(st, x);
		st.push(top);
		
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(40);
		st.push(20);
		st.push(12);
		st.push(43);
		
		sortStack(st);
		
//		System.out.println("Sorted Stack without using recursion : ");
//		while(!st.isEmpty()) {
//			System.out.print(st.pop() + " ");
//		}
		
		List<Integer> list = new ArrayList<>();
		while(!st.isEmpty()) {
			list.add(st.pop());
		}
		
		System.out.println("Sorted Stack using recursion : ");
		System.out.println(list);
		
	}

}
