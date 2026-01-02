package com.bankingmanagementsystem;

public class Customer extends Person{
	public int custId;
	public Customer(String name, int age, int custId){
		super(name, age);
		this.custId = custId;
	}
}
