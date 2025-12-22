import java.util.Scanner;

public class Palindrome {
	//method to palidroem iteratively
    private static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
	
	//method to palindrom recursive
	private static boolean isPalindromeRec(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRec(str, start + 1, end - 1);
    }
	
	//method to find palindrom using array
	private static boolean isPalindromeUsingArray(String str) {

        char[] original = str.toCharArray();
        char[] reverse = reverseString(str);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

	//method to reverse array
	private static char[] reverseString(String str) {
        char[] reverse = new char[str.length()];
        int index = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse[index++] = str.charAt(i);
        }
        return reverse;
    }
	
    public static void main(String[] args) {
		//Creating object and taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();

		//calling method to check string is plaindrome
		boolean result1 = isPalindromeIterative(str);
        boolean result2 = isPalindromeRec(str, 0, str.length() - 1);
        boolean result3 = isPalindromeUsingArray(str);
		
		//display result 
        System.out.println("Given string isPlaindrome using iterative method : " + result1);
        System.out.println("Given string isPlaindrome using recursive method  : " + result2);
        System.out.println("Given string isPlaindrome using reverse array method : " + result3);
    }
}