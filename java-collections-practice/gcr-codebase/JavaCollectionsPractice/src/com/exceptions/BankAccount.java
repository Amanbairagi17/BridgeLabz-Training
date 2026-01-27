package com.exceptions;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        // unchecked exception
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        // checked custom exception
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println(
            "Withdrawal successful, new balance: " + balance
        );
    }
}
