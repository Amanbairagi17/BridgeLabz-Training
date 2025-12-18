import java.util.Scanner;

public class SumOfNumbersUntilZero{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		double num = sc.nextDouble();
		
		double sum = 0;
		
		// using while loop for taking input and sum
		while(num != 0){
			sum += num;
			System.out.print("Enter zero : ");
			num = sc.nextDouble();
		}
		
		//print the final output
		System.out.print(sum);
		
				
		sc.close();
	}
}