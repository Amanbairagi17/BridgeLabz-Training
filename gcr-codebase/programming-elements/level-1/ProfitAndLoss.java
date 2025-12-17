public class ProfitAndLoss{
	public static void main(String[] args){
		
		// Declaring varible for costprice and selling priice
		int costPrice = 129;
		int sellingPrice = 191;
		
		double profit = sellingPrice - costPrice;
		double profitPercentage = (profit/costPrice) * 100;
		
		System.out.println( "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " +
		profit + " and the Profit Percentage is : " + profitPercentage );
		
		
	}
}