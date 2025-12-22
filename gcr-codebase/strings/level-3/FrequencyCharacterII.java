import java.util.Scanner;

public class FrequencyCharacterII {
	//method to find unique frequency of character and 
    private static int[][] getFrequency(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        int count = 0;
        for (int i = 0; i < 256; i++)
            if (freq[i] > 0) count++;

        // Store character and frequency
        int[][] result = new int[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
		//Creating object and taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

		//calling method to get frequency
        int[][] freq = getFrequency(text);
        System.out.println("Character Frequency:");
        for (int[] row : freq)
            System.out.println("Frequency of " +(char) row[0] + " is : " + row[1]);
    }
}