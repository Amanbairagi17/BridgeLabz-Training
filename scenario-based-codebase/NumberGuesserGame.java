import java.util.Scanner;

public class NumberGuesserGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int start = 0;
		int end = 100;
		int number = (int) (Math.random() * 100) + 1;
		int chance = 5;
		
		do{
			System.out.println("Enter a number that you guessed : ");
			int num = sc.nextInt();
			if(num == number) {
				System.out.println("you guessd correct number");
				break;
			}
			else if(num < number){
				System.out.println("number is too low");
			}
			else {
				System.out.println("number is too high");
			}
			chance--;
		}while(chance > 0);
		
		System.out.println("you have no more chances ");
		System.out.println("The correct number is : "+number);
		
	}
}