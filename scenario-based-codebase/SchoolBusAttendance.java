import java.util.Scanner;

public class SchoolBusAttendance{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] names = new String[10];
		
		System.out.println("Enter name of all students : ");
		for(int i=0 ; i<10 ; i++){
			System.out.println("Enter name of " +(i+1)+ " student : ");
			names[i] = sc.nextLine().trim();
		}
		int attendance = 0;
		System.out.print("Enter present of students p/a : ");
		for(int i=0 ; i<10 ; i++){
			System.out.println("Enter attendance of " + names[i] + " : ");
			char p = sc.next().charAt(0);
			if(p == 'p') attendance++;
		}
		
		System.out.println(attendance +" students present and " + (10 - attendance) + " students are absent "   );
		System.out.println("Thank you for using attnedance system");
		
		
	}
}