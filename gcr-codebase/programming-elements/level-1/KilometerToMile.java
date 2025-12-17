import java.util.Scanner;

public class KilometerToMile{
	public static void main(String[] args){
		
		//Creating scanner class object and taking input in kilometers
		Scanner sc = new Scanner(System.in);
		int kilometers = sc.nextInt();
		
		// converting kilometers to miles
		double miles = kilometers * 0.621371;

		// display in distance in miles
		System.out.println(kilometers+" KM is :  "+ miles +" Miles");

	}
}