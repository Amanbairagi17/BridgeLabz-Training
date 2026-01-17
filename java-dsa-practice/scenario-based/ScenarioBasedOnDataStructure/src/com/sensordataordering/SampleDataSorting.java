package com.sensordataordering;

import java.util.Arrays;

public class SampleDataSorting {
	public static void main(String[] args) {
		Data[] samples = {
				new Data(0, 30),
				new Data(2, 40),
				new Data(3, 33),
				new Data(4, 31),
				new Data(5, 37)
		};
		
		SortData s = new SortData(samples);
		s.display();
		s.sort();
		System.out.println(Arrays.toString(samples));
		System.out.println("After Sorting");
		s.display();
		
	}
}
