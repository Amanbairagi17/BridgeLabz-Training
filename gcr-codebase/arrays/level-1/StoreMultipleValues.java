import java.util.Scanner;

public class StoreMultipleValues {
    public static void main(String[] args) {
		// Taking input and intializing array
        Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];
		
		int index = 0;
		while(true){
			System.out.print("Enter a number : ");
			double num = sc.nextDouble();
			
			if(num < 1 || index > 10) break;
			arr[index++] = num;

		}
		
			
		// Using a for loop to store the multiplication table in array
		double sum = 0;
		for(int i=0 ; i<10 ; i++){
			sum += arr[i];
		}
		

        //print the final output
		System.out.println(sum);
		
		
		sc.close();
    }
}