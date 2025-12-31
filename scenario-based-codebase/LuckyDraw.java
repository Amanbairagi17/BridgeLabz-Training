import java.util.Scanner;

public class LuckyDraw{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of visitors : ");
		int visitors = sc.nextInt();
	  
		
		for(int i=1 ; i<=visitors ; i++){
			System.out.println("Enter a number to win a Lucky Draw : ");
		
			int num = sc.nextInt();
			if(num % 3 == 0 && num % 5 == 0){
				 System.out.println("You win a Lucky Draw....\n");
			}		
			else{
				System.out.println("Enter valid input \n");
				continue;
			}
		}
		
	}
}