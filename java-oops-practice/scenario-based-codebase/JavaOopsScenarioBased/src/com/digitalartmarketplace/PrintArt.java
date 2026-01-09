package com.digitalartmarketplace;


public class PrintArt extends Artwork{

	public PrintArt(String title, String artist, double price, User user) {
		super(title, artist, price, "Unlimited Print License",user);
	}
	
	public PrintArt(String title, String artist, double price,boolean hasPreview, User user) {
		super(title, artist, price, "Unlimited Print License",hasPreview, user);
	}
	
	
	@Override
	public void license(){
		System.out.println("Artist have " +super.getlicenseType());
	}
	
	
	

}
