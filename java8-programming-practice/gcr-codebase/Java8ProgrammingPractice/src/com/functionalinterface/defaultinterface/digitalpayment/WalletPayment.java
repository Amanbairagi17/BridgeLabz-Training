package com.functionalinterface.defaultinterface.digitalpayment;

public class WalletPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet");
    }
}
