package com.addbooksystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                System.out.println("Duplicate contact not allowed");
                return;
            }
        }
        contacts.add(contact);
    }

    public void editContact(String name, String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                c.setPhone(newPhone);
                c.setEmail(newEmail);
                System.out.println("Contact updated: " + name);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public void deleteContact(String name) {
        for(Contact contact : contacts) {
        	if(contact.getFullName().equalsIgnoreCase(name)) {
        		contacts.remove(contact);
        		System.out.println("Contact removed" + contact.getFullName());
        		return;
        	}
        }
        System.out.println("Contact not found");
    }

    public void searchByCityOrState(String value) {
        System.out.println("Search Results:");
        for (Contact c : contacts) {
            if ((c.getAddress().getCity().equalsIgnoreCase(value) || c.getAddress().getState().equalsIgnoreCase(value))) {
                System.out.println(c);
            }
        }
    }

    public void displaySortedContacts() {
        Collections.sort(contacts, (a, b) -> a.getFullName().compareTo(b.getFullName()));

        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}