package com.collections.queueinterface;

import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseQueue{
	private static void reverseQueue(Queue<Integer> queue) {
		if(queue.size() == 1) return;
		
		int num = queue.remove();
		reverseQueue(queue);
		queue.add(num);
	}
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(30);
		queue.add(20);
		queue.add(10);
		queue.add(2);
		
		System.out.println(queue);
		reverseQueue(queue);
		System.out.println(queue);
		
	}
}
