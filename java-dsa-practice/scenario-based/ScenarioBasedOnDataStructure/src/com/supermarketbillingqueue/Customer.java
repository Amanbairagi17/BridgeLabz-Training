package com.supermarketbillingqueue;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String customerId;
	private List<Item> itemList = new ArrayList<Item>();
	
	public Customer(String customerId, List<Item> itmeList) {
		this.customerId = customerId;
		this.itemList = itmeList;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
	
	
	
	
	
}
