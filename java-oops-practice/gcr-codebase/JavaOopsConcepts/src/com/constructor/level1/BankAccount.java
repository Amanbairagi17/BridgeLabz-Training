package com.constructor.level1;

public class BankAccount {
	//Attributes
	public String accountNumber;
	protected String accountHolder;
	private double balance; 
	
	//Constructor
	public BankAccount(String accountNumber, String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//set balance 
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//get balance
	public void getBalance() {
		System.out.println(this.balance);
	}
	
	//display properties
	void displayDetails() {
		System.out.println(this.accountHolder + " : " + this.accountNumber + " : " + this.balance);
	}
}
