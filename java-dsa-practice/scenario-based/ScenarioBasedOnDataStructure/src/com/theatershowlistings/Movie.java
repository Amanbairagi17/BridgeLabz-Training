package com.theatershowlistings;

import java.time.LocalTime;

public class Movie {
	private String movieName;
	private LocalTime time;
	
	//constructor
	public Movie(String movieName, String time) {
		super();
		this.movieName = movieName;
		this.time = LocalTime.parse(time);
	}

	//getters
	public String getMovieName() {
		return movieName;
	}

	public LocalTime getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", time=" + time + "]";
	}
	
	
}
