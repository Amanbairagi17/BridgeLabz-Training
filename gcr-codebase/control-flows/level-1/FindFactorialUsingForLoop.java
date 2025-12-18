import java.util.Scanner;

public class FindFactorialUsingForLoop{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		//logic to calculate factorial using for loop
		int fact = 1;
		for(int i=1 ; i<=num ; i++){
			fact *= i;
		}
		
		//printing final output
		System.out.println("Final factorial using for loop is : " + fact);
				
		sc.close();
	}
}