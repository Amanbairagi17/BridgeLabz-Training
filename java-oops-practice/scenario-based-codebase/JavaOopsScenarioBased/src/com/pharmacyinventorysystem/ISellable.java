package com.pharmacyinventorysystem;

import java.time.LocalDate;

public interface ISellable {
	double sell(int quantity);
	boolean checkExpiry(LocalDate d);
}
