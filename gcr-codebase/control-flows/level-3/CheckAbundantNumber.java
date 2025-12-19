import java.util.Scanner;

public class CheckAbundantNumber {
    public static void main(String[] args) {
		// creating scanner object and taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int input = sc.nextInt();
        int sum = 0;

        // using for loop to calculate sum of divisors
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                sum = sum + i;
            }
        }

		// Checking abundant number and printing results
        if (sum > input) {
            System.out.println(input + " is Abundant Number");
        } else {
            System.out.println(input + " is not Abundant Number");
        }
		sc.close();
    }
}