import java.util.Scanner;

public class FindFactorial{
	// functions to get factorail of a number using recursion 
	private static int findFactorial(int num){
		if(num <= 1) return 1;
		
		return num * findFactorial(num-1);
	}
	public static void main(String[] args){
		// creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		
		// calling fucntion to print output
		System.out.println(findFactorial(num));
		
	}
}