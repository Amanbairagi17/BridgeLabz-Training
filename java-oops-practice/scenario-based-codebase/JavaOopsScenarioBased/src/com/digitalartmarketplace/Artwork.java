package com.digitalartmarketplace;

public abstract class Artwork implements IPurchasable{
	 private String title;
	 private String artist;
	 private double price;
	 private String licenceType;
	 private boolean preview;
	 private User user;
	 
	 //constructor without preview
	 public Artwork(String title, String artist, double price, String licenceType, User user) {
		super();
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenceType = licenceType;
		this.user = user;
	 }
	 
	 //with preview 
	 public Artwork(String title, String artist, double price, String licenceType, boolean preview, User user) {
		this(title,artist,price,licenceType, user);
		this.preview = preview;
	}
	 
	public abstract void license(); 
	 
	
	public String getlicenseType() {
		return this.licenceType;
	}
	
	public void purchase() {
		if(user.getWalletBalance() < this.price) {
			System.out.println("User have Insufficient Balance !!");
			
		}
		else {
			///user.getWalletBalance() =  user.getWalletBalance() - this.price;
			double leftBalance = user.getWalletBalance() - this.price;
			user.setWalletBalance(leftBalance);
			
			transaction();
		}
	}
	
	public void transaction() {
		System.out.println(user.getUserName() + " purcahse " + this.title + " Art in " +this.price 
				+ ", "+ this.artist + " is the artist of that and having " +this.licenceType
		);
	}
	
	 
	 
	 
}
