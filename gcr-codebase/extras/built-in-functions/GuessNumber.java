import java.util.Scanner;

public class GuessNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int start = 0;
		int end = 100;
		
		while(true){
			int mid = (start + end)/2;
			System.out.println("Is the number : " + mid);
			System.out.println("If number is equal enter 0, if number is gussed number is smaller enter -1 else enter 1");
			int n = sc.nextInt();
			if(n == 0) break;
			if(n == -1) start = mid+1;
			else end = mid-1;
		}
	}
}