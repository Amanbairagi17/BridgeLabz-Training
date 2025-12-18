import java.util.Scanner;

public class MultiplesUsingForLoop{
    public static void main(String[] args) {
        // Creating Scanner object and taking input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
        int number = sc.nextInt();

        // Check input
        if (number <= 0 || number >= 100) {
			System.out.println("Enter number between 1 to 100");
			return;
		}
		// using for loop and printing multiples
		for (int i = 99; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
		
		sc.close();
    }
}