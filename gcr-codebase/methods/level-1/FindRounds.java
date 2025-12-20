import java.util.Scanner;

public class FindRounds{
	//method for finding rounds
	private static int findRounds(int a, int b, int c){
		return 5000/(a+b+c);
	}
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter first side of triangular in meters : ");
		int a = sc.nextInt();
		System.out.print("Enter second side of triangular in meters : ");
		int b = sc.nextInt();
		System.out.print("Enter third side of triangular meters : ");
		int c = sc.nextInt();
		
		//find find possible rounds to complete 5kms
		double rounds = findRounds(a,b,c);
		
		// printing the result
		System.out.println("Tthe number of rounds user needs to do to complete 5km run : " +rounds);
		
		sc.close();
    }
}