import java.util.Scanner;

public class LargestAndSamllest{
	//method for finding smallest and largest number
	private static int[] findLargestAndSamllest(int a, int b, int c){
		int[] arr = new int[2];
		arr[0] = Math.max(a,Math.max(b,c));
		arr[1] = Math.min(a,Math.min(b,c));
		return arr;
	}
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		System.out.println("Enter third number : ");
		int num3 = sc.nextInt();
		
		//find largest and smallest number using method
		int[] arr = new int[2];
		arr = findLargestAndSamllest(num1, num2, num3);
		
		// printing the result
		System.out.println("The smallest number : " +arr[1]+ " and largest number is : " +arr[0]);
		
		sc.close();
    }
}