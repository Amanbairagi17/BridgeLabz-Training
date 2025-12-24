import java.util.Scanner;

public class FindSubstring{
	//method to find longest word in sentencce
	private static int findSubstring(String str, String sub) {
    int count = 0;
    int n = str.length();
    int m = sub.length();

    for (int i = 0; i <= n - m; i++) {
        if (str.substring(i, i + m).equals(sub)) {
            count++;
        }
    }
    return count;
}

	
	public static void main(String[] args){
		//creating object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string  : " );
		String str = sc.nextLine().trim();
		System.out.println("Enter Substring  :");
		String sb = sc.nextLine().trim();

		//calling method and printing result
		 System.out.println("Substing Occurances : " + findSubstring(str, sb));

	}
}