import java.util.Scanner;

public class FindLength{
	//method for finding length using charAt method
	private static int getLength(String str){
		int idx = 0;
		try{
			while(true){
				str.charAt(idx);
				idx++;
			}
		}catch(Exception E){
			return idx;
		}
	}
	
	public static void main(String[] args){
		//creating object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string  : " );
		String str = sc.next();

		//calling method and printing result
		System.out.println("The lengt of string without using inbuilt methid : " + getLength(str) + " and usingn built in method : " + str.length());

	}
}