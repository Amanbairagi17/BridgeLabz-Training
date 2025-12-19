import java.util.Scanner;

public class CheckArmstrongNumber{
    public static void main(String[] args) {
		// Creating scanner object and taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int input = sc.nextInt();
        int num = input;
        int sum = 0;
		
		// using while and %10 to access the last digit of number, /10 to reduce the number
        while (num != 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }
		
		// checking and printing the result
        if (sum == input) {
            System.out.println(input + " is an Armstrong Number");
        } else {
            System.out.println(input + " is NOT an Armstrong Number");
        }
        sc.close();
    }
}