package com.functionalinterface.markerinterfaces.sensitivedatatagging;

public class SecuritApp {
    public static void main(String[] args) {

        UserCredentials user = new UserCredentials("aman", "secret123");
        BankAccount account = new BankAccount("1234567890", "SBIN0001");
        Product product = new Product("Laptop");

        EncryptionService.encryptIfSensitive(user);
        EncryptionService.encryptIfSensitive(account);
        EncryptionService.encryptIfSensitive(product);
    }
}
