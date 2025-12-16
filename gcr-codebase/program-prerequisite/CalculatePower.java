import java.util.*;

public class CalculatePower{
	
	public static int power(int base, int pow){
		int ans = 1;
		while(pow-->0){
			ans *= base;
		}
		return ans;
	}
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base : ");
		int base = sc.nextInt();
		System.out.println("Enter Exponent : ");
		int exponent = sc.nextInt();
		
		System.out.println( power(base, exponent));
		
	}
}