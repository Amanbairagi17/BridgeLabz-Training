import java.util.Scanner;

public class PerimeterOfRectangle{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length : ");
		int length = sc.nextInt();
		System.out.println("Enter Width : ");
		int width = sc.nextInt();
		
		System.out.println( 2 * (length + width) );
		
	}
}