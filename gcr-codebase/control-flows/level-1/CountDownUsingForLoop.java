import java.util.Scanner;

public class CountDownUsingForLoop{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int counter = sc.nextInt();
		
		// logic to calculate rocket launch countdown
		for(;counter >= 1; counter--){
			System.out.println(counter);
		}
				
		sc.close();
	}
}