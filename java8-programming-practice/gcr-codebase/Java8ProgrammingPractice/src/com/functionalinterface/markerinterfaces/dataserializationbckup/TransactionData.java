package com.functionalinterface.markerinterfaces.dataserializationbckup;

public class TransactionData implements BackupSerializable {

    private int transactionId;
    private double amount;

    public TransactionData(int transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
}
