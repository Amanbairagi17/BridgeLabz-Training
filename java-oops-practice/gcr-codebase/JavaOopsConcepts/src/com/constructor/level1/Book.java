package com.constructor.level1;

public class Book {
	//Attribute 
	private String title;
	private String author;
	private double price;
	
	//Default constructor
	Book(){
		title = "Think and Grow Rich";
		author = "Napoliean Hills";
		price = 358.90;
	}
	
	//Parameterized Constructor
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
	
	
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("Java","Games Goshlin", 450.34);
	}

}
