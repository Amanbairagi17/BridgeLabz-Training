import java.util.Scanner;

public class OddAndEven{
    public static void main(String[] args) {
		// Creating Scanner Object and initializing array
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		int[] odd = new int[n+1/2];
		int[] even = new int[n+1/2];
		
		//taking input of players heights
		int evenIdx = 0;
		int oddIdx = 0;
		for(int i = 1; i <= n ; i++){
			if(i % 2 == 0) even[evenIdx++] = i;
			else odd[oddIdx++] = i;
		}
		
		System.out.print("Even number are : " );
		for(int i = 0; i < evenIdx ; i++){
			
			System.out.print(even[i]+ " " );
		}
		
		System.out.println();
		System.out.print("Odd number are : " );
		for(int i = 0; i < oddIdx ; i++){
			
			System.out.print(odd[i]+ " " );
		}
		
	
		
		

		sc.close();
    }
}