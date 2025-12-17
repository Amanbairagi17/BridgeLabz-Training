import java.util.Scanner;

public class ConvertHeights{
	public static void main(String[] args){
		
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// taking input in inchs
		System.out.print("Enter Heights in Inchs ");
		int height = sc.nextInt();
		
		// calculating height in CM and feet
		double centimeters = height * 2.54;
		double foot = 12 * centimeters;
		
		
		
		
		System.out.println( "Your Height in cm is " +centimeters + " while in feet is " +foot + " and inches is " + height);
		
		
	}
}