import java.util.*;

public class NumberFormat{
	//method for generating exception
	private static void generateException(String text){
		Integer.parseInt(text);
	}
	
	//method for handling exception
	private static void handleException(String text){
		try{
			Integer.parseInt(text);
		}
		catch(RuntimeException e){
			System.out.println("Exception handled ");
		}
	}
	
	public static void main(String[] args){
		//Creating object of scanner and taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String " );
		String text = sc.next();
		try{
			generateException(text);
		}
		catch(RuntimeException e){
			System.out.println("Exception caught ");
			handleException(text);
            return;
		}
		System.out.println("Exception not caught " );
		
	}
}