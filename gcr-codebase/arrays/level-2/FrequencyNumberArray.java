import java.util.Scanner;

public class FrequencyNumberArray{
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int num = n;
		
		//logic to count number of digits
		int count = 0;
		while(n != 0){
			count++;
			n /= 10;
		}
		
		//logic to intializing array and find the frequency of arr
		int[] arr = new int[count];
		int i=0;
		while(num != 0){
			arr[i++] = num % 10;
			num /= 10;
		}
		int[] freq = new int[10];
		
		for(int j=0 ; j<count ; j++){
			freq[arr[j]]++;
		}
		
		//print the frequency of each element
		for(int j=0 ; j<10 ; j++){
			System.out.println("Frequency of " + j + " is : " +freq[j]);
		}

		sc.close();
    }
}