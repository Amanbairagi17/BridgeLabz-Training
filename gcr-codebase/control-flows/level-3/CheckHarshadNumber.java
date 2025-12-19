import java.util.Scanner;

public class CheckHarshadNumber{
	public static void main(String[] args) {
		// Creating Scanner object and taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = sc.nextInt();
        int number = input;
        int sum = 0;

		// using while loop to find the sum of digits
        while (number != 0) {
            int curr = number % 10;
            sum = sum + curr;
            number = number / 10;
        }

        // Check harshad number and print result
        if (input % sum == 0) {
            System.out.println(input + " is Harshad Number");
        } else {
            System.out.println(input + " is not Harshad Number");
        }
        sc.close();
    }
}