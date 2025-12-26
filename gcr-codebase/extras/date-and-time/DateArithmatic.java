import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateArithmatic{
    public static void main(String[] args) {
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (dd-MM-yyyy): ");
		String inputD = sc.nextLine();
		
		// Parsing input date using DateTimeFormatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(inputD, formatter);
		
		// performing the specified operations
		date = date.plusDays(7);
		date = date.plusMonths(1);	
		date = date.plusYears(2);
		date = date.minusWeeks(3);
		
		// printing the result
		System.out.println("Date after performing operations is " + date);
		sc.close();
    }
}