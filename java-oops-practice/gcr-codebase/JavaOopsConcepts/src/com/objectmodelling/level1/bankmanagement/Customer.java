package com.objectmodelling.level1.bankmanagement;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<BankAccounts> accounts;

    // constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // method to add bank account
    public void addAccount(BankAccounts account) {
        accounts.add(account);
    }

    // method to print balance
    public void viewBalance() {
        for (BankAccounts account : accounts) {
            System.out.println("Bank: " + account.bank().getName() + "  Balance: " + account.balance());
        }
    }
}