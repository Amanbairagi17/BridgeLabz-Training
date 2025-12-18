import java.util.Scanner;

public class FindBonus{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary : ");
		int salary = sc.nextInt();
		System.out.print("Enter year of service : ");
		int serviceYear = sc.nextInt();
		
		//logic find bonus salary
		if(serviceYear >= 5){	
			System.out.println("Bonus amount : " +salary * 0.05 );
		}else{
			System.out.println("Bonus amount : 0 " );
		}
		
		sc.close();
	}
}