import java.util.Scanner;

public class TotalPurchase{
	public static void main(String[] args){
		
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// taking input of unit price and quantity of an item
		System.out.print("Enter unit price : ");
		double unitPrice = sc.nextDouble();
		System.out.print("Enter quantity of an iteam : ");
		int quantity = sc.nextInt();
		
		
		//find totalPrice to bought an item
		double totalPrice = unitPrice * quantity;
	
		System.out.printf( "The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f ",totalPrice, quantity, unitPrice );
		
		
	}
}