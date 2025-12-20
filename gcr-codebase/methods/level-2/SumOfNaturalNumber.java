import java.util.Scanner;

public class SumOfNaturalNumber{	
	//finding sum of n number
	private static int getSum(int n){
		int sum = n * (n+1) / 2;
		return sum;
	}
	
	//finding sum using recursion
	private static int getSumUsingRecursion(int n){
		if(n== 0 || n==1) return n;
		return n + getSumUsingRecursion(n-1);
	}
	
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		// calling function to get sum of natural numbers
		int sum = getSum(n);
		int sumUsingRecursion = getSumUsingRecursion(n);
		
		
		// printing the result
		if(sumUsingRecursion == sum) System.out.println("Both sum are equal, Sum using recursion " +sumUsingRecursion+ " and final sum : " +sum);
		else System.out.println("Sum is not equal");
		
		sc.close();
    }
}