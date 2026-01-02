package com.patientmanagementsystem;

public class Bill implements Payable {
    private double amount;
    private double taxRate;
    private double discount;

    public Bill(double amount, double taxRate, double discount) {
        this.amount = amount;
        this.taxRate = taxRate;
        this.discount = discount;
    }

    @Override
    public double calculatePayment() {
        double tax = amount * taxRate;
        return amount + tax - discount;
    }
}

