import java.util.Scanner;

public class FindQuotientAndReminder{
	public static void main(String[] args){
		
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// taking input num1 and num2
		System.out.print("Enter number1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2 : ");
		int num2 = sc.nextInt();
		
		
		//find quotieant and reminder 
		int quotieant = num1 > num2 ? num1 / num2 : num2 / num1;
		int reminder = num1 > num2 ? num1 % num2 : num2 % num1;
	
		System.out.printf( "The Quotient is %d and Reminder is %d of two number %d and %d ",quotieant, reminder, num1, num2 );
		
		
	}
}