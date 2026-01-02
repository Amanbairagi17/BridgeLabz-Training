package com.ewalletapplication;

public class DriverClass {
	 public static void main(String[] args) {

	        Wallet amanWallet = new PersonalWallet(5000, 500); // referral bonus
	        Wallet shopWallet = new BusinessWallet(20000);

	        User aman = new User(1, "Aman", amanWallet);
	        User shop = new User(2, "Tech Store", shopWallet);

	        System.out.println("Initial Balances:");
	        System.out.println("Aman: ₹" + aman.getWallet().getBalance());
	        System.out.println("Shop: ₹" + shop.getWallet().getBalance());

	        System.out.println("\nAman sends money to Shop...");
	        aman.getWallet().transferTo(shop, 3000);

	        System.out.println("\nUpdated Balances:");
	        System.out.println("Aman: ₹" + aman.getWallet().getBalance());
	        System.out.println("Shop: ₹" + shop.getWallet().getBalance());

	        System.out.println("\nShop sends cashback to Aman...");
	        shop.getWallet().transferTo(aman, 1000);

	        System.out.println("\nFinal Balances:");
	        System.out.println("Aman: ₹" + aman.getWallet().getBalance());
	        System.out.println("Shop: ₹" + shop.getWallet().getBalance());
	    }
}
