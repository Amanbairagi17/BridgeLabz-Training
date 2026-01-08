package com.pharmacyinventorysystem;

import java.time.LocalDate;

public class Tablet extends Medicine{

	public Tablet(String name, double price, LocalDate d) {
		super(name, price, d);
	}
	
	@Override
	public boolean checkExpiry(LocalDate suexpiryDate) {
        // liquid meds expire earlier after opening
        return LocalDate.now().isAfter(expiryDate.minusDays(7));
    }

}
