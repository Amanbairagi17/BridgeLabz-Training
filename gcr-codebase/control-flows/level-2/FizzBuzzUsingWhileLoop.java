import java.util.Scanner;
public class FizzBuzzUsingWhileLoop{

    public static void main(String[] args) {
        // Creatint Scanner object and taking input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
        int num = sc.nextInt();
		int i = 1;
		
		// check input is positive
		if(num <= 0){
			System.out.println("Enter a positive number");
			return;
		}

		// using while loop, checking multiple and printing output
        while (i <= num) {
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
			i++;
        }
    }
}