package com.bankingmanagementsystem;

public class Account {
	public int amount;
	public int accno;
	public Account(int accno, int amount){
		this.accno = accno;
		this.amount = amount;
	}
	
	public void withdraw(int amount){
		if(this.amount < amount) System.out.println("Insufficient balance");
		else this.amount -= amount;
	}
	
	public void credit(int amount){
		this.amount += amount;
	}
}
