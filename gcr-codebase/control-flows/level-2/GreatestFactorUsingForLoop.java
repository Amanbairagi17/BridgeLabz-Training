import java.util.Scanner;

public class GreatestFactorUsingForLoop{
    public static void main(String[] args) {
        //Creating Scanner object, taking input and initiallizing variables
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
        int number = sc.nextInt();
		int greatestFactor = 1;

        // using for loop to print result
        for(int i = number-1; i > 1; i--){
			if(number%i == 0){
				greatestFactor = i;
				break;
			}
		}
		
		// printing the result
		System.out.println(greatestFactor);
		
		sc.close();
    }
}