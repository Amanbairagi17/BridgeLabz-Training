import java.util.Scanner;

public class CompareAgeAndHeigth{
    public static void main(String[] args) {
		// Creating Scanner Object, taking input and intializing array
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter height of Amar, Akbar and Anthony : ");
		int[] height = new int[3];
		for(int i=0 ; i<3 ; i++) height[i] = sc.nextInt();
		
		System.out.print("Enter age of Amar, Akbar and Anthony : ");
		int[] age = new int[3];
		for(int i=0 ; i<3 ; i++) age[i] = sc.nextInt();
		  
		  
			
		// logic for finding yougest and tallest man
		int tallest = 0;
		int youngest = 0;
		
		for(int i=1 ; i<3 ; i++){
			if(height[tallest] < height[i]) tallest = i;
			if(age[youngest] > age[i]) youngest = i;
		}
		
		//printing the array
		System.out.println((youngest+1) + " is youngest");
		System.out.println((tallest+1) + " is tallest");

		sc.close();
    }
}