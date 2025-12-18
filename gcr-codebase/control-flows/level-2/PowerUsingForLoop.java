import java.util.Scanner;

public class PowerUsingForLoop{
    public static void main(String[] args) {
        // Creating Scanner object and taking input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
        int number = sc.nextInt();
		System.out.print("Enter power : ");
		int power = sc.nextInt();
		int result = 1;

		// using for loop to calculate power
		for(int i = 1; i <= power; i++) result *= number;
		
		// printing result
		System.out.println(result);
		
		sc.close();
    }
}