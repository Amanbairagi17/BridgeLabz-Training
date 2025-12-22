import java.util.Scanner;

public class CompareTwoString{
	private static boolean compare(String s1, String s2){
		for(int i=0 ; i<s1.length() ; i++){
			if(s1.charAt(i)  != s2.charAt(i)) return false;
  		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string one : " );
		String str1 = sc.next();
		System.out.println("Enter string two : " );
		String str2 = sc.next();
		
		boolean isSame = compare(str1,str2);
		
		if(str1.equals(str2) && isSame) System.out.println("Both result are same, string equal ");
		else System.out.println("Both result are not same, string  are not equal ");
		
		

	}
}