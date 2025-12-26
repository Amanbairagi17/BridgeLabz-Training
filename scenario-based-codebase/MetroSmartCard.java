import java.util.Scanner;

public class MetroSmartCard{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        // Initializing smart card balance
        System.out.print("Enter initial Smart Card balance: ");
        double balance = sc.nextDouble();

        while (balance > 0) {
            System.out.println("\nCurrent Balance: " + balance);
            System.out.print("Enter distance traveled in km (or -1 to quit): ");
            double distance = sc.nextDouble();

            // Exit condition
            if (distance == -1) break;

            int fare = (distance <= 2) ? 10 : (distance <= 5) ? 20 : 30;

            if (fare <= balance) {
                balance -= fare;
                System.out.println("Fare Deducted: " + fare);
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient balance for this trip! Fare: " + fare);
                System.out.println("Please recharge your card.");
                break;
            }

            if (balance == 0) {
                System.out.println("Balance exhausted. Please recharge.");
            }
        }
        
        System.out.println("Thank you for using Delhi Metro.");
        sc.close();
	}
}