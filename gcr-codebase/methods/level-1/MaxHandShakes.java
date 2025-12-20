import java.util.Scanner;

public class MaxHandShakes{
	//method for find max handshakes
	private static int findHandShakes(int n){
		return n * (n-1) / 2;
	}
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students : ");
		int n = sc.nextInt();
		
		//find possible handshakes using method
		double possibleHandShakes = findHandShakes(n);
		
		// printing the result
		System.out.println("The number of possible handshakes : " +possibleHandShakes);
		
		sc.close();
    }
}