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
	

	private static String[] getShortestAndLongest(String[][] grid){
		int shortest = 0;
		int longest = 0;
		
		for(int i=1 ; i<grid.length ; i++){
			int length = Integer.parseInt(grid[i][1]);
			if(shortest > Integer.parseInt(grid[i][1])) shortest = i;
			if(longest < Integer.parseInt(grid[i][1])) longest = i;
		}
		return new String[]{grid[shortest][0],grid[longest][0]};
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
		
		//calling method 
		String[][] grid = getGrid(str);
		String[] result = getShortestAndLongest(grid);
		

		// printing result
		System.out.println("Shortest : " +result[0]+ " Longest : " +result[1]);
		

	}
}