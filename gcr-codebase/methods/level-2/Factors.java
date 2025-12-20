import java.util.Scanner;

public class Factors{
	//method for finding factors 
	private static int[] getFactors(int n){
		int count = 0;
		for(int i=1 ; i<=n ; i++){
			if(n % i == 0) count++;
		}
		
		int[] factors = new int[count];
		count = 0;
		
		for(int i=1 ; i<=n ; i++){
			if(n % i == 0) factors[count++] = i;
		}
		return factors;
	}
	
	//finding sum of factors
	private static int getSum(int[] factors){
		int sum = 0;
		
		for(int num : factors) sum += num;
		return sum;
	}
	
	//finding product of factors
	private static int getProduct(int[] factors){
		int product = 1;
		for(int num : factors) product *= num;
		return product;
	}
	
	//finding square sum of factors
	private static int getSquaredSum(int[] factors){
		int ans = 0;
		for(int num : factors) ans += Math.pow(num,2);
		return ans;
	}
	
	
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		// calling function and then calling other function to get result
		int[] factors = getFactors(n);
		int sum = getSum(factors);
		int product = getProduct(factors);
		int squaredSum = getSquaredSum(factors);
		
		// printing the result
		System.out.println("Sum : " +sum+ " Product :  "  +product+  " Square of sum  : " +squaredSum);
		
		sc.close();
    }
}