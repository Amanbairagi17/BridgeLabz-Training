package com.constructor.level1;

public class SavingsAccount {
	public static void main(String[] args) {
		BankAccount b = new BankAccount("1111","Aman",200.0);
		b.displayDetails();
		b.setBalance(3000.0);
		b.getBalance();
		
	}
	
}
