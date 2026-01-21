package com.generic.smartwarehouse;

public class Electronics extends WarehouseItem{

	 public Electronics(int id, String name, double price) {
	        super(id, name, price);
	    }
	 @Override
	 public String getCategory() {
	     return "Electronics";
	 }

}
