import java.util.Scanner;

public class Lexiographical{
	//method to find smallest word 
	private static int findLexiographical(String str1, String str2) {
    int n = Math.min(str1.length(), str2.length());
	int smallest = str1.length() < str2.length() ? 0 : 1;
	
    for (int i = 0; i <n; i++) {
		if(str1.charAt(i) < str2.charAt(i) ) {
			smallest = 0;
			break;
		}else if(str1.charAt(i) > str2.charAt(i)){
			smallest = 1;
			break;
		}
    }
    return smallest;
}

	
	public static void main(String[] args){
		//creating object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1 : " );
		String str1 = sc.nextLine();
		System.out.println("Enter string 2  :");
		String str2 = sc.nextLine();

		//calling method and printing result
		System.out.println("The smaller string is " + (findLexiographical(str1, str2) == 0 ? str1 : str2));

	}
}