package com.movietimesorting;

public class Movie {
	private String name;
	private int price;
	
	public Movie(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getTime() {
		return price;
	}
	
	public String toString() {
		return "Movie name : " +this.name + " price : " +this.price;
	}
	
	
}
