import java.util.Scanner;

public class Bonus{
    public static void main(String[] args) {
		// Creating Scanner Object
        Scanner sc = new Scanner(System.in);
		double[] salary = new double[10];
		int[] experience = new int[10];
		double[] bonus = new double[10];
		
		
		//taking input of salary and experience and calculating bonus
		for(int i=0 ; i<10 ; i++){
			System.out.print("Enter salary and experience : ");
			double currSalary = sc.nextDouble();
			int currExperience = sc.nextInt();
			
			while(currSalary <= 0 || currExperience <= 0){
				System.out.print("Negetive numbers are not allowed!, Enter salary and experience positive : ");
			    currSalary = sc.nextDouble();
			    currExperience = sc.nextInt();
			}
			salary[i] = currSalary;
			experience[i] = currExperience;
		}
		
		for(int i = 0; i < 10; i++){
			if(experience[i] >= 5) bonus[i] = salary[i]/20;
			else bonus[i] = salary[i]/50;
			salary[i] += bonus[i];
		}
		
		//displaying marks, percentage and grade of student
		for(int i = 0; i < 10; i++){
			System.out.println("New salary after applying bonus as per experience : " +salary[i] );		
		}

		sc.close();
    }
}