import java.util.Scanner;

public class DiscountFeeInUniversity{
	public static void main(String[] args){
		
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// taking input of fee and discount
		System.out.print("Enter Fee of Student : ");
		int fee = sc.nextInt();
		System.out.print("Enter eligible discount : ");
		int discountPercentage = sc.nextInt();
		
		// calculating fee and discount
		int discount = (fee / 100 ) * discountPercentage;
		int feeAfterDiscount = fee - discount;
		
		
		System.out.println( "The discount amount is INR " +discount+ " and final discounted fee is INR " +feeAfterDiscount);
		
		
	}
}