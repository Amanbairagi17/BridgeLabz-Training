package com.dailysalessummaryreport;

import java.util.Arrays;
import java.util.Scanner;

public class MartApp {
	public static void main(String[] args) {
		Transaction[] list = {
				new Transaction("2026-01-05", 100),
				new Transaction("2026-01-10", 1000),
				new Transaction("2026-01-10", 500),
				new Transaction("2026-01-10", 1000),
				new Transaction("2026-01-02", 100)
		};
		
		SortData d = new SortData(list);
		System.out.println(Arrays.toString(list));
		d.sortTransaction();
		System.out.println(Arrays.toString(list));

	}
}
