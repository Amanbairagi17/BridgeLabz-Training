package com.sensordataordering;

public class Data {
	private int id;
	private int temp;
	
	Data(int id, int temp){
		this.id = id;
		this.temp = temp;
	}

	public int getId() {
		return id;
	}

	public int getTemp() {
		return temp;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", temp=" + temp + "]";
	}
	
	
}
