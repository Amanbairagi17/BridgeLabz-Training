import java.util.Scanner;

public class SideOfSquare{
	public static void main(String[] args){
		
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// taking perimeter of square as input
		System.out.print("Enter perimeter of square : ");
		double perimeter = sc.nextDouble();
		
		
		//find side of square
		double sideOfSquare = perimeter / 4;
	
		System.out.printf( "The length of the side is %.2f whose perimeter is %.2f ",sideOfSquare, perimeter );
		
		
	}
}