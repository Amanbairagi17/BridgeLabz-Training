import java.util.Scanner;

public class WatchSimulation{
	public static void main(String[] args){
		//this is for hours
		for (int hours = 0; hours < 24; hours++) {
			//this one is for minutes
            for (int minutes = 0; minutes < 60; minutes++) {
                // Check if the current time is 13:00
                if (hours == 13 && minutes == 0) {
                    System.out.println("Power cut at 13:00. Simulation stopped.");
                    // Use a labeled break to exit the outer loop (watchSimulation)
                    break ;
                }
				System.out.printf("%02d:%02d%n", hours, minutes);
			}
		}
	}
}