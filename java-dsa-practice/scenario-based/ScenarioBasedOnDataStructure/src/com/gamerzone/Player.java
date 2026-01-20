package com.gamerzone;

public class Player {
	private String name;
	private int ranking;
	
	//constructor
	public Player(String name, int ranking) {
		super();
		this.name = name;
		this.ranking = ranking;
	}

	////getters
	public String getName() {
		return name;
	}

	public int getRanking() {
		return ranking;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", ranking=" + ranking + "]";
	}
	
}
