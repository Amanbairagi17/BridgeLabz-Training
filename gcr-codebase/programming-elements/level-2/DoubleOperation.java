import java.util.Scanner;

public class DoubleOperation{
	public static void main(String[] args){
		
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// taking input a,b,c
		System.out.print("Enter a : ");
		double a = sc.nextDouble();
		System.out.print("Enter b : ");
		double b = sc.nextDouble();
		System.out.print("Enter c : ");
		double c = sc.nextDouble();
		
		
		//required operations
		System.out.println( a + b *c );
		System.out.println( a * b + c );
		System.out.println( c + a / b );
		System.out.println( a % b + c );
		
		
	}
}