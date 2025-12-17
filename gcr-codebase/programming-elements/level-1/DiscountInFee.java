public class DiscountInFee{
	public static void main(String[] args){
		
		// Declaring varible for pen and students
		int fee = 125000;
		int discountPercentage = 10;
		
		int discount = (fee / 100 ) * discountPercentage;
		int feeAfterDiscount = fee - discount;
		
		System.out.println( "The discount amount is INR " +discount+ " and final discounted fee is INR " +feeAfterDiscount);
		
		
	}
}