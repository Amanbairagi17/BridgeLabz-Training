package com.tree.ecommerceproductinventory;

public class DriverClass {
	 public static void main(String[] args) {

	        Tree tree = new Tree();

	        // insert products
	        tree.insert(new Product(1050, "Laptop", 55000));
	        tree.insert(new Product(1020, "Mobile", 22000));
	        tree.insert(new Product(1080, "Headphones", 2500));
	        tree.insert(new Product(1010, "Keyboard", 1200));
	        tree.insert(new Product(1060, "Mouse", 800));

	        // sorted product list
	        tree.displaySorted();

	        //lookup - (search)
	        System.out.println("\nSearching SKU 1080:");
	        Product p = tree.search(1080);

	        if (p != null)
	            System.out.println(p.sku + " " + p.name + " ₹" + p.price);
	        else
	            System.out.println("Product not found");

	        // update price
	        System.out.println("\nUpdating price of SKU 1020");
	        boolean updated = tree.updatePrice(1020, 19999);

	        if (updated)
	            System.out.println("Price updated successfully");
	        else
	            System.out.println("SKU not found");

	        // display after update
	        System.out.println();
	        tree.displaySorted();
	    }
}
