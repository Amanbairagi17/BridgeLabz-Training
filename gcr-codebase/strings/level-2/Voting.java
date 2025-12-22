public class Voting{
	// Generate random ages
	private static int[] generateRandom(int n){
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = 10 + (int)(Math.random() * 90);
		return arr;
	}
	
	// return the 2d array of age and vote eligibility
	private static String[][] getGrid(int[] ages){
		int n = ages.length;
		String[][] result = new String[n][2];
		
		for(int i = 0; i < n; i++){
			result[i][0] = String.valueOf(ages[i]);
			if(ages[i] < 0)result[i][1] = "Cannot vote";
			else if(ages[i] < 18) result[i][1] = "false";
			else result[i][1] = "true";
		}
		return result;
	}
	
	// print the grid
	private static void display(String[][] grid){
		for(String[] s : grid){
			System.out.println(s[0] + " " + s[1]);
		}
	}
	
	public static void main(String[] args){
		// calling method and printing result
		int[] ages = generateRandom(10);
		String[][] grid = getGrid(ages);
		display(grid);
	}
}