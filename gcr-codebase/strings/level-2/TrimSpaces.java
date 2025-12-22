import java.util.Scanner;

public class TrimSpaces{
	// method to compare strings using the charAt method 
	private static boolean compareStrings(String s1, String s2){
		int n = s1.length();
		int m = s2.length();
		
		// check if size is unequal
		if(n != m) return false;
		
		// using charAt to check equality
		for(int i = 0; i < n; i++){
			if(s1.charAt(i) != s2.charAt(i)) return false;
		}
		return true;
	}
	

	private static int[] getStAndEndIdx(String s){
		int n = s.length();
		int st = 0;
		int end = n-1;
		
		while(st < n && s.charAt(st) == ' ') st++;
		while(end >= 0 && s.charAt(end) == ' ') end--;
		
		return new int[]{st, end};
	}
	
	private static String trim(String s){
		int[] arr = getStAndEndIdx(s);
		int st = arr[0];
		int end = arr[1];
		String result = "";
		for(int i = st; i <= end; i++) result += s.charAt(i);
		return result;
	}
	
	
	public static void main(String[] args){
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String s = sc.nextLine().trim();
		
		// calling method and printing result
		String s1 = trim(s);
		String s2 = s.trim();
		if(compareStrings(s1, s2)) System.out.println("Output is same, the result is " + s1);
		else System.out.println("Output is diffrent");
		
		sc.close();
	}
}
