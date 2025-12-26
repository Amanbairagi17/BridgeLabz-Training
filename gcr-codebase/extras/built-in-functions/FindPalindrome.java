import java.util.Scanner;

public class FindPalindrome{
	// functions to check palindrome 
	private static boolean isPalindrome(String str){
		int i = 0;
		int j = str.length()-1;
		
		while(i <= j){
			if(str.charAt(i++) != str.charAt(j--)) return false;
		}
		return true;
	}
	public static void main(String[] args){
		// creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.next();
		
		// calling fucntion to print output
		System.out.println(isPalindrome(str));
		
	}
}