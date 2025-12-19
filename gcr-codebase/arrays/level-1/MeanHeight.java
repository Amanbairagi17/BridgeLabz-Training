import java.util.Scanner;

public class MeanHeight{
    public static void main(String[] args) {
		// Creating Scanner Object and initializing array
        Scanner sc = new Scanner(System.in);
		double[] height = new double[11];
		
		//taking input of players heights
		for(int i = 0; i < 11; i++){
			System.out.print("Enter player " + (i+1) + " height : ");
			height[i] = sc.nextInt();
		}
		
		double sum = 0;
		
		// Using a for loop to summing the height of players
		for(int i = 0; i < 11; i++){
			sum += height[i];
		}
		
		double meanOfHeight = sum / 11;
		
		// Printing the table using for loop
		
		System.out.println("The mean height of the football team is :" + meanOfHeight);
		

		sc.close();
    }
}