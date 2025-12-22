import java.util.Scanner;
import java.util.Arrays;

public class UniqueCharacter{

    // find length of stirng
    private static int getLength(String s) {
        int idx = 0;
        try {
            while(true) {
                s.charAt(idx);
                idx++;
            }
        } 
		catch (Exception e) {
            return idx;
        }
    }

    // method to return character of unique characters
    private static char[] getUnique(String s) {
        int length = getLength(s);
        char[] curr = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            boolean isPresent = false;
            for (int j = 0; j < i; j++) {
                if (ch == s.charAt(j)) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                curr[index++] = ch;
            }
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = curr[i];
        return result;
    }

    public static void main(String[] args) {
		// creating scanner object and taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();

        char[] result = getUnique(s);
        System.out.println("Final unique Array is : " +Arrays.toString(result));
    }
}