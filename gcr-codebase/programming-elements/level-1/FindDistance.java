import java.util.Scanner;

public class FindDistance{
	public static void main(String[] args){
		
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// taking input height input in feet
		System.out.print("Enter Heights in feet ");
		int height = sc.nextInt();
		
		// calculating height in yard and mile
		int yard = height * 3;
		int mile = 1760 * yard;
		
		
		
		
		System.out.println( "Your Height in mile is " +mile + " while in yard is " +yard + " and feet is " + height);
		
		
	}
}