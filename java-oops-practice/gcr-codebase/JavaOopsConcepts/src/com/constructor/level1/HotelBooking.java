package com.constructor.level1;

public class HotelBooking {
	//Attributes
	private String guestName;
	private String roomType;
	private int nights;
	
	//Default Constructor
	HotelBooking(){
		guestName = "Aman Bairagi";
		roomType = "A.C.";
		nights = 2;
	}
	
	//Parameterized Constructor
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	//Copy Constructor
	HotelBooking(HotelBooking b){
		this.guestName = b.guestName;
		this.roomType = "Non A.C.";
		this.nights = b.nights;
	}
	
	void displayDetail() {
		System.out.println(this.guestName + " : " + this.roomType + " :  " + this.nights);
	}
	
	public static void main(String[] args) {
		HotelBooking hb = new HotelBooking();
		hb.displayDetail();
		HotelBooking hb1 = new HotelBooking("Unknown","A.C",4);
		hb1.displayDetail();
		HotelBooking hb2 = new HotelBooking(hb1);
		hb2.displayDetail();
	}
	
	
	
}
