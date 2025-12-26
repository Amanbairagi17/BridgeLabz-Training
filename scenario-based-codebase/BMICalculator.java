import java.util.Scanner;

public class BMICalculator{
	public static void main(String[] args){
		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter height : ");
		double height = sc.nextDouble();
		
		System.out.print("Enter weight : ");
		double weight = sc.nextDouble();
		
		// calculating bmi and status 
		double bmi = weight / (height * height);
		String result;
		if(bmi <= 18.4) result = "Underweight";
        else if(bmi <= 24.9) result = "Normal";
        else if(bmi <= 39.9) result = "Overweight";
        else result = "Obese";
		
		// printing the result
		System.out.println("Bmi is " + bmi + " and the bmi category is " + result);
	
	}
}