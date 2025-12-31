package com.objectmodelling.level1.bankmanagement;

public class BankManagementSystem {
	public static void main(String[] args) {
		// creating object
        Bank bank1 = new Bank("State Bank");
        Customer customer = new Customer("Aman");

        bank1.openAccount(customer, 5000);
        bank1.openAccount(customer, 12000);

        customer.viewBalance();
        
        Bank bank2 = new Bank("Pujab National Bank");
        Customer customer2 = new Customer("Kanha");
        
        bank2.openAccount(customer2, 40000);
        bank2.openAccount(customer2, 700000);
        customer2.viewBalance();
    }
}
