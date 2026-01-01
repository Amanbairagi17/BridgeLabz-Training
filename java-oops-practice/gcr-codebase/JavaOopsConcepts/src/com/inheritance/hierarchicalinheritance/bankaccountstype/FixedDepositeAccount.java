package com.inheritance.hierarchicalinheritance.bankaccountstype;

public class FixedDepositeAccount extends BankAccount{
	public int lockPeriod;

    // constructor
	public FixedDepositeAccount(int accountNumber2, double balance2, int lockPeriod) {
		super(accountNumber2, balance2);
	        this.lockPeriod = lockPeriod;
	}

    // display
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
