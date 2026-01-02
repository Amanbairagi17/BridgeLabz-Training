package com.linkedlist.moviemanagementsystem;

public class MovieNode {
	String title;
	String director;
	int yearOfRelease;
	double rating;
	MovieNode prev;
	MovieNode next;
	
	MovieNode(String title, String director, int yearOfRelease, double rating) {
	        this.title = title;
	        this.director = director;
	        this.yearOfRelease = yearOfRelease;
	        this.rating = rating;
	}
	
}
