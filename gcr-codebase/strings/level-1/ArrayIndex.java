import java.util.*;

public class ArrayIndex{
	//method for generating exception
	private static void generateException(int[] arr ){
		int n = arr[arr.length+1];
	}
	
	//method for handling exception
	private static void handleException(int[] arr ){
		try{
			int n = arr[arr.length+1];
		}
		catch(RuntimeException e){
			System.out.println("Exception handled ");
		}
	}
	
	public static void main(String[] args){
		//Creating object of scanner and taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number " );
		int n = sc.nextInt();
		
		System.out.println("Enter values " );
		int[] arr = new int[n];
		for(int i=0 ; i<n ;i++){
			arr[i] = sc.nextInt();
		}
		
		try{
			generateException(arr);
		}
		catch(RuntimeException e){
			System.out.println("Exception caught ");
			handleException(arr);
            return;
		}
		System.out.println("Exception not caught " );
		
	}
}