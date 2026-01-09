package com.digitalartmarketplace;

public class User {
	private String userName;
	private double walletBalance;
	
	public User(String userName, double walletBalance) {
		this.userName = userName;
		this.walletBalance = walletBalance;
	}
	
	public double getWalletBalance() {
		return this.walletBalance;
	}
	
	public void setWalletBalance(double price) {
		this.walletBalance = price;
	}
	
	public String getUserName() {
		return userName;
	}
	
}
