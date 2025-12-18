import java.lang.String;
import java.util.Scanner;

public class DivisibleByFive{
	public static void main(String[] args){
		//Take input number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		if(n % 5 == 0){
			System.out.println("Is the number " +n+ " divisible by 5? "+ true );
		}
		else{
			System.out.println("Is the number " +n+ " divisible by 5? "+ false );	
		}
		
	}
}