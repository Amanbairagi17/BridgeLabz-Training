import java.util.Scanner;

public class IntOperation{
	public static void main(String[] args){
		
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// taking input a,b,c
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		System.out.print("Enter c : ");
		int c = sc.nextInt();
		
		
		//required operations
		System.out.println( a + b *c );
		System.out.println( a * b + c );
		System.out.println( c + a / b );
		System.out.println( a % b + c );
		
		
	}
}