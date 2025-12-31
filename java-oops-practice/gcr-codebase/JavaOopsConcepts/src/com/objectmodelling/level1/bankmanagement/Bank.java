package com.objectmodelling.level1.bankmanagement;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<BankAccounts> accounts;

    // constructor
    public Bank(String bankName) {
        this.name = bankName;
        this.accounts = new ArrayList<>();
    }

    // method to open account
    public BankAccounts openAccount(Customer customer, int balance) {
        BankAccounts account = new BankAccounts(customer, this, balance);
        accounts.add(account);
        customer.addAccount(account);
        return account;
    }
    
    // method to return bank name
    public String getName() {
    	return name;
    }
}
