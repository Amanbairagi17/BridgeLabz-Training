import java.util.Scanner;

public class PowerUsingWhileLoop{
    public static void main(String[] args) {
        // Creating Scanner object and taking input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
        int number = sc.nextInt();
		System.out.print("Enter power : ");
		int power = sc.nextInt();
		int result = 1;
		int counter = 1;

		// using while loop to calculate power
		while(counter <= power){
			result *= number;
			counter++;
		}
		
		// printing result
		System.out.println(result);
		
		sc.close();
    }
}