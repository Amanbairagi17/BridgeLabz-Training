import java.util.Scanner;

public class CalculateGradeII{
    public static void main(String[] args) {
		// Creating Scanner Object, taking input and intializing 2D array
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of student to calculate grade : ");
		int n = sc.nextInt();
		int[][] marks = new int[n][3];
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
			marks[i][0] = currMathsMarks;
			marks[i][1] = currPhysicsMarks;
			marks[i][2] = currChemistryMarks;
			
			percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2] ) / 3;
			
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
			System.out.println("Physics : " + marks[i][1] + ", Chemistry : " + marks[i][2] + ", Maths : " + marks[i][0] + ", Percentage : " + percentage[i] + ", Grade : " + grade[i]);
		}

		sc.close();
    }
}