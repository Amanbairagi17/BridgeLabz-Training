import java.util.Scanner;

public class MaxHandshakes{
	public static void main(String[] args){
		
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// taking input 
		System.out.print("Enter number of student in class : ");
		int students = sc.nextInt();
		
		
		//find totalPrice to bought an item
		double totalHandshakes = students * (students - 1 ) / 2; 
	
		System.out.printf( "The number of possible handshakes is " +totalHandshakes);
		
		
	}
}