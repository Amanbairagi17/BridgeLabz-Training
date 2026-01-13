package com.supermarketbillingqueue;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class BillingSystem {
	Queue<Customer> billingQueue = new ArrayDeque<Customer>();
	private final int MAX_QUEUE_SIZE = 10;
	private HashMap<String, Pair> itemMap = new HashMap<>();
	
	public BillingSystem() {   // ✅ constructor START

        itemMap.put("Milk", new Pair(50, 45.0));
        itemMap.put("Bread", new Pair(30, 30.0));
        itemMap.put("Rice", new Pair(100, 60.0));
        itemMap.put("Sugar", new Pair(40, 42.0));
        itemMap.put("Salt", new Pair(25, 20.0));
        itemMap.put("Tea", new Pair(60, 120.0));
        itemMap.put("Coffee", new Pair(35, 180.0));
        itemMap.put("Oil", new Pair(70, 150.0));
        itemMap.put("Soap", new Pair(90, 25.0));
        itemMap.put("Shampoo", new Pair(45, 220.0));

    }
	
	void addCustomerToQueue(Customer customer) {
		if(billingQueue.size() > 10) {
			System.out.println("Cannot Customer Queue is full, Queue Overflow");
			return;
		}
		
		billingQueue.offer(customer);
		System.out.println("Cutomer " +customer.getCustomerId() + "added to queue");
	}
	
	void removeCutomerToQueue() {
		if(billingQueue.isEmpty()) {
			System.out.println("Cnanot remvoe Customer form Queue, No Cutomer is here, Queue underfolw");
			return;
		}
		billingQueue.poll();
		System.out.println("Cutomer " +billingQueue.poll().getCustomerId() + "remove to queue");
		
	}
	
	//process customer through store 
	void proccessCustomer(Customer customer, List<Item> items) {

	    if (items.isEmpty()) {
	        System.out.println("No item added by customer " + customer.getCustomerId());
	        return;
	    }

	    double totalPrice = 0;

	    for (Item item : items) {

	        //  correct key check
	        if (!itemMap.containsKey(item.getItemName())) {
	            System.out.println(item.getItemName() + " is not available in store");
	            continue;
	        }

	        Pair storeItem = itemMap.get(item.getItemName());

	        //  use getter instead of private field
	        if (item.getQuantity() > storeItem.getStockQuantity()) {
	            System.out.println("Insufficient stock for " + item.getItemName());
	            continue;
	        }

	        // calculate price
	        totalPrice += item.getQuantity() * storeItem.getPrice();

	        // Reduce stock safely
	        storeItem.reduceStock(item.getQuantity());
	    }

	    //print bill once
	    System.out.println(
	        "Customer " + customer.getCustomerId() +
	        " purchased items worth ₹" + totalPrice
	    );
	}

	
	//show item available in store
	public void showItems() {
		for(String ele : itemMap.keySet()) {
			System.out.println(ele + " " + itemMap.get(ele));
		}
	}
	
	public void buyItem(Customer customer, Item item) {
		System.out.println("Item " + item.getItemName() + " added to customer item list.");
		customer.getItemList().add(item);
	}
	
	
}
