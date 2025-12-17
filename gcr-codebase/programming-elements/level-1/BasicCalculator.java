import java.util.Scanner;

public class BasicCalculator{
	public static void main(String[] args){
		
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// taking input in num1 and num2
		System.out.print("Enter Number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int num2 = sc.nextInt();
		
		// performing operations like addition, subtraction, multiplication and division
		double addition = num1 + num2;
		double subtraction = num1>num2 ? num1 - num2 : num2 - num1;
		double multiplication = num1 * num2;
		double division = num1>num2 ? (double) num1/num2 : (double) num2/num1 ;
		
		//display all operations 
		System.out.printf( "The addition, subtraction, multiplication and division value of 2 numbers %d and %d is %f, %f, %f, and %f"
		,num1, num2, addition, subtraction,multiplication,division );
		
		
	}
}