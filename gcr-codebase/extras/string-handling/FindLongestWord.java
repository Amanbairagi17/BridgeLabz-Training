import java.util.Scanner;

public class FindLongestWord{
	//method to find longest word in sentencce
	private static int longestWord(String str){
		int maxLength = 0;
		for(int i=0 ; i<str.length() ; i++){
			int count = 0;
			if(str.charAt(i) == ' ') continue;
			else{
				for(int j=i ; i<str.length() ; i++){
					if(str.charAt(i) != ' ') count++;
					else {
						maxLength = Math.max(count,maxLength);
						break;
					}
				}
			}
			
		}
		return maxLength;
	}
	
	public static void main(String[] args){
		//creating object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string  : " );
		String str = sc.nextLine().trim();
		int n = str.length();

		//calling method and printing result
		 System.out.println("Longest word length : " + longestWord(str+" "));

	}
}