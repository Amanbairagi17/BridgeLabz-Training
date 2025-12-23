import java.util.Scanner;

public class RemoveDuplicate{
	//method to remove duplicate from string
	private static String removeDuplicate(String str){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0 ; i<str.length() ; i++){
			char ch = str.charAt(i);
			if(sb.indexOf(String.valueOf(ch)) == -1) sb.append(ch);
			
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		//creating object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string  : " );
		String str = sc.next();
		int n = str.length();

		//calling method and printing result
		 System.out.println("Unique String is : " + removeDuplicate(str));

	}
}