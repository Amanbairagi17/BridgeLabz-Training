package com.functionalinterface.markerinterfaces.sensitivedatatagging;

public class BankAccount implements SensitiveData {

    private String accountNumber;
    private String ifscCode;

    public BankAccount(String accountNumber, String ifscCode) {
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }
}
