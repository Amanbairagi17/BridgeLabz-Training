import java.util.Scanner;

public class RemoveCharacter{
	//method to remove character
	private static String removeChar(String str, char ch) {
		String ans = "";
		
		for(int i=0 ; i<str.length() ; i++){
			if(str.charAt(i) != ch) ans += str.charAt(i) ;
		}
		return ans;
    }
	
	public static void main(String[] args){
		//creating object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : " );
		String str = sc.nextLine();
		System.out.println("Enter character ro remove : ");
		char ch = sc.next().charAt(0);

		//calling method and printing result
		System.out.println("The most frequent character is : " +removeChar(str, ch));

	}
}