import java.util.Scanner;
import java.util.Random;

public class DistanceTracker{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//intial distance
		int totalDistance = 0;
		
		int distanceToNextStop = (int) (Math.random() * 10) ;
		System.out.println("Intial distance is : " +totalDistance);
		String msg = "yes";
		
		//logic to calculalting distance 
		while(msg.equalsIgnoreCase("yes")){
			totalDistance += (int) (Math.random() * 10);
			System.out.println("Total Covered Distance is : " +totalDistance);
			System.out.println("Do want to go next stop (Type Yes) : ");
			msg = sc.next();
			if(msg.equalsIgnoreCase("no")) break;
		}
		
		//printing final covered distance
		System.out.println("Total Covered Distance is : " +totalDistance);
		
	}
}