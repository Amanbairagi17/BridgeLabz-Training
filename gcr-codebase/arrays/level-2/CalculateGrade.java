import java.util.Scanner;

public class CalculateGrade{
    public static void main(String[] args) {
		// Creating Scanner Object, taking input and intializing array
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of student to calculate grade : ");
		int n = sc.nextInt();
		int[] maths = new int[n];
		int[] physics = new int[n];
		int[] chemistry = new int[n];
		double[] percentage = new double[n];
		char[] grade = new char[n];
		
		
		//taking input of marks and calulating percentage and grade
		for(int i=0 ; i<n ; i++){
			System.out.print("Enter marks of maths, physics and chemistry : ");
			int currMathsMarks = sc.nextInt();
			int currPhysicsMarks = sc.nextInt();
			int currChemistryMarks = sc.nextInt();
			
			while(currMathsMarks < 0 || currPhysicsMarks < 0 || currChemistryMarks < 0){
				System.out.print("Negetive marks!, Enter positive marks of maths, physics and chemistry : ");
				currMathsMarks = sc.nextInt();
				currPhysicsMarks = sc.nextInt();
			    currChemistryMarks = sc.nextInt();
			}
			maths[i] = currMathsMarks;
			physics[i] = currPhysicsMarks;
			chemistry[i] = currChemistryMarks;
			
			percentage[i] = (maths[i] + physics[i] + chemistry[i] ) / 3;
			
			if (percentage[i] >= 80) {
				grade[i] = 'A';
			}
			else if (percentage[i] >= 70) {
				grade[i] = 'B';
			}
			else if (percentage[i] >= 60) {
				grade[i] = 'C';
			}
			else if (percentage[i] >= 50) {
				grade[i] = 'D';
			}
			else if (percentage[i] >= 40) {
				grade[i] = 'E';
			}
			else {
				grade[i] = 'R';
			}
		}
		
		//displaying marks, percentage and grade of student
		for(int i = 0; i < n; i++){
			System.out.println("Physics : " + physics[i] + ", Chemistry : " + chemistry[i] + ", Maths : " + maths[i] + ", Percentage : " + percentage[i] + ", Grade : " + grade[i]);
		}

		sc.close();
    }
}