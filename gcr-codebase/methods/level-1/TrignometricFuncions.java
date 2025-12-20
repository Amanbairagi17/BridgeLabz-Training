import java.util.Scanner;

public class TrignometricFuncions{
	//method for finding smallest and largest number
	private static double[] calculateTrigonometricFunctions(double angle){
		double[] arr = new double[3];
		double radian = Math.toRadians(angle);
		arr[0] = Math.sin(radian);
		arr[1] = Math.cos(radian);
		arr[2] = Math.tan(radian);
		
		return arr;
	}
    public static void main(String[] args) {
		// Creating Scanner Object, taking input 
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter angle: ");
		double angle = sc.nextDouble();
		
		//find l
		double[] arr = new double[3];
		arr = calculateTrigonometricFunctions(angle);
		
		// printing the result
				System.out.println("sine value : " + arr[0] + ", cos value : " + arr[1] + " and tan value : " + arr[2]);
		
		sc.close();
    }
}