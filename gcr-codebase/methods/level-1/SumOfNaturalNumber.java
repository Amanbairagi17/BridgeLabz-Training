import java.util.Scanner;

public class SumOfNaturalNumber{
	//method for finding sum of natural numbers
	private static int findSum(int n){
		int sum = 0;
		for(int i=1 ;i<=n ; i++){
			sum += i;
		}
		return sum;
	}
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students : ");
		int n = sc.nextInt();
		
		//find toatl sum  using method
		int totalSum = findSum(n);
		
		// printing the result
		System.out.println("The total sum of given number is  : " +totalSum);
		
		sc.close();
    }
}