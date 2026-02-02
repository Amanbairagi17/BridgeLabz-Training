package com.lambdaexpression.smarthomelighting;

public class SmartHomeLighting {
	public static void main(String[] args) {
		Controlable c1 = () -> System.out.println("Light for motion");
		Controlable c2 = () -> System.out.println("Light for night");
		Controlable c3 = () -> System.out.println("Light for voice");
		
		c1.activate();
		c2.activate();
		c3.activate();
	}
}
