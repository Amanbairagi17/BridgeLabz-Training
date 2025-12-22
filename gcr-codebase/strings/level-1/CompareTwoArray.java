import java.util.*;

public class CompareTwoArray{
	//method for comapre two array
	private static boolean compareArray(char[] arr1, char[] arr2){
		if(arr1.length != arr2.length) return false;
		
		for(int i=0 ; i<arr1.length ; i++){
			if(arr1[i] != arr2[i]) return false;
  		}
		return true;
	}
	
	//method for find all character of string without toCharArray
	private static char[] findCharWithoutToCharArray(String str){
		int n = str.length();
		char[] charArray  = new char[n];;
		
		for(int i=0 ; i<n ; i++){
			charArray[i] =  str.charAt(i);
		}
		return charArray;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : " );
		String str = sc.next();
		
		char[] charArray1 = findCharWithoutToCharArray(str);
		char[] charArray2 = str.toCharArray();
		
		
		boolean isSame = compareArray(charArray1,charArray2);
		
		if(isSame) System.out.println("Both result are same, string equal " +Arrays.toString(charArray1));
		else System.out.println("Both result are not same, string  are not equal " +Arrays.toString(charArray2));
		
		

	}
}