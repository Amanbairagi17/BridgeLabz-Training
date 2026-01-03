package com.managingcustomeraccount;

import java.util.Scanner;

public class ApplicationDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account All Account detail : ");
		System.out.println("Enter Account number for saving account : ");
		String savingAccountNumber = sc.nextLine();
		
		System.out.println("Enter Amount for saving account : ");
		double amount = sc.nextDouble();
		
		System.out.println("Enter Account number for current account : ");
		String currentAccountNumber = sc.nextLine();
		
		Account savings = new SavingAccount(savingAccountNumber, amount);
	    Account current = new CurrentAccount(currentAccountNumber);

	    savings.deposit(2000);
	    current.deposit(5000);

	    System.out.println("Savings Balance: ₹" + savings.checkBalance());
	    System.out.println("Savings Interest: ₹" + savings.calculateInterest());

	    System.out.println("Current Balance: ₹" + current.checkBalance());
	    System.out.println("Current Interest: ₹" + current.calculateInterest());
	}
}
