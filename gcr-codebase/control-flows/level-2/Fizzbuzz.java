import java.util.Scanner;
public class FizzBuzz{

    public static void main(String[] args) {
        // Creatint Scanner object and taking input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
        int number = sc.nextInt();
		
		// check input is positive
		if(number <= 0){
			System.out.println("Enter a positive number");
			return;
		}

		// using for loop, checking multiple and printing output
        for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
				System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}