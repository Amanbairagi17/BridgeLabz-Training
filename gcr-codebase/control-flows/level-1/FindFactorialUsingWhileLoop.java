import java.util.Scanner;

public class FindFactorialUsingWhileLoop{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		//logic to calculate factorial using while loop
		int fact = 1;
		int i=1 ;
		
		while(i<=num){
			fact *= i;
			i++;
		}
		
		//printing final output
		System.out.println("Final factorial using while loop is : " + fact);
				
		sc.close();
	}
}