package com.pharmacyinventorysystem;

import java.time.LocalDate;

public class MedicalApp {
	public static void main(String[] args) {
		Medicine tablet1 = new Tablet("Paracetamol",10.0,LocalDate.of(2026, 1, 18) );

        Medicine tablet2 = new Syrup("Aspirin",5.0,LocalDate.of(2025, 6, 1));

        Medicine tablet3 = new Injection( "Vitamin C", 15.0,LocalDate.of(2024, 12, 31));

        System.out.println(tablet1.sell(5));
        System.out.println(tablet2.sell(87));
        System.out.println(tablet3.sell(8));
	}
}
