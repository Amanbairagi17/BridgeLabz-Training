package com.supermarketbillingqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuperMarketApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BillingSystem billingSystem = new BillingSystem();
		
//		s.showItems();
//		Item item1 = new Item("Sugar", 20);
//		Item item2 = new Item("Rice", 80);
//		Item item3 = new Item("Salt", 40);
//		Item item4 = new Item("Tea", 20);
//		
//		List<Item> itmes = new ArrayList<Item>();
//		itmes.add(item4);
//		itmes.add(item1);
//		itmes.add(item2);
//		itmes.add(item3);
//		
//		Customer customer = new Customer("CSM0001", itmes);
//		Customer customer2 = new Customer("CSM0001", itmes);
//
//		Customer customer3 = new Customer("CSM0001", itmes);
//
//		Customer customer4 = new Customer("CSM0001", itmes);
//
//		s.addCustomerToQueue(customer);
//		s.proccessCustomer(customer4, itmes);
		
		Customer currentCustomer = null;

        while (true) {
            System.out.println("\n====== Super Market Billing System ======");
            System.out.println("1. Show Available Items");
            System.out.println("2. Create Customer");
            System.out.println("3. Add Item to Customer Cart");
            System.out.println("4. Add Customer to Billing Queue");
            System.out.println("5. Process Customer Billing");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1 -> {
                    billingSystem.showItems();
                }

                case 2 -> {
                    System.out.print("Enter Customer ID: ");
                    String customerId = sc.nextLine();
                    currentCustomer = new Customer(customerId, new ArrayList<>());
                    System.out.println("Customer created: " + customerId);
                }

                case 3 -> {
                    if (currentCustomer == null) {
                        System.out.println("Create customer first!");
                        break;
                    }

                    System.out.print("Enter Item Name: ");
                    String itemName = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    sc.nextLine();

                    Item item = new Item(itemName, qty);
                    billingSystem.buyItem(currentCustomer, item);
                }

                case 4 -> {
                    if (currentCustomer == null) {
                        System.out.println("Create customer first!");
                        break;
                    }

                    billingSystem.addCustomerToQueue(currentCustomer);
                    System.out.println("Customer added to billing queue");
                }

                case 5 -> {
                    if (currentCustomer == null) {
                        System.out.println("Create customer first!");
                        break;
                    }

                    List<Item> items = currentCustomer.getItemList();
                    billingSystem.proccessCustomer(currentCustomer, items);

                    // clear cart after billing
                    items.clear();
                }

                case 0 -> {
                    System.out.println("Exiting Super Market System...");
                    return;
                }

                default -> System.out.println("Invalid option");
            }
        }
		
	}
}
