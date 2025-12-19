import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {
		// Creating Scanner Object and taking input 
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		if(n < 0){
			System.out.print("Not a possitve number ");
			return;
		}
			
		
		
		//intializing array and logic to store value in array
		String[] arr = new String[n+1];
		
		for(int i=0 ; i<=n ; i++){
			if(i != 0 && (i %3 == 0 && i % 5 == 0)) arr[i] = "FizzBuzz";
			else if(i != 0 && i % 3 == 0) arr[i] = "Fizz";
			else if (i != 0 && i % 5 == 0) arr[i] = "Buzz";	
			else arr[i] = i+"";
		}
		
		//printing the one dimension array
		for(int i=0 ; i<=n ; i++){
			System.out.println("Position " + i + " = " +arr[i]);
		}

		sc.close();
    }
}