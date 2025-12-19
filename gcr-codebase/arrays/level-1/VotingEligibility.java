import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
		int[] arr = new int[10];
		
	// Creating Scanner Object and taking input
        Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<10 ; i++){
			System.out.print("Enter student " +(i+1)+ " age  : ");
			arr[i] = sc.nextInt();
		}
		

        //Checking eligible student and Print the result
		for(int i=0 ; i<10 ; i++){
			if(arr[i] >= 18){
				System.out.println("The student with the age " + arr[i] + " can vote");
			}
			else{
				System.out.println("The student with the age " + arr[i] + " can not vote ");
			}
		}
		
		sc.close();
    }
}