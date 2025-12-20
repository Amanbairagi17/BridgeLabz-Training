import java.util.Scanner;

public class DivideChocolate{
	//method for number of diveide chocolates among all children
	private static int[] findDividedChocolates(int chocolates,int children){
		int dividedChocolate = chocolates / children;
		int remainingChocolate = chocolates % children;
		return new int[]{dividedChocolate, remainingChocolate};
	}
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of chocolates : ");
		int chocolates = sc.nextInt();
		System.out.println("Enter number of children : ");
		int children = sc.nextInt();
		
		//find number of diveide chocolates among all children
		int[] arr = new int[2];
		arr = findDividedChocolates(chocolates, children);
		
		// printing the result
		System.out.println( arr[0]+ " chocolates each child gets and " +arr[1]+ " remaining chocolates");
		
		sc.close();
    }
}