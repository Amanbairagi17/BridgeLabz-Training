import java.util.Scanner;

public class BasicCalculator{
	private static void add(int n1, int n2){
		System.out.println(n1 + n2);
	}
	
	private static void substract(int n1, int n2){
		System.out.println(n1 - n2);
	}
	
	private static void divide(int n1, int n2){
		System.out.println(n1 / n2);
	}
	
	private static void multiply(int n1, int n2){
		System.out.println(n1 * n2);
	}
	
	public static void main(String[] args){
		// creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.print("Enter operator to add, substract, multiply and divide : ");
		char ope = sc.next().charAt(0);
		
		//switch case to select operation
		switch(ope){
			case('+') : 
				add(n1, n2);
				break;
			case('-') : 
				substract(n1, n2);
				break;
			case('/') : 
				divide(n1, n2);
				break;
			case('*') : 
				multiply(n1, n2);
				break;
			default : System.out.println("Enter valid operation !!");
		}
		
	}
}