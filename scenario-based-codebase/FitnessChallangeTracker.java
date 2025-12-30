import java.util.Scanner;

public class FitnessChallangeTracker{
	public static void main(String[] args){
		//Scanner object to taking input 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fitness challenge days : ");
		int n = sc.nextInt();
		
		//condition to checking least days for fitness
		if(n < 10) {
			System.out.println("Atlest take challenge for 10 days, beacuse it takes time  ");
			return;
		}
		
		//array intailization on the bases of challenge days
		int[] days = new int[n];
		int sum = 0;
		int count = 0;
		
		
		//taking inut for each days
		for(int i=0 ; i<n ; i++){
			System.out.println("Enter push up for day : " +(i+1));
			days[i] = sc.nextInt();
			
			
		}
		
		//logic to find push ups count week wise  and also printing sum of push-ups and avge push-ups in week
		int weekDays = 0;
		for(int day : days){
			sum += day;
			weekDays++;
			count++;
			
			//System.out.println(sum + " : " + count);
			if( weekDays % 7 == 0){
				System.out.println("Push ups count for week " + ((weekDays%7)+1) + " is " + sum + " and average push ups in a week : " + sum/7);
				sum = 0;
				weekDays= 0;
			}
			
		}
		
		//push-ups sum and average push-ups for remaining days
		if( weekDays%7 != 0 && weekDays > 0){
				System.out.println("Push ups count for remaining  " + weekDays + " days is " + sum + " and average push ups in a remaining days : " + sum/weekDays);
			}
		
		
		
	}
}