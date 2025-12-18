import java.util.Scanner;

public class CountDown{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int counter = sc.nextInt();
		
		// logic to calculate rocket launch countdown
		while(counter >= 1){
			System.out.println(counter);
			counter--;
		}
				
		sc.close();
	}
}