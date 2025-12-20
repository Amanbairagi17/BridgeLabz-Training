import java.util.Scanner;

public class CheckNumber{
	//method for checking given numer sign
	private static int findSign(int n){
		if(n < 0) return -1;
		else if(n == 0) return 0;
		else return 1;
	}
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students : ");
		int n = sc.nextInt();
		
		//find sign using method
		int findsign = findSign(n);
		
		// printing the result
		System.out.println("The given number is : " +findsign);
		
		sc.close();
    }
}