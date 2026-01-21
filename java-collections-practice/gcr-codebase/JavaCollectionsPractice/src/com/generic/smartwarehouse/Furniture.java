package com.generic.smartwarehouse;

public class Furniture extends WarehouseItem{

	 public Furniture(int id, String name, double price) {
	        super(id, name, price);
	    }
	 @Override
	 public String getCategory() {
	     return "Furnitures";
	 }
}