package com.pharmacyinventorysystem;

import java.time.LocalDate;

public class Injection extends Medicine{

	public Injection(String name, double price, LocalDate expiryDate) {
		super(name, price, expiryDate);
	}
	
	@Override
	public boolean checkExpiry(LocalDate expiryDate) {
        // liquid meds expire earlier after opening
        return LocalDate.now().isAfter(expiryDate.minusDays(7));
    }

}