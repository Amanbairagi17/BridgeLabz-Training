import java.util.Scanner;

public class BMICalculationII{
    public static void main(String[] args) {
		// Creating Scanner Object, taking input and intializing array
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of persons to calculate BMI : ");
		int n = sc.nextInt();
		double[][] personsData = new double[n][3];
		String[] status = new String[n];
		
		//logic to calculate BMI 
		for(int i=0 ; i<n ; i++){
			System.out.print("Enter number the weight and height of person " +(i+1)+ " : ");
			personsData[i][0] = sc.nextDouble();
			personsData[i][1] = sc.nextDouble();
			personsData[i][2] = personsData[i][0] / (personsData[i][1] * personsData[i][1]);
			if(personsData[i][2] <= 18.4) status[i] = "Underweight";
			else if(personsData[i][2] >= 18.5 && personsData[i][2] <= 24.9) status[i] = "Normal";
			else if(personsData[i][2] >= 25.0 && personsData[i][2] <= 39.9) status[i] = "Overweight";
			else status[i] = "Obese";
		}
		
		//print the result 
		for(int i=0 ; i<n ; i++){
			System.out.println("The person " +(i+1)+ " Height is  " +personsData[i][1]+ " Weight is " +personsData[i][0]+ " BMI : " + personsData[i][2] + " the person status is : " +status[i] );
		}

		sc.close();
    }
}