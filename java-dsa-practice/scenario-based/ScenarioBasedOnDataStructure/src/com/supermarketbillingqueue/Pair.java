package com.supermarketbillingqueue;

public class Pair {
	public int stackQuantity;
	public double price;
	
	public Pair(int stackQuantity, double price) {
		this.stackQuantity = stackQuantity;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pair [stackQuantity=" + stackQuantity + ", price=" + price + "]";
	}

	public int getStockQuantity() {
		return this.stackQuantity;
	}

	public double getPrice() {
		return this.price;
	}

	public void reduceStock(int quantity) {
		this.stackQuantity -= quantity;
		
	}
	
	
}
