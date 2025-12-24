import java.util.Scanner;

public class Anagram{
	//method to remove character
	private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Count frequency of both strings
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }

        // Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i])
                return false;
        }
        return true;
    }
	
	public static void main(String[] args){
		//creating object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1 : " );
		String s1 = sc.nextLine();
		System.out.println("Enter string 2 : ");
		String s2 = sc.nextLine();

		//calling method and printing result
		System.out.println("Both string are anagram : " +isAnagram(s1,s2));

	}
}