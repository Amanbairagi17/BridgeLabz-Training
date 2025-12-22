import java.util.Scanner;
import java.util.Arrays;

public class FrequencyOfCharacter{
	// return an array of string with 
    static int[] getFrequency(String s) {
		int[] freq = new int[256];
        for(char ch : s.toCharArray()){
			freq[(int)ch]++;
		}
		return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
		
		// calling function to pring output
        System.out.println(Arrays.toString(getFrequency(s)));
    }
}