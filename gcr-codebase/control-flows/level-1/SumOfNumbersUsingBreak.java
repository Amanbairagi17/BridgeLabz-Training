import java.util.Scanner;

public class SumOfNumbersUsingBreak{
	public static void main(String[] args){
		// Creating scanner class object and declaring varible for sum
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		
		// using while loop for taking input and sum
		while(true){
			System.out.print("Enter zero : ");
			double num = sc.nextDouble();
			if(num <=0) break;
			sum += num;			
			
		}
		
		//print the final output
		System.out.print(sum);
		
				
		sc.close();
	}
}