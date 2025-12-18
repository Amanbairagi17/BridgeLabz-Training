import java.util.Scanner;

public class EvenOddNumber{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		//logic to print number is odd or even
		for(int i=1 ; i<=num ; i++){
			if(i%2 == 0){	
				System.out.println(i+ " is even " );
			}else{
				System.out.println(i+ " is Odd ");
			}
		}
		sc.close();
	}
}