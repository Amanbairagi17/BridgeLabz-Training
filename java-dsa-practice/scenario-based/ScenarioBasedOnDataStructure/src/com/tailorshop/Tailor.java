package com.tailorshop;

public class Tailor {
	private String order;
	private int deadline;
	
	public Tailor(String order, int deadline) {
		super();
		this.order = order;
		this.deadline = deadline;
	}

	public String getOrder() {
		return order;
	}

	public int getDeadline() {
		return deadline;
	}

	@Override
	public String toString() {
		return "Tailor [order=" + order + ", deadline=" + deadline + "]";
	}
	
	
}
