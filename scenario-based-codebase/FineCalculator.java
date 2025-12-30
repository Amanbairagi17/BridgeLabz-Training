import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
 /*
 15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop. */

public class FineCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int book = 1;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        int totalFine = 0;

		//logic to find fine for each book daywise
		while(book <= 6){
			System.out.println("\nBook " + book);

            System.out.print("Enter due date (dd-MM-yyyy): ");
            String dueInput = sc.next();
            LocalDate dueDate = LocalDate.parse(dueInput, formatter);

            System.out.print("Enter return date (dd-MM-yyyy): ");
            String returnInput = sc.next();
            LocalDate returnDate = LocalDate.parse(returnInput, formatter);

            if (returnDate.isAfter(dueDate)) {
                long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
                int fine = (int) daysLate * 5;
                totalFine += fine;

                System.out.println("Late by " + daysLate + " days. Fine = Rs. " + fine);
            }
			else {
                System.out.println("Returned on time. No fine.");
            }
			book++;
		}
		
		System.out.println("\nTotal fine for all books : Rs. " + totalFine);
      
		
		
	}
}