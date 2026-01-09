package com.digitalartmarketplace;

public class ArtifyApplication {
	public static void main(String[] args) {
		User user1 = new User("Ravi", 2000);
		User user2 = new User("Rampal", 3000);
		Artwork art1 = new PrintArt("Retellets", "Aman", 1000, user1);
		Artwork art2 = new DigitalArt("Avatar", "Raviraj", 1030, true, user2);
		
		art1.license();
		art1.purchase();
		
		art2.license();
		art2.purchase();
		
		
	}
}
