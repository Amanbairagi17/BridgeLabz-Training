package com.pharmacyinventorysystem;

import java.time.LocalDate;

public class Syrup extends Medicine{

	public Syrup(String name, double price, LocalDate d) {
		super(name, price, d);
	}
	
	@Override
	public boolean checkExpiry(LocalDate expiryDate) {
        // liquid meds expire earlier after opening
        return LocalDate.now().isAfter(expiryDate.minusDays(7));
    }

}