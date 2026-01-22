package com.addbooksystem;

public class DriverClass {
    public static void main(String[] args) {
        AddressBook book = new AddressBook();

        Address a1 = new Address("Itarsi", "MP", "451115");
        Address a2 = new Address("Bhopal", "MP", "462001");

        Contact c1 = new Contact("Rahul", "Sharma",
                "999999999", "rahul@gmail.com", a1);

        Contact c2 = new Contact("Vansh", "Verma",
                "88888888", "vansh@gmail.com", a2);

        Contact c3 = new Contact("Aman", "bairagi",
                "7777777777", "aman@gmail.com", a2);

        book.addContact(c1);
        book.addContact(c2);
        book.addContact(c3);

        book.addContact(c1);

        book.editContact("Rahul Sharma", "4444444444", "rahul_new@gmail.com");

        book.searchByCityOrState("MP");

        book.deleteContact("Vansh verma");

        book.displaySortedContacts();
    }
}