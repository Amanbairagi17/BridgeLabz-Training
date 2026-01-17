package com.robowarehouse;

import java.util.Arrays;

public class DriverClass {
	public static void main(String[] args) {
		Robot[] packs = {
				new Robot("Pack 1", 10), 
				new Robot("Pack 2", 20),
				new Robot("Pack 3", 5),
				new Robot("Pack 4", 15), 
				new Robot("Pack 5", 25)
		};
		
		SortWeight sortWeight = new SortWeight(packs);
		sortWeight.sort();
		
		System.out.println(Arrays.toString(packs));
	}
}
