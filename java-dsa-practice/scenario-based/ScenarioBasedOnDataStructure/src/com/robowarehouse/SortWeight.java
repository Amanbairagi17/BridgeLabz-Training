package com.robowarehouse;

import java.util.ArrayList;
import java.util.List;

public class SortWeight {
	private Robot[] packs = new Robot[5];
	
	public SortWeight(Robot[] pack) {
		this.packs = pack;
	}
	
	void sort() {
		int n = packs.length;
		
		for(int i = 1; i < n; i++) {
			int j = i-1;
			while(j >= 0 && packs[j].getWeight() > packs[j+1].getWeight()) {
				Robot temp = packs[j];
				packs[j] = packs[j+1];
				packs[j+1] = temp;
				j--;
			}
		}
			
	}

	
	void display() {
		for(Robot b : packs) {
			System.out.println("Robot Id : " + b.getRobotId() + " Robot Weight : " +b.getWeight());
		}
	}
}
