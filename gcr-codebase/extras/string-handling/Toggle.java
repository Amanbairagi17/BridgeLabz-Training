import java.util.Scanner;

public class Toggle{
	//method to convert upper to lower and lower to upper case 
	private static String toggleCase(String str) {
		String s = "";
		for(int i=0 ; i<str.length() ; i++){
			int ch = str.charAt(i);
			if(ch >= 65 && ch <= 91) s +=  (char) (ch + 32) ;
			else if(ch >=97 && ch <=122) s += (char) (ch - 32);
			else s += (char) ch;
		}
		return s;
	}

	
	public static void main(String[] args){
		//creating object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string  : " );
		String str = sc.nextLine().trim();
		
		//calling method and printing result
		 System.out.println("Substing Occurances : " + toggleCase(str));

	}
}