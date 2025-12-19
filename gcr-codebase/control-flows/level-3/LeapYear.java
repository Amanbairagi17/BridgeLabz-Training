import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
		
        // Creating Scanner object and taking input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year = sc.nextInt();
		
		if(year < 1582){
			System.out.print("Not corresponding to  Gregorian calendar ");
		}

		//logic for finding leap year and print result 
		if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)){
			System.out.print("Leap year ");
		}
		else{
			System.out.print("Not a leap year");
		}
		
		
		sc.close();
    }
}