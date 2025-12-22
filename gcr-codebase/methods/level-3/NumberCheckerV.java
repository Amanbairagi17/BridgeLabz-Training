import java.util.Scanner;

public class NumberCheckerV{
    // reutrn sum of proper divisors of num
    public static int findSumOfDivisors(int number){
        int sum = 0;
        for(int i = 1; i <= number / 2; i++){
            if(number % i == 0) sum += i;
        }
        return sum;
    }

    // checks a number is perfect return boolean
    public static boolean isPerfect(int number){
        return findSumOfDivisors(number) == number;
    }

    // check for abundant number
    public static boolean isAbundant(int number){
        return findSumOfDivisors(number) > number;
    }

    // check for number is deficient
    public static boolean isDeficient(int num){
        return findSumOfDivisors(num) < num;
    }

    // return factorial of a digit
    public static int factorial(int number){
        int factorial = 1;
        for(int i = 1; i <= number; i++) factorial *= i;
        return factorial;
    }

    // checks if number is strong
    public static boolean isStrong(int number){
        int temp = number;
		int sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
	public static void main(String[] args){
        //taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
	
		// calling methods and printing output
        System.out.println("Number is perfect : " +isPerfect(num));
        System.out.println("Number is abundant : " +isAbundant(num));
        System.out.println("Number is deficient : " +isDeficient(num));
        System.out.println("Number is strong : " +isStrong(num));
    }
}