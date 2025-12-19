import java.util.Scanner;

public class TwoDArray{
    public static void main(String[] args) {
		// Creating Scanner Object and takong input for row and column
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a row size : ");
		int row = sc.nextInt();
		
		System.out.print("Enter a column size : ");
		int col = sc.nextInt();
		
		//intializing array
		int[][] arr = new int[row][col];
		int[] oneDArray = new int[row * col];
		
		System.out.print("Enter values of 2D array : ");
		int idx = 0;
		for(int i=0 ; i<row ; i++){
			for(int j=0 ; j<col ; j++){
				oneDArray[idx++] = sc.nextInt();
			}
		}
		
		//printing the one dimension array
		for(int i=0 ; i<row * col ; i++){
			System.out.print(oneDArray[i]+" ");
		}

		sc.close();
    }
}