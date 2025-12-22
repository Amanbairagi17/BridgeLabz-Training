import java.util.Scanner;

public class NumberChecker{
    // return the number of digits present in a number
    public static int findCount(int n) {
        int count = 0;
		while(n != 0){
			n /= 10;
			count++;
		}
		return count;
    }

    // return an array of ditis in a number 
    public static int[] getAsArray(int n){
        int size = findCount(n);
        int[] digits = new int[size];

        for(int i = size-1; i >= 0; i--){
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // return true if 0 is present else false
    public static boolean isDuck(int[] digits){
        for (int digit : digits){
            if (digit == 0) return true;
		}
        return false;
    }

    // checck if number is armstrong number
    public static boolean isArmstrong(int n, int[] digits) {
        int sum = 0;
		int size = digits.length;

        for (int digit : digits)
            sum += Math.pow(digit, size);

        if(sum == n) return true;
		return false;
    }

    // return an array of largest and second largest digit
    public static int[] findLargestAndSecoundLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
		int	secondMax = max;

        for (int digit : digits) {
            if (digit > max) {
                secondMax = max;
                max = digit;
            }
			else secondMax = Math.max(secondMax, digit);
        }
        return new int[]{max, secondMax};
    }

    // return asn array of smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
		int	secondMin = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < min) {
                secondMin = min;
                min = digit;
            }
			else secondMin = Math.min(secondMin, digit);
        }
        return new int[]{min, secondMin};
    }
	
	public static void main(String[] args){
		//taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
	
		//calling all methods
		System.out.println(findCount(n));
		int[] digits = getAsArray(n);
		System.out.println("Is given number duck : " +isDuck(digits));
		System.out.println("Is given number armstrong : " +isArmstrong(n, digits));
		int[] largest = findLargestAndSecoundLargest(digits);
		int[] smallest = findSmallestAndSecondSmallest(digits);
		System.out.println(largest[0] + " " + largest[1]);
		System.out.println(smallest[0] + " " + smallest[1]);
	}
}