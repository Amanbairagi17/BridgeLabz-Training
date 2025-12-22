import java.util.Scanner;
import java.util.Arrays;

public class NumberCheckerIII{
    //  Return count of digits in a number
    public static int findCount(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // reutrn a array of digits
    public static int[] getDigitsArray(int number) {
        int count = findCount(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // return reverse of the array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
		int idx = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            reversed[idx--] = arr[i];
        }
        return reversed;
    }

    //  compare two arrays and return boolean
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
		for(int i = 0; i < arr1.length; i++){
			if(arr1 != arr2) return false;
		}
		return true;
    }

    // Check a number is a palindrome and return boolean
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    // check for a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }

    // Main method to test all functionalities
    public static void main(String[] args) {
        //taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
	
		// calling methods and pringint output
        System.out.println("Count: " + findCount(num));
        System.out.println("digit: " + Arrays.toString(getDigitsArray(num)));
        System.out.println("reverse: " + Arrays.toString(reverseArray(getDigitsArray(num))));
        System.out.println("palindrome " + isPalindrome(num));
        System.out.println("Duck " + isDuckNumber(num));
    }
}