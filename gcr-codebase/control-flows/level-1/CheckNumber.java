import java.util.Scanner;

public class CheckNumber{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int n = sc.nextInt();
		
		
		// Checking number is positive, negeative 
		if(n > 0) {
			System.out.println("Number is positive  ");
		}
		else if (n==0){
			System.out.println("Number is equal to zero  ");
		}
		else{
			System.out.println("Number is negeative  ");
		}
		
		sc.close();
	}
}