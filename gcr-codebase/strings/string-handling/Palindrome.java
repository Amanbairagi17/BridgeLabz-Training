import java.util.Scanner;

public class Palindrome{
	//method to reverse string
	private static String reverse(String str){
		StringBuilder sb = new StringBuilder();
		
		for(int i=str.length()-1  ; i>=0 ; i--){
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		//creating object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string  : " );
		String str = sc.next();
		int n = str.length();

		//calling method 
		String reverseString = reverse(str);
		
		//comapre both result and printing result
		if(reverseString.equals(str)) System.out.println("Palindrome ");
		else System.out.println("Not Palindrome ");

	}
}