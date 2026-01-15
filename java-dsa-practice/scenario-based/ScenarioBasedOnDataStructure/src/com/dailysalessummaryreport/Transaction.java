package com.dailysalessummaryreport;

import java.time.LocalDate;

public class Transaction {
	private LocalDate date;
	private double amount;
	
	public Transaction(String date, double amount) {
		this.date = LocalDate.parse(date);
		this.amount = amount;
	}
	
	public LocalDate getLocalDate() {
		return this.date;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public String toString() {
		return "Date : " + this.date + " : amount : " + this.amount;
	}
	
}
