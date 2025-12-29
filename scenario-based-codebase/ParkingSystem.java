import java.util.Scanner;

public class ParkingSystem{
	//private static void occupancy
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to smart parking");
		System.out.println("Enter capacity : ");
		int size = sc.nextInt();
		
        double[] capacity = new double[size+1];
		int idx = 0;
		while(true){
			System.out.println("Enter 1 for park a car : " );
			System.out.println("Enter 2 for exit car : " );
			System.out.println("Enter 3 show occupany : " );
			int option = sc.nextInt();
			
			
			switch(option){
				case 1 : {
					if(size == idx){
						System.out.println("Parking full");
						return;
					}
					if(idx < size) capacity[idx] = 1;
					idx++;
					break;
				}
				case 2 : {
					if(idx < 0) {
						System.out.println("you can not exit car all slots are empty");
						return;
					} 
					if(idx <= size) {
						capacity[idx] = 0;
						idx--;
						System.out.println("You are exit from Parking ");
					break;
					}
				}
				
				case 3: {
					System.out.println(idx + " spaces occupied " + (size-idx) +" space are empty");
					break;
				}
				default : System.out.println("Enter valid option!!");
				
			}
			if(size == idx){
				System.out.println("Parking full");
				System.out.println("Thank you for using smart parking system");
				System.out.println("You are exit from Parking ");
				break;
			}
			
		}
        
        sc.close();
    }
}