import java.util.Scanner;

public class AverageOfThree{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		long ans = 0;
		
		
		System.out.println("Enter three numbers");
		
		for(int i=0; i<3 ; i++){
			arr[i] = sc.nextInt();
			ans += arr[i];
		}
		
		System.out.println("Average of Numbers : "+ ans/3);
		
	}
}