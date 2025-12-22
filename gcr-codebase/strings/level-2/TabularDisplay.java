import java.util.Scanner;

public class TabularDisplay{
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
	
	// return a 2d array of strings 
	private static String[][] getGrid(String s){
		String[] arr = spiltString(s);
		int n = arr.length;
		
		String[][] result = new String[n][2];
		for(int i = 0; i < n; i++){
			result[i][0] = arr[i];
			result[i][1] = String.valueOf(getLength(arr[i]));
		}
		return result;
	}
	
	// print the array
	private static void display(String[][] grid){
		for(String[] s : grid){
			System.out.println(s[0] + " " + Integer.parseInt(s[1]));
		}
	}
	
	public static void main(String[] args){
		//creating object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string  : " );
		String str = sc.nextLine().trim();
		
		String[][] grid = getGrid(str);
		

		//calling method and printing result
		display(grid);

	}
}