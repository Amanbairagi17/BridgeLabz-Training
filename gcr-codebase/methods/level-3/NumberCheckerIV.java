import java.util.Scanner;

public class NumberCheckerIV{
    // return boolean checking a number is prime number
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++){
            if (n % i == 0) return false;
		}
        return true;
    }

    // checking for a neon number
    public static boolean isNeon(int n) {
        int squared = n * n;
		int sum = 0;

        while (squared > 0) {
            sum += squared % 10;
            squared /= 10;
        }
        return sum == n;
    }

    // checking for a spy number
    public static boolean isSpy(int[] digits) {
        int sum = 0;
		int	product = 1;

        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    // checking for a  automorphic number
    public static boolean isAutomorphic(int n) {
		String squared = "" + (n*n);
        return squared.endsWith(String.valueOf(n));
    }

    // checking for a buzz number
    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }
	
	public static void main(String[] args){
		//taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
	
		// calling methods and printing output
		System.out.println("Number is prime : " +isPrime(num));
		System.out.println("Number is neon : " +isNeon(num));
		System.out.println("Number is automorphic : " +isAutomorphic(num));
		System.out.println("Number is Buzz : " +isBuzz(num));
	}
}