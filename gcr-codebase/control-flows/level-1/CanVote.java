import java.util.Scanner;

public class CanVote{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age of a person : ");
		int n = sc.nextInt();
		
		
		// Checking number is positive and calculating sum and displaying
		if(n > 18) {
			System.out.printf("The person's age is %d and can vote : ",n);
		}
		else{
			System.out.printf("The person's age is %d and cannot vote : ",n);
		}
		
		sc.close();
	}
}