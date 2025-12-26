import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateComparision{
    public static void main(String[] args) {
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date 1 (dd-MM-yyyy): ");
		String inputD1 = sc.nextLine();
		System.out.print("Enter a date 2 (dd-MM-yyyy): ");
		String inputD2 = sc.nextLine();
		
		// Parsing input date using DateTimeFormatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate d1 = LocalDate.parse(inputD1, formatter);
		LocalDate d2 = LocalDate.parse(inputD2, formatter);
		
		if(d1.isBefore(d2)) System.out.println("Date 1 is before date 2");
		else if(d1.isAfter(d2)) System.out.println("Date 1 is afer date 2");
		else System.out.println("Date 1 and date 2 is equal");
    }
}