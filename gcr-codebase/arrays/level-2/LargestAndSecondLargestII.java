import java.util.Scanner;

public class LargestAndSecondLargestII{
    public static void main(String[] args) {
		// Creating Scanner Object, taking input and initializing array
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		int[] digits = new int[10];
		
		// storing digits in array
		int index = 0;
		int maxIndex = 10;
		while(number != 0){
			if(maxIndex == index){
				maxIndex *= 2;
				int[] temp = new int[maxIndex];
				for(int i = 0; i < index; i++){
					temp[i] = digits[i];
				}
				digits = temp;
			}
			digits[index++] = number%10;
			number /= 10;
		}
		
		// finding the largest and second largest
		int largest = digits[0];
		for(int i = 1; i < 10; i++){
			if(largest < digits[i]) largest = digits[i];
		}
		for(int i = 1; i < 10; i++){
			if(largest == digits[i]) digits[i] = -1;
		}
		
		
		int secondLargest = digits[0];
		for(int i = 1; i < 10; i++){
			if(secondLargest < digits[i]) secondLargest = digits[i];
		}
		
		// printing the result
		System.out.println("Largest is " + largest + " and second largest is " + secondLargest);
		
		sc.close();
    }
}