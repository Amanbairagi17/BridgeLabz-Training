package com.digitalartmarketplace;

public class DigitalArt extends Artwork{

	public DigitalArt(String title, String artist, double price, User user) {
		super(title, artist, price, "Non-Exlusive License", user);
	}
	
	public DigitalArt(String title, String artist, double price,boolean hasPreview, User user) {
		super(title, artist, price, "Non-Exlusive License",hasPreview, user);
	}
	
	@Override
	public void license(){
		System.out.println("Artist have " +super.getlicenseType());
	}

}
