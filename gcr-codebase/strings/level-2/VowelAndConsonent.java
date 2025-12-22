import java.util.Scanner;

public class DisplayVowelAndConsonent{
	// method to check vowel and consonent 
	private static String checkLetter(char ch){
		int ascii = ch;
		
		if(ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122){
			if(ascii < 97) ascii += 32;
			ch = (char)ascii;
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
			return "Consonent";
		}
		return "Not a letter";
	}
	
	// return the 2d array of letter
	private static String[][] getGrid(String s){
		int n = s.length();
		String[][] result = new String[n][2];
		for(int i = 0; i < n; i++){
			result[i][0] = "" + s.charAt(i);
			String curr = checkLetter(s.charAt(i));
			if(curr.equals("Vowel")) result[i][1] = "Vowel";
			else if(curr.equals("Consonent")) result[i][1] = "Consonent";
			else result[i][1] = "Not a letter";
		}
		return result;
	}
	
	// print the character and weather it is a vowel or character
	private static void display(String[][] grid){
		for(String[] s : grid){
			System.out.println(s[0] + " : " + s[1]);
		}
	}
	
	public static void main(String[] args){
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String s = sc.nextLine().trim();
		
		// calling method and printing result
		String[][] grid = getGrid(s);
		display(grid);
		
		sc.close();
	}
}