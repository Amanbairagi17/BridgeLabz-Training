import java.util.Scanner;
import java.util.Locale; // For currency formatting (optional but good practice)
import java.text.NumberFormat; // For formatting output

public class CurrencyExchange{
	// Static rates (in a real app, fetch from API)
    static final double USD_RATE = 0.012; // 1 INR = 0.012 USD (approx)
    static final double EUR_RATE = 0.011; // 1 INR = 0.011 EUR (approx)
    static final double GBP_RATE = 0.0095; // 1 INR = 0.0095 GBP (approx)

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String conversation = "";
		System.out.println("Welcome to Currency Exchange !!");
		
		do{
			System.out.println("Enter Amount in Indian Rs. : ");
			double amount = sc.nextDouble();
			double convertedAmount;
			System.out.println("Chooese in which currency you want to convert amount : ");
			System.out.println("1) To Convert in USD ( Type USD ) : ");
			System.out.println("2) To Convert in EUR ( Type EUR ) : ");
			System.out.println("1) To Convert in GBP ( Type GBP ) : ");
			System.out.print("Enter your choice (1, 2, or 3): ");
			int choice = sc.nextInt();
			String currencyName = "";
			
			switch(choice){
				case 1 -> {
					convertedAmount = amount * USD_RATE;
					currencyName = "USD";
				}
				case 2 ->{
					convertedAmount = amount * EUR_RATE;
					currencyName = "EUR";
				}
				case 3 ->{
					convertedAmount = amount * GBP_RATE;
					currencyName = "GBP";
				}
				default -> {
					System.out.println("Invalid currency choice. Please try again.");
					continue;
				}
			}
			
			if (convertedAmount > 0) {
                NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US); // Format as currency
                System.out.printf("Converted Amount : \n");
                System.out.printf(String.format(Locale.US, "%.2f INR is equal to %.2f %s", amount, convertedAmount, currencyName));
				System.out.println();
            }
			
			sc.nextLine();
			System.out.println("Do you want to continue, (Type Yes) : ");
			conversation = sc.nextLine();
			if(conversation.equalsIgnoreCase("no")) break;
			
		}while(conversation.equalsIgnoreCase("yes"));
		
		System.out.println("\nThank you for using the Currency Converter. Goodbye!");

		
		
	}
}