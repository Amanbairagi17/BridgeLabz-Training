package com.managingcustomeraccount;

public abstract class Account implements ITransaction {

    protected String accountNumber;   // protected → accessible to child classes
    private double balance;            // encapsulated

    // Constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // Constructor with opening balance
    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    //method for deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    //method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    //method to check balance
    public double checkBalance() {
        return balance;
    }

    // abstract method
    public abstract double calculateInterest();
}
