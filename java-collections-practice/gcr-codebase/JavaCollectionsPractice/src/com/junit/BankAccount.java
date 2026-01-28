package com.junit;

public class BankAccount {

    private double balance;

    // constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    // withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }

        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }

        balance -= amount;
    }

    // get current balance
    public double getBalance() {
        return balance;
    }
}
