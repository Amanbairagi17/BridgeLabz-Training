package com.functionalinterface.defaultmethod.paymentgatewayintegration;

public class PaymentApp {
    public static void main(String[] args) {

        PaymentProcessor paytm = new PaytmProcessor();
        paytm.pay(1000);
        paytm.refund(500);   // default method

        PaymentProcessor razorpay = new RazorpayProcessor();
        razorpay.pay(2000);
        razorpay.refund(1000); // overridden
    }
}
