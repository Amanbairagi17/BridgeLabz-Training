package com.addbooksystem;

public class Address {
    private String city;
    private String state;
    private String zip;

    public Address(String city, String state, String zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
        return state;
    }

    public String toString() {
        return city + " " + state + " " + zip;
    }
}