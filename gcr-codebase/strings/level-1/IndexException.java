import java.util.*;

public class IndexException{
	//
	private static void generateException(String text){
		text.charAt(10);
			
	}
	
	//method for find all character of string without toCharArray
	private static void handleException(String text){
		try{
			text.charAt(10);
		}
		catch(RuntimeException e){
			System.out.println("Exception handled ");
		}
	}
	
	public static void main(String[] args){
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