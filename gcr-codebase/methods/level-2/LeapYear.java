import java.util.Scanner;

public class LeapYear{	
	//finding sum of n number
	private static boolean isLeapYear(int year){
		if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) return true;
		return false;
	}
	
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a leap year : ");
		int year = sc.nextInt();
		if(year <= 1582) {
			System.out.println("It is not according to Georgian Calender ");
			return;
		}
		
		// calling function 
		boolean LeapYear = isLeapYear(year);
		
		// printing the result
		if(LeapYear) System.out.println("Leap year" );
		else System.out.println("Not leap year");
		
		sc.close();
    }
}