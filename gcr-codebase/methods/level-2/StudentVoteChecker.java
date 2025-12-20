import java.util.Scanner;
public class StudentVoteChecker{
	private static boolean canVote(int age){
		return age >=18;
	}
	public static void main(String[] args) {
		// Creating Scanner Object, intializing array
        Scanner sc = new Scanner(System.in);
		int[] ages = new int[10];
		
		//taking input 
		for(int i = 0; i < 10; i++){
			System.out.print("Enter age of student : ");
			ages[i] = sc.nextInt();
		}
		
		//iterating loop, calling function and printing result
		for(int i = 0; i < 10; i++){
			if(canVote(ages[i])) System.out.println("Student with " +ages[i]+ " can vote");
			else System.out.println("Student with " +ages[i]+ " cannot vote");
		}
		
		sc.close();
    }
}
