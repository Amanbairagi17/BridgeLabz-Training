import java.util.Scanner;

public class WindChillTemp{
	//method for number of diveide chocolates among all children
	private static double findWindChill(int temp,int windSpeed){
		double windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed ,0.16);
		return windChill;
	}
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter tempreture : ");
		int temp = sc.nextInt();
		System.out.println("Enter wind speed : ");
		int windSpeed = sc.nextInt();
		
		//find number of diveide chocolates among all children
		double windChill = findWindChill(temp, windSpeed);
		
		// printing the result
		System.out.println("Wind Speed is : " +windChill);
		
		sc.close();
    }
}