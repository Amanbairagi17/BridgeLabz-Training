package com.managingcustomeraccount;

public class SavingAccount extends Account {

    private static final double INTEREST_RATE = 4.0;

    public SavingAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    //Overridden method to calculate interest
    public double calculateInterest() {
        return checkBalance() * INTEREST_RATE / 100;
    }
}
