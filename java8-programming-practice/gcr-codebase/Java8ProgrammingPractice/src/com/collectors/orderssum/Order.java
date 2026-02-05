package com.collectors.orderssum;

public class Order {
    String customerName;
    double amount;

    public Order(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }
}

