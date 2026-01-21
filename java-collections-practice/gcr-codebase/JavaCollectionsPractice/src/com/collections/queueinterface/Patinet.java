package com.collections.queueinterface;

import java.util.PriorityQueue;

public class Patinet {
	
	private PriorityQueue<Patinet> list = new PriorityQueue<Patinet>();
	private String name;
	private int severlity;
	
	public Patinet(String name, int severlity) {
		this.name = name;
		this.severlity = severlity;
	}
	
	public Patinet(PriorityQueue<Patinet> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public int getSeverlity() {
		return severlity;
	}
	
	public void display() {
		
		while(!list.isEmpty()) {
			System.out.println(list.poll().getName());
		}
	}

	@Override
	public String toString() {
		return "Patinet [name=" + name + ", severlity=" + severlity + "]";
	}
	
	
}
