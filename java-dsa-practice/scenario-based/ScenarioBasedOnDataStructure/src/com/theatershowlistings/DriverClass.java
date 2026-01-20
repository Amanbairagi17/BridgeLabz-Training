package com.theatershowlistings;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<>();

		 	movies.add(new Movie("Inception", "10:30"));
		 	movies.add(new Movie("Interstellar", "12:15"));
	        movies.add(new Movie("The Dark Knight", "14:45"));
	        movies.add(new Movie("Avengers: Endgame", "17:00"));
	        movies.add(new Movie("Titanic", "19:30"));
	        movies.add(new Movie("Jurassic Park", "11:00"));
	        movies.add(new Movie("Avatar", "16:20"));
	        movies.add(new Movie("Gladiator", "20:45"));
	        movies.add(new Movie("Forrest Gump", "09:50"));
	        movies.add(new Movie("The Matrix", "22:15"));
     
        SortByTime s = new SortByTime(movies);
        s.display();
        s.sortByTime();
        System.out.println("After Sorting : ");
        s.display();
	}
}
