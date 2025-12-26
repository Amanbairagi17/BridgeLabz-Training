import java.util.Scanner;

public class ElectionBooth{
	public static void main(String[] args){
		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		int candidate1 = 0;
		int candidate2 = 0;
		int candidate3 = 0;
		
		System.out.println("--- 2025 Election Booth Manager ---");
        System.out.println("Enter -1 at any age to close the booth and see results.");
		
		// using while loop and swithc case
		while(true){
			System.out.print("\nEnter Voter Age: ");
            int age = sc.nextInt();

            // Exit on special code
            if (age == -1) {
                break;
            }
			// Check eligibility (>=18)
            if (age >= 18) {
                System.out.println("Status: ELIGIBLE");
                System.out.println("Candidates: 1. Alice | 2. Bob | 3. Charlie");
                System.out.print("Cast your vote (1, 2, or 3): ");
                int vote = sc.nextInt();

                // Record the vote
                if (vote == 1) candidate1++;
                else if (vote == 2) candidate2++;
                else if (vote == 3) candidate3++;
                else System.out.println("Invalid candidate selected. Vote not recorded.");
            } else {
                System.out.println("Status: NOT ELIGIBLE (Under 18)");
           }
		}
		// Display results after exit code is entered
        System.out.println("\n--- Final Results ---");
        System.out.println("Candidate 1: " + candidate1 + " votes");
        System.out.println("Candidate 2: " + candidate2 + " votes");
        System.out.println("Candidate 3: " + candidate3 + " votes");
        sc.close();
	}
}