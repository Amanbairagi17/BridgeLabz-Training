import java.util.Scanner;

public class SumOfNaturalNumber{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		
		// Checking number is positive and calculating sum and displaying
		if(n > 1) {
			int totalSum = n * (n + 1) /2;
			System.out.print("The sum of " +n+ " natural numbers is : " +totalSum);
		}
		else{
			System.out.print("The number " +n+ "is not a natural number" );
		}
		
		sc.close();
	}
}