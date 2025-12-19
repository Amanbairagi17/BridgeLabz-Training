import java.util.Scanner;

public class ReverseNumber{
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
		//System.out.print(count);
		
		//logic to intializing array and storing number in reverse order
		int[] arr = new int[count];
		int i=0;
		while(num != 0){
			arr[i++] = num % 10;
			num /= 10;
		}
		
		//print the reverse array
		for(int j=0 ; j<count ; j++){
			System.out.print(arr[j]+" ");
		}

		sc.close();
    }
}