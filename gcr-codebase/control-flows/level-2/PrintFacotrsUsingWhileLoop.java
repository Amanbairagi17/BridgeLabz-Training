import java.util.Scanner;

public class PrintFacotrsUsingWhileLoop{
    public static void main(String[] args) {
        //Creating Scanner object and taking input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
        int number = sc.nextInt();
		int i = 1;

        // using for while to print result
        while(i < number){
            if(number%i == 0) System.out.println(i + " is a factor");
			i++;
        }
		
		sc.close();
    }
}