import java.util.*;

public class SimpleInterest{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount : ");
		int p = sc.nextInt();
		System.out.println("Enter Rate of Interest : ");
		int r = sc.nextInt();
		System.out.println("Enter time : ");
		int t = sc.nextInt();
		
		System.out.println( (p * r * t )/ 100 );
		
	}
}