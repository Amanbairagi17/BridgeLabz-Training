import java.util.Scanner;

public class ComparingSumUsingForLoop{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int sum = 0;
		//checking number is natural or not 
		if(num <= 0){
			System.out.println("The number entered is not a natural number");
			return;
		}
		
		//logic to find sum of natural number using for loop
		for(int i=1 ; i<=num ; i++){
				sum += i;
		}
		
		int sumUsingFormula = num * (num + 1) / 2;
		
		
		//comparing sum and printing the final output
		if(sumUsingFormula == sum){
			System.out.println("Sum is equal using for loop and formula, the sum is " + sumUsingFormula);
		}
				
		sc.close();
	}
}