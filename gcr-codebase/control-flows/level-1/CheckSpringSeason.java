import java.util.Scanner;

public class CheckSpringSeason{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a day  : ");
		int day = sc.nextInt();
		System.out.print("Enter a month : ");
		int month = sc.nextInt();
		
		
		// Checking given day month is consider as spring season 
		if((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 20)){
			System.out.println("Its a Spring Season");
		}
		else{
			System.out.println("Its not Spring Season");
		}
		
		sc.close();
	}
}