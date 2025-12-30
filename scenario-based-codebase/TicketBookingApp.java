import java.util.Scanner;
//14. Movie Ticket Booking App 🎬
//Ask users for movie type, seat type (gold/silver), and snacks.
//● Use switch and if together.
//● Loop through multiple customers.
//● Clean structure and helpful variable names.

public class TicketBookingApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int totatSeats = 10;
		
		while(totatSeats > 0){
			System.out.println("Enter Movie type and seat ");
			System.out.println("Enter movie type (action / comedy / romantic / thriller : ");
			String movie = sc.next();
			System.out.println("Enter seat (silver / gold) : ");
			String seatType = sc.next();
			System.out.println("Do you want snack (yes / no) : ");
			String snacks = sc.next();
			
			switch(movie){
				case "action" ->{
					if(seatType.equals("silver")) {
						System.out.println("For Action movie silver seat ticket is Rs. 120 and do you need snack " + snacks);
						totatSeats--;
					}
					else if(seatType.equals("gold")){
						System.out.println("For Action movie gold seat ticket is Rs. 180 and do you need snack " + snacks);
						totatSeats--;

					}
					else {
						System.out.println("Enter valid seat !!");
					}
				}
				case "comedy" -> {
					if(seatType.equals("silver")) {
						System.out.println("For Comedy movie silver seat ticket is Rs. 150 and do you need snack " + snacks);
						totatSeats--;
					}
					else if(seatType.equals("gold")){
						System.out.println("For Comedy movie gold seat ticket is Rs. 230 and do you need snack " + snacks);
						totatSeats--;

					}
					else {
						System.out.println("Enter valid seat !!");
					}
					
				}
				case "romantic" -> {
					if(seatType.equals("silver")) {
						System.out.println("For Romantic movie silver seat ticket is Rs. 90 and do you need snack " + snacks);
						totatSeats--;
					}
					else if(seatType.equals("gold")){
						System.out.println("For Romantic movie gold seat ticket is Rs. 120 and do you need snack " + snacks);
						totatSeats--;

					}
					else {
						System.out.println("Enter valid seat !!");
					}
		
				}
				case "thriller" -> {
					if(seatType.equals("silver")) {
						System.out.println("For Thriller movie silver seat ticket is Rs. 180 and do you need snack " + snacks);
						totatSeats--;
					}
					else if(seatType.equals("gold")){
						System.out.println("For Thriller movie gold seat ticket is Rs. 250 and do you need snack " + snacks);
						totatSeats--;

					}
					else {
						System.out.println("Enter valid seat !!");
					}
				}
				default -> {
					System.out.println("Enter valid movie type");
				}
			}
			System.out.println(totatSeats + " more seats available, You can book more seats ");
		}
		
		
	}
}