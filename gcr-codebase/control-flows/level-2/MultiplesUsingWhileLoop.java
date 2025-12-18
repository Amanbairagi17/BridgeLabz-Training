import java.util.Scanner;

public class MultiplesUsingWhileLoop{
    public static void main(String[] args) {
        // Creating Scanner object and taking input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
        int number = sc.nextInt();
		int i = 99;

        // Check input
        if (number <= 0 || number >= 100) {
			System.out.println("Enter number between 1 to 100");
			return;
		}
		// using while loop and printing multiples
		while(i >= 1) {
            if (i % number == 0) {
                System.out.println(i);
            }
			i--;
        }
		
		sc.close();
    }
}