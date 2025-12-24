import java.util.Scanner;

public class FrequentCharacter{
	//method to find most frequent character in a string
	private static char findMostFrequent(String str) {
		int[] freq = new int[256];
		int max = 0;
		char result = 'a';
		
		for(int i=0 ; i<str.length() ; i++){
			char ch = str.charAt(i);
			freq[ch]++;
			if(freq[ch] >  max){
				max = freq[ch];
				result = ch;
			}
		}
		return result;
    }
  
	public static void main(String[] args){
		//creating object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1 : " );
		String str1 = sc.nextLine();

		//calling method and printing result
		System.out.println("The most frequent character is : " +findMostFrequent(str1));

	}
}