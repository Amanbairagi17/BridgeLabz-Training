import java.util.Scanner;

public class LargestNumber{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter third number : ");
		int num3 = sc.nextInt();
		
		
		// Checking largest and printing the result
		if(num1 > num2 && num1 > num3) {
			System.out.println("The number first number is largest");
		}else if(num2 > num1 && num2 > num3){
			System.out.println("The number second number is largest");
		}else{
			System.out.println("The number third number is largest");
		}
		
		sc.close();
	}
}