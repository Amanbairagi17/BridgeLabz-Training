package com.gamerzone;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static void main(String[] args) {
		List<Player> players = new ArrayList<>();

		players.add(new Player("KL Rahul", 10));
		players.add(new Player("Virat Kohli", 1));
		players.add(new Player("Ben Stokes", 7));
		players.add(new Player("MS Dhoni", 9));
		players.add(new Player("Steve Smith", 5));
		players.add(new Player("Rohit Sharma", 2));
		players.add(new Player("David Warner", 8));
		players.add(new Player("Babar Azam", 6));
		players.add(new Player("Joe Root", 4));
		players.add(new Player("Kane Williamson", 3));

        
        SortByRanking s = new SortByRanking(players);
        s.display();
        s.sort();
        System.out.println("After Sorting : ");
        s.display();
	}
}
