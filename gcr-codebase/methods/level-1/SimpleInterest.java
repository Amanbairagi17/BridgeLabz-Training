import java.util.Scanner;

public class SimpleInterest{
	private static double findInterest(double amount, int rate, int t){
		return( amount * rate * t ) / 100;
	}
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal amount : ");
		double p = sc.nextDouble();
		System.out.print("Enter rate of interest : ");
		int r = sc.nextInt();
		System.out.print("Enter time  : ");
		int t = sc.nextInt();
		
		double interest = findInterest(p,r,t);
		// printing the result
		System.out.println("The Simple Interest is " +interest+ " for Principal " +p+ ", Rate of Interest " +r+ " and Time " + t + " years");
		
		sc.close();
    }
}