package com.collections.queueinterface;

import java.util.Collections;
import java.util.PriorityQueue;

public class Hospital {
	public static void main(String[] args) {
		PriorityQueue<Patinet> list = new PriorityQueue<Patinet>((a,b) -> b.getSeverlity() - a.getSeverlity());
		list.add(new Patinet("Aman", 6));
		list.add(new Patinet("Kartik", 8));
		list.add(new Patinet("Tarun", 3));
		list.add(new Patinet("Satyam", 1));
		list.add(new Patinet("Patil", 10));
		
		Patinet patinet = new Patinet(list);
		patinet.display();
		
		
	}
}
