package com.geomeasuresolutions;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input line 1
        System.out.println("Enter coordinates for Line 1 (x1 y1 x2 y2):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // input line 2
        System.out.println("Enter coordinates for Line 2 (x1 y1 x2 y2):");
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();

        // create objects
        Line line1 = new Line(x1, y1, x2, y2);
        Line line2 = new Line(a1, b1, a2, b2);

        // calculate lengths
        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        // display lengths
        System.out.println("\nLength of Line 1 = " + length1);
        System.out.println("Length of Line 2 = " + length2);

        // compare
        if (length1 == length2) {
            System.out.println("Both lines are equal in length.");
        } else if (length1 > length2) {
            System.out.println("Line 1 is longer.");
        } else {
            System.out.println("Line 2 is longer.");
        }

        sc.close();
    }
}
