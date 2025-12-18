import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		
		//logic to print result
		for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
		sc.close();
	}
}