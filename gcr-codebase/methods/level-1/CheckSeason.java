import java.util.Scanner;

public class CheckSeason{
	//method for finding season
	private static String findSeason(int day, int month){
		if((month == 3 && day >= 20 && day <= 31) || (month == 6 && day >= 1 && day <= 20) || (month == 5 && day >= 1 && day <= 31)){
			return "Its a Spring Season";
		}
		else{
			return "Its not Spring Season";
		}
	}
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter day  : ");
		int day = sc.nextInt();
		System.out.print("Enter month: ");
		int month = sc.nextInt();
		
		//find season using method
		String season = findSeason(day, month);
		
		// printing the result
		System.out.println(season);
		
		sc.close();
    }
}