package com.ewalletapplication;

public abstract class Wallet implements Transferrable {

    private double balance;   // protected from misuse

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    // referral bonus constructor
    public Wallet(double initialBalance, double referralBonus) {
        this.balance = initialBalance + referralBonus;
    }

    //getter for get balance
    public double getBalance() {
        return balance;
    }

    //c method for debit
    protected boolean debit(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    //logic for credit amount 
    protected void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    
    public void loadMoney(double amount) {
        credit(amount);
    }
}

