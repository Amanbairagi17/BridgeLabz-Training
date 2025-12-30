import java.util.Scanner;

public class ReseversationQueue{
	public static void main(String[] args){
		//Scanner object to taking input 
		Scanner sc = new Scanner(System.in);
		int totalSeats = 5;
		int bookedSeats = 0;
		
		//menu for user 
		System.out.println("Enter 0 : Exit");
		System.out.println("Enter 1 : Book Seats");
		System.out.println("Enter 2 : Check vacant seats");
		
		// taking input from the user and logic for seat booking according to user input
		while(true){
				System.out.println("Enter a number according to menu : ");
				int n = sc.nextInt();
				
				if(totalSeats <=  0){
					System.out.println("Exit from queue!!, Beacuse seats are not available");
					System.out.println("Thank you for using Our Reservation System ");
				}
				
				switch(n){
					//when user wants to exit 
					case 0 -> {
						System.out.println("Exit from queue !! ");
						System.out.println("Thank you for using Our Reservation System ");
						return;
						
					}
					//seat booking logic
					case 1 -> {
						totalSeats--;
						bookedSeats++;
					}
					//printing available seat and booked seat
					case 2 -> {
						System.out.println("Total " +totalSeats + " seats are available and " + bookedSeats + " Booked ");
					}
					//condition default condition to warn user for enetring correct input
					default -> {
						System.out.println("Enter valid input ");
					}
				}
		}
		
	}
}