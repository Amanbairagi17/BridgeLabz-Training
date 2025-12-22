import java.util.Scanner;

public class ConvertToUppercase{
	private static boolean compare(String s1, String s2){
		for(int i=0 ; i<s1.length() ; i++){
			if(s1.charAt(i)  != s2.charAt(i)) return false;
  		}
		return true;
	}
	private static String convertIntoUppercase(String str){
		String s = "";
		for(int i=0 ; i<str.length() ; i++){
			int ch = str.charAt(i);
			if(ch >= 97 && ch <= 132) s +=  (char) (ch - 32) ;
			else s += (char) ch;
		}
		return s;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string  : " );
		String str = sc.next();
		
		String lowerToUpper1 = convertIntoUppercase(str);
		String lowerToUpper2 = str.toUpperCase();
		
		
		boolean isSame = compare(lowerToUpper1, lowerToUpper2);
		
		if(lowerToUpper1.equals(lowerToUpper2)) System.out.println("Both result are same, string equal ");
		else System.out.println("Both result are not same, string  are not equal ");
		
		
		System.out.println("The final string is : " +lowerToUpper1);

	}
}