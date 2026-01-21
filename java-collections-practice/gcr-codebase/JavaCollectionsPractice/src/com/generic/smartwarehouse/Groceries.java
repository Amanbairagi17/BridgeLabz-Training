package com.generic.smartwarehouse;

public class Groceries extends WarehouseItem{

	 public Groceries(int id, String name, double price) {
	        super(id, name, price);
	    }
	 @Override
	 public String getCategory() {
	     return "Groceries";
	 }

}
