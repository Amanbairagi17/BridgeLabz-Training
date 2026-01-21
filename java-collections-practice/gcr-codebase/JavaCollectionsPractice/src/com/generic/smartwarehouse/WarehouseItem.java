package com.generic.smartwarehouse;

public abstract class WarehouseItem {
		 private int id;
		 private String name;
		 private double price;

	    public WarehouseItem(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public abstract String getCategory();

	    public void display() {
	        System.out.println(
	                "ID: " + id +
	                ", Name: " + name +
	                ", Price: " + price +
	                ", Category: " + getCategory()
	        );
	    }
}
