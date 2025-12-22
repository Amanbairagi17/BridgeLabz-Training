import java.util.Scanner;

public class Split{
	//method for finding length using charAt method
	private static int getLength(String str){
		int idx = 0;
		try{
			while(true){
				str.charAt(idx);
				idx++;
			}
		}catch(Exception E){
			return idx;
		}
	}
	
	private static String[] spiltString(String str){
		int wordCount = 1;
		int n = getLength(str);
		
		for(int i=0 ; i<n ; i++){ 
			if(str.charAt(i) == ' ') wordCount++;
		}
		
		String[] word = new String[wordCount];
		
		int idx = 0 ;
		int prev = 0;
		
		for(int i=0 ; i<n ; i++){
			if(str.charAt(i) == ' '){
				word[idx++] = str.substring(prev,i);
				prev = i+1;
			}
			
		}
		word[idx] = str.substring(prev);
		return word;
	}
	
	//method for comapre two array
	private static boolean compareArray(String[] arr1, String[] arr2){
		if(arr1.length != arr2.length) return false;
		
		for(int i=0 ; i<arr1.length ; i++){
			if(!arr1[i].equals(arr2[i])) return false;
  		}
		return true;
	}
	
	public static void main(String[] args){
		//creating object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string  : " );
		String str = sc.nextLine().trim();
		
		String[] arr1 = spiltString(str);
		String[] arr2 = str.split(" ");
		

		//calling method and printing result
		System.out.println(compareArray(arr1, arr2));

	}
}