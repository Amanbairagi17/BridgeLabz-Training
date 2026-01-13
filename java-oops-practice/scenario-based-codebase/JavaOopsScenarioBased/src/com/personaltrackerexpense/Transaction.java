package com.personaltrackerexpense;

public class Transaction {
	//Attribute field
    private double amount;
    private String type;     // INCOME / EXPENSE
    private String date;
    private String category;

    //constructor 
    public Transaction(double amount, String type, String date, String category) {
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.category = category;
    }

    //getters
    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }
}
