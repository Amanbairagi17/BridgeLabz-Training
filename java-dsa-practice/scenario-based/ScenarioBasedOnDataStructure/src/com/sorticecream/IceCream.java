package com.sorticecream;

public class IceCream {
	private String flavors;
	private int soldQuantity;
	
	public IceCream(String flavors, int soldQuantity) {
		super();
		this.flavors = flavors;
		this.soldQuantity = soldQuantity;
	}

	public String getFlavors() {
		return flavors;
	}

	public int getSoldQuantity() {
		return soldQuantity;
	}

	
	@Override
	public String toString() {
		return "IceCream [flavors=" + flavors + ", soldQuantity=" + soldQuantity + "]";
	}
	
	
	
}
