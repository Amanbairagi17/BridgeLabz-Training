import java.util.Scanner;

public class Frequency{

    // Method to find character frequency and return 2D array
    private static char[][] findFrequency(String str) {

        int[] freq = new int[256]; // ASCII size

        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }

        char[][] result = new char[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = (char) i;          
                result[index][1] = (char) freq[i];  
                index++;
            }
        }

        return result;
    }
	
	 // Method for display result
	private static void display(char[][] arr) {
        System.out.println("Character  Frequency");
        for (char[] a : arr) {
            System.out.println( "Frequency of : " + a[0] + " is : " + (int) a[1]);
        }
    }
    public static void main(String[] args) {
		//Crreating Scanner Object and taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

		//mehtod for getting frequency and printing result
        char[][] result = findFrequency(text);
        display(result);

        sc.close();
    }
}