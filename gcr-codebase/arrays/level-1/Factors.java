import java.util.Scanner;

public class Factors{
    public static void main(String[] args) {
		// Creating Scanner Object, taking input and intializing array
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int[] factors = new int[10];
		int maxIndex = 10;
		int index = 0;
		
			
		// logic for finding factore and increasing size of array
		for(int i=1 ; i<=n ; i++){
			if(n % i == 0){
				if(index == maxIndex){
					maxIndex *= 2;
					int[] temp = new int[maxIndex];
					for(int j=0 ; j<index ; j++) temp[j] = factors[j];
					factors = temp;
				}
				factors[index++] = i;
			}
		}
		
		//printing the array
		for(int i=0 ; i<index ; i++){
			System.out.print(factors[i]+" ");
		}

		sc.close();
    }
}