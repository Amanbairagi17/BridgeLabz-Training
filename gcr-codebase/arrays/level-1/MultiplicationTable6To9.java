import java.util.Scanner;

public class MultiplicationTable6to9{
    public static void main(String[] args) {
		// Creating Scanner Object, taking input and initializing array
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		int[] arr = new int[4];
		
		// Using a for loop to store the multiplication table in array
		for(int i = 6; i < 10; i++){
			arr[i-6] = (i) * number;
		}
		
		// Printing the table using for loop
		for(int i = 6; i < 10; i++){
			System.out.println(number + " * " + (i) + " = " + arr[i-6]);
		}

		sc.close();
    }
}