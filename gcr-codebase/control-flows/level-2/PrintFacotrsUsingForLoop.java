import java.util.Scanner;

public class PrintFacotrsUsingForLoop{

    public static void main(String[] args) {
        //Creating Scanner object and taking input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
        int number = sc.nextInt();

        // using for loop to print result
        for (int i = 1; i < number; i++) {
            if(number%i == 0) System.out.println(i + " is a factor");
        }
		
		sc.close();
    }
}