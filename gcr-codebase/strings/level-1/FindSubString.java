import java.util.Scanner;

public class FindSubstring{
	private static boolean compare(String s1, String s2){
		for(int i=0 ; i<s1.length() ; i++){
			if(s1.charAt(i)  != s2.charAt(i)) return false;
  		}
		return true;
	}
	
	private static String findSubStringUsingCharAt(String str, int start, int end){
		String substring = "";
		for(int i=start ; i<end ; i++){
			substring +=  "" + str.charAt(i);
		}
		return substring;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string  : " );
		String str = sc.next();
		System.out.println("Enter statrting index : " );
		int start = sc.nextInt();
		System.out.println("Enter end index : " );
		int end = sc.nextInt();
		
		String substring1 = findSubStringUsingCharAt(str, start, end);
		String substring2 = str.substring(start,end);
		
		if(compare(substring1, substring2)) System.out.println("Both result are same, substring equal : " +substring1);
		else System.out.println("Both result are not same, substring are not equal " +substring1);
		
		

	}
}