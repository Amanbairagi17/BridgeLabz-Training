import java.util.Scanner;

public class VowelsAndConsonent{
	//method for finding character is vowel or not
	private static boolean isVowels(char ch){
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ;
	}
	
	public static void main(String[] args){
		//creating object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string  : " );
		String str = sc.nextLine();
		int n = str.length();
		
		int countVowels = 0;
		int consonent = 0;
		for(int i=0 ; i<str.length() ; i++){
			if(str.charAt(i) == ' ') continue;
			else if(isVowels(str.charAt(i))) countVowels++;
			else consonent++;
		}

		//calling method and printing result
		System.out.println("Vowels : " + countVowels + " Consonent : " + consonent);

	}
}