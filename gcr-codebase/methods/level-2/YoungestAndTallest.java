import java.util.Scanner;
public class StudentVoteChecker{
	private static int findYoungest(int[] ages){
		return Math.min(ages[0], Math.min(ages[1],ages[2]));
	}
	private static int findTallest(int[] heights){
		return Math.max(heights[0], Math.max(heights[1],heights[2]));
	}
	public static void main(String[] args) {
		// Creating Scanner Object, intializing array
        Scanner sc = new Scanner(System.in);
		int[] ages = new int[3];
		int[] heights = new int[3];
		
		//taking input 
		for(int i = 0; i < 3; i++){
			System.out.println("Enter age of student " + (i+1) + " : ");
			ages[i] = sc.nextInt();
			System.out.println("Enter age of height " + (i+1) + " : ");
			heights[i] = sc.nextInt();
		}
		
		int yougnest = findYoungest(ages);
		int tallest = findTallest(heights);
		
		//iterating loop, calling function and printing result
		System.out.println("Youngest students age is : " + yougnest + " and tallest students height is : " +tallest);
		
		sc.close();
    }
}
