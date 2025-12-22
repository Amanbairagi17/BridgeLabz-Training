import java.util.*;

public class NullException{
	//
	private static void generateException(String text){
		System.out.println(text.length());
	}
	
	//method for find all character of string without toCharArray
	private static void handleException(String text){
		try{
			System.out.println(text.length());
		}
		catch(Exception e){
			System.out.println("Exception handled ");
		}
	}
	
	public static void main(String[] args){
		String text = null;
		try{
			generateException(text);
		}
		catch(Exception e){
			System.out.println("Exception caught ");
			handleException(text);
        
		}
	}
}