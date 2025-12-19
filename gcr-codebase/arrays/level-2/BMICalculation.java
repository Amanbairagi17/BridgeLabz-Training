import java.util.Scanner;

public class BMICalculation{
    public static void main(String[] args) {
		// Creating Scanner Object, taking input and intializing array
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of persons to calculate BMI : ");
		int n = sc.nextInt();
		double[] height = new double[n];
		double[] weight = new double[n];
		double[] bmi = new double[n];
		String[] status = new String[n];
		
		//
		
		for(int i=0 ; i<n ; i++){
			System.out.print("Enter number the weight and height of person " +(i+1)+ " : ");
			height[i] = sc.nextDouble();
			weight[i] = sc.nextDouble();
			bmi[i] = weight[i] / (height[i] * height[i]);
			if(bmi[i] <= 18.4) status[i] = "Underweight";
			else if(bmi[i] >= 18.5 && bmi[i] <= 24.9) status[i] = "Normal";
			else if(bmi[i] >= 25.0 && bmi[i] <= 39.9) status[i] = "Overweight";
			else status[i] = "Obese";
		}
		
		for(int i=0 ; i<n ; i++){
			System.out.println("The person " +(i+1)+ " Height is  " +height[i]+ " Weight is " +weight[i]+ " BMI : " + bmi[i] + " the person status is : " +status[i] );
		}

		sc.close();
    }
}