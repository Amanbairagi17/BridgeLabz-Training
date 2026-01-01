package com.inheritance.hierarchicalinheritance.bankaccountstype;

public class BankAccount {
	public int accountNumber;
    public double balance;

    // constructor
    public BankAccount(int accountNumber2, double balance2) {
    	this.accountNumber = accountNumber;
        this.balance = balance;
	}

	// display details
    public void displayDetails() {
        System.out.println(accountNumber + " | " + balance);
    }
}
