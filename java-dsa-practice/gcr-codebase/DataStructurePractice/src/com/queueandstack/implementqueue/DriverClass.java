package com.queueandstack.implementqueue;

public class DriverClass {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		System.out.println(queue.empty());
		queue.add(10);
		queue.add(30);
		
		System.out.println(queue);
		queue.add(3);
		queue.add(14);
		
		System.out.println(queue.peek());
		System.out.println(queue.pop());
		System.out.println(queue);
		
	}
}
