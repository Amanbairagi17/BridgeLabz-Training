package com.movietimesorting;

import java.util.Arrays;

public class MovieTime {
	public static void main(String[] args) {
		Movie[] movies = {
				new Movie("Movie 1", 150), 
				new Movie("Movie 2", 170), 
				new Movie("Movie 3", 140), 
				new Movie("Movie 4", 200), 
				new Movie("Movie 5", 180)
		};
		
		Sort s = new Sort(movies);
		s.sort();
		System.out.println(Arrays.toString(movies));
	}
}
