import java.util.Scanner;

public class KilometerToMiles{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Kilometers : ");
		
		int kilometers = sc.nextInt();
	
		System.out.println(kilometers+" = "+ kilometers * 0.621371 +"Miles");
		
	}
}