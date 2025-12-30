import java.util.Scanner;

public class TemperatureLogger{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		
		int max = -1;
		int avg = 0;
		int sum = 0;
		int day = 0;
		
		for(int i=0 ; i<7 ; i++){
			System.out.println("Enter temperature for day : " +(i+1));
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
				day = i;
			}
			sum += arr[i];
		}
		
		avg = sum / 7;
		
		System.out.println("Maximum temperature is : " + max + " drgeree celsius on day " + (day+1) + " and average tepertature is : " +avg+ " degree celsius");
		
	}
}