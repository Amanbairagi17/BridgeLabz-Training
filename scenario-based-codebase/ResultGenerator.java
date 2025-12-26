import java.util.Scanner;

public class ResultGenerator{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] marks = new double[5];
        double total = 0;

        // For-loop to iterate over subjects and collect input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            total += marks[i];
        }

        // Calculate average
        double average = total / 5;
        
        // Switch to assign grades based on average (divided by 10)
        String grade;
        switch ((int) average / 10) {
            case 10:
            case 9:
                grade = "A+ (Excellent)";
                break;
            case 8:
                grade = "A (Very Good)";
                break;
            case 7:
                grade = "B (Good)";
                break;
            case 6:
                grade = "C (Fair)";
                break;
            case 5:
                grade = "D (Pass)";
                break;
            default:
                grade = "F (Fail)";
                break;
        }

        System.out.println("\n--- Final Result ---");
        System.out.println("Average Marks: " + average);
        System.out.println("Assigned Grade: " + grade);
        
        sc.close();
    }
}