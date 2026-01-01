package com.inheritance.hierarchicalinheritance.bankaccountstype;

public class DriverClass {
	public static void main(String[] args) {
		// creating object
        SavingsAccount savingsAccount = new SavingsAccount(0, 1000, 10);
        CheckingAccount checkingAccount = new CheckingAccount(1, 1000, 100);
        FixedDepositeAccount fixedDepositAccount = new FixedDepositeAccount(2, 1000, 10);

        savingsAccount.displayAccountType();
        savingsAccount.displayDetails();
        checkingAccount.displayAccountType();
        checkingAccount.displayDetails();
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayDetails();
    }
}
