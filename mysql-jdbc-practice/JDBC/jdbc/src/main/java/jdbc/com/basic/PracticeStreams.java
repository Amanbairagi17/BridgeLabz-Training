package jdbc.com.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PracticeStreams {
	public static void main(String[] args) {
		String str = "java is java and java is fast";
		String[] strings = str.split("\\s+");
//	
//		
		Arrays.stream(strings).collect( Collectors.groupingBy(word -> word, Collectors.counting()))
		.forEach((k,v) -> System.out.println(k + " : "  + v));
		
		String string = "programming";
		
		//Arrays.stream(string.split("")).distinct().forEach(s -> System.out.print(s +" "));
		
		//String [] words = {"java","","Spring"};
		
	//List<String> strings = 	Arrays.stream(words).filter(word -> !word.equals("")).toList();
	//System.out.println(strings);
		
		
	}
}
