package com.objectmodelling.level1.bankmanagement;

//we are using record for less boiler plate code 
public record BankAccounts(Customer customer, Bank bank, double balance) {

}
