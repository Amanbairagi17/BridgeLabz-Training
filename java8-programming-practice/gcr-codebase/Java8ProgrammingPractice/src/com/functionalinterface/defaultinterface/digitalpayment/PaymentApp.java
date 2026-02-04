package com.functionalinterface.defaultinterface.digitalpayment;

public class PaymentApp {
    public static void main(String[] args) {

        Payment payment;

        payment = new UpiPayment();
        payment.pay(500);

        payment = new CreditCardPayment();
        payment.pay(1200);

        payment = new WalletPayment();
        payment.pay(300);
    }
}
