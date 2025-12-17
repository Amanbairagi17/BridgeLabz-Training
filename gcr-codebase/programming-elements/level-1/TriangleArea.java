import java.util.Scanner;

public class TriangleArea{
	public static void main(String[] args){
		
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// taking input base and height in inchs
		System.out.print("Enter base in Inchs : ");
		double base = sc.nextDouble();
		System.out.print("Enter height in inchs : ");
		double height = sc.nextDouble();
		
		//find area of triangle in inchs and CM
		double areaInInches = 0.5 * base * height;
		double areaInCentimeters = areaInInches * 2.54 * 2.54;
		
		//display area of rectangle 
		System.out.printf( "Area of triangle is %.2f square inches and %.2f square centimeters",
            areaInInches, areaInCentimeters );
		
		
	}
}