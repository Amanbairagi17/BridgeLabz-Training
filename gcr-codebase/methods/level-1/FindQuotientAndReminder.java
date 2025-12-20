import java.util.Scanner;

public class FindQuotientAndReminder{
	//method for finding quotient and reminder of number
	private static int[] findRemainderAndQuotient(int num1,int num2){
		int quotient = num1 > num2 ? num1 / num2 : num2 / num1;
		int reminder = num1 > num2 ? num1 % num2 : num2 % num1;
		return new int[]{quotient, reminder};
	}
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		
		//find quotient and reminder number using method
		int[] arr = new int[2];
		arr = findRemainderAndQuotient(num1, num2);
		
		// printing the result
		System.out.println("The reminder is : " +arr[1]+ " and  quotient is : " +arr[0]);
		
		sc.close();
    }
}