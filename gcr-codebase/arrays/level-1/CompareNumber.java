import java.util.Scanner;

public class CompareNumber {
    public static void main(String[] args) {
		int[] arr = new int[5];
		
	// Creating Scanner Object and taking input
        Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<5 ; i++){
			System.out.print("Enter student number : ");
			arr[i] = sc.nextInt();
		}
		

        //logic for finding a nubmer is positive neetive or zero or even and odd
		for(int i=0 ; i<5 ; i++){
			if(arr[i] < 0) System.out.println("Number is negetive");
			else if(arr[i] == 0) System.out.println("Zero ");
			else{
				if(arr[i] % 2 == 0) System.out.println("Number is even ");
				else System.out.println("Number is odd ");
			}
		}
		
		if(arr[0] > arr[4]) System.out.println("First number is greater");
		else if (arr[0] < arr[4]) System.out.println("Last number is greater ");
		else System.out.println("Both numbers are equal ");
		
		sc.close();
    }
}