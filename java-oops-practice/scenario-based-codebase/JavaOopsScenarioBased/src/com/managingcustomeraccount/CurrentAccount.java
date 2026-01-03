package com.managingcustomeraccount;

public class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 1.5;

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

   //Overridden method to calculate interest -> also using this method for polymorphism
    public double calculateInterest() {
        return checkBalance() * INTEREST_RATE / 100;
    }
}

