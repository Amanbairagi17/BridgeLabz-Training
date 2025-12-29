import java.util.Scanner;

public class DiscountDashboard{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of items on shop");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int total = 0;
		
		for(var i=0 ; i<n ; i++){
			System.out.println("Input price for item : " +(i+1));
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		
		if(total >= 1000) System.out.println("Total amount is " +total+ " then discount is :  " +total / 10);
		else if(total < 1000 && total >= 800) System.out.println("Total amount is " +total+ " then discount is :  " + total * 0.5);
		else if(total >= 500 && total < 800) System.out.println("Total amount is " +total+ " then discount is :  " + total * 0.3);
		else System.out.println("Total amount is " +total+ " then discount is :  " + total * 0.1);
		
	}
}