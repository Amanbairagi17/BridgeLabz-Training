import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
		// Taking input and intializing array
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter student number : ");
		int num = sc.nextInt();
		int[] arr = new int[10];
		
		// Using a for loop to store the multiplication table in array
		for(int i=0 ; i<10 ; i++){
			arr[i] = (i+1) * num;
		}
		

        //print the final output
		for(int i=0 ; i<10 ; i++){
			System.out.println(num + " * " + (i+1) + " = " + arr[i]);
		}
		
		sc.close();
    }
}