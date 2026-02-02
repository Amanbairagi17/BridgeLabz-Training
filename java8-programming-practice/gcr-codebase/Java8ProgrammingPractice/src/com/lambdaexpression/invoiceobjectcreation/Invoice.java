package com.lambdaexpression.invoiceobjectcreation;

public class Invoice {
    int transactionId;

    public Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice{transactionId=" + transactionId + "}";
    }
}
