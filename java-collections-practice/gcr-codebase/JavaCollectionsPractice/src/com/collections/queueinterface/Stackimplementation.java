package com.collections.queueinterface;

import java.util.ArrayDeque;
import java.util.Queue;

public class Stackimplementation {
	Queue<Integer> queue1;
	Queue<Integer> queue2;
	
	public Stackimplementation() {
		this.queue1 = new ArrayDeque<Integer>();
		this.queue2 = new ArrayDeque<Integer>();
	}
	
	void add(int num) {
		queue1.add(num);
	}
	
	int size(){
		return queue1.size();
	}
	
	int pop(){
		if(queue1.size() == 1) return queue1.remove();
		
		while(queue1.size() > 1) {
			queue2.add(queue1.remove());
		}
		
		int num = queue1.remove();
		
		while(!queue2.isEmpty()) {
			queue1.add(queue2.remove());
		}
		return num;
	}
	
	int peek() {
if(queue1.size() == 1) return queue1.remove();
		
		while(queue1.size() > 1) {
			queue2.add(queue1.remove());
		}
		
		int num = queue1.remove();
		queue1.add(num);
		
		while(!queue2.isEmpty()) {
			queue1.add(queue2.remove());
		}
		return num;
	}
	
	boolean isEmpty() {
		return queue1.isEmpty();
	}
	
	void display() {
		System.out.println(queue1);
	}
	
	public static void main(String[] args) {
		Stackimplementation s = new Stackimplementation();
		s.add(34);
		s.add(43);
		s.add(11);
		s.display();
		System.out.println(s.pop());
		s.display();
		System.out.println(s.peek());
		
	}
	
}


