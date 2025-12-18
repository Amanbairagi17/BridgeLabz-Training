import java.util.Scanner;

public class SmallestNumber{
	public static void main(String[] args){
		//Take input number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//logic to find smallest number among three
		int smallestNumber = -1;
		if (a <= b) {
            if (a <= c) {
                smallestNumber = a;
            } else {
                smallestNumber = c;
            }
        } else {
            if (b <= c) {
                smallestNumber = b;
            } else {
                smallestNumber = c;
            }
        }
		
		System.out.println("The first smallest number is : " +smallestNumber);
		
		sc.close();
		
	}
}