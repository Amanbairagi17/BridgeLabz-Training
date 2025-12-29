import java.util.Scanner;

public class RechargeSimulator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter mobile operator and balance ");
		System.out.println("Enter mobile operator (vi/bsnl/jio/airtel : ");
		String str = sc.next();
		System.out.println("Enter balance : ");
		double balance = sc.nextDouble();
		
		System.out.println("========= RECHARGE OFFERS =========\n");
		switch(str){
			case "jio" ->{
				System.out.println("JIO:");
				System.out.println(" 1) ₹198 | 14 Days | 2GB/day | Unlimited Calls | 100 SMS/day");
				System.out.println(" 2) ₹239 | 22 Days | 1.5GB/day | Unlimited Calls | 100 SMS/day");
				System.out.println(" 3) ₹3599 | 365 Days | 2.5GB/day | Unlimited Calls | 100 SMS/day\n");
				
				while(balance > 0){
					System.out.println("Enter number for recharge : ");
					switch(sc.nextInt()){
						case 1 -> {
						if(balance > 198){
							balance -= 198;
							System.out.println("Recharge done successfully \n ₹198 | 14 Days | 2GB/day | Unlimited Calls | 100 SMS/day");
							}
						}
						case 2 -> {
							if(balance > 239){
								balance -= 239;
								System.out.println("Recharge done successfully \n  ₹239 | 22 Days | 1.5GB/day | Unlimited Calls | 100 SMS/day");
							}
						}
						case 3 -> {
							if(balance > 3599){
								balance -= 3599;
							System.out.println("Recharge done successfully \n ₹3599 | 365 Days | 2.5GB/day | Unlimited Calls | 100 SMS/day");
							}
						}
						
					}
					if(balance < 198) {
						System.out.println("Insufficient balance!!, You not have sufficient amount to recharge ");
						break;
					}
					System.out.println("remaining balance : " +balance);
					
					
				}
			}
			case "vi" -> {
				System.out.println("VI (Vodafone Idea):");
				System.out.println("1) ₹199 | 28 Days | 1.5–2GB/day | Unlimited Calls | 100 SMS/day");
				System.out.println("2) ₹349 | 28 Days | 2GB/day | Unlimited Calls | 100 SMS/day");
				System.out.println("3) ₹3499 | 365 Days | 1.5GB/day | Unlimited Calls | 100 SMS/day\n");
				
				while(balance > 0){
					System.out.println("Enter number for recharge : ");
					switch(sc.nextInt()){
						case 1 -> {
						if(balance > 199) {
							balance -= 199;
							System.out.println("Recharge done successfully \n ₹199 | 28 Days | 1.5–2GB/day | Unlimited Calls | 100 SMS/day");
							}
						}
						case 2 -> {
							if(balance > 349){
								balance -= 349;
							System.out.println("Recharge done successfully \n  ₹349 | 28 Days | 2GB/day | Unlimited Calls | 100 SMS/day");
							}
						}
						case 3 -> {
							if(balance > 3499){
								balance -= 3499;
								System.out.println("Recharge done successfully \n ₹3499 | 365 Days | 1.5GB/day | Unlimited Calls | 100 SMS/day\n");
							}
						}
						
					}
					if(balance < 199) {
						System.out.println("Insufficient balance!!, You not have sufficient amount to recharge ");
						break;
					}
					System.out.println("remaining balance : " +balance);
				}
			}
			case "airtel" -> {
				System.out.println("AIRTEL:");
				System.out.println("1) ₹398 | 28 Days | 2GB/day | Unlimited Calls | 100 SMS/day");
				System.out.println("2) ₹398 | 28 Days | 2GB/day | Unlimited Calls | 100 SMS/day");
				System.out.println("3) ₹3599 | 365 Days | Unlimited 5G | Unlimited Calls | 100 SMS/day\n");
				
				while(balance > 0){
					System.out.println("Enter number for recharge : ");
					switch(sc.nextInt()){
						case 1 -> {
						if(balance > 299){
							balance -= 299;
							System.out.println("Recharge done successfully \n ₹398 | 28 Days | 2GB/day | Unlimited Calls | 100 SMS/day");
							}
						}
						case 2 -> {
							if(balance > 398){
								balance -= 398;
								System.out.println("Recharge done successfully \n  ₹398 | 28 Days | 2GB/day | Unlimited Calls | 100 SMS/day");
							}
						}
						case 3 -> {
							if(balance > 3599) {
								balance -= 3599;
								System.out.println("Recharge done successfully \n ₹3599 | 365 Days | Unlimited 5G | Unlimited Calls | 100 SMS/day\n");
							}
						}
						
					}
					if(balance < 299) {
						System.out.println("Insufficient balance!!, You not have sufficient amount to recharge ");
						break;
					}
					System.out.println("remaining balance : " +balance);
				}
			}
			case "bsnl" -> {
				System.out.println("BSNL:");
				System.out.println("1) ₹347 | 50 Days | 2.5GB/day | Unlimited Calls | 100 SMS/day");
				System.out.println("2) ₹599 | 70 Days | 3GB/day | Unlimited Calls | 100 SMS/day");
				System.out.println("3) ₹2399 | 365 Days | 2.5GB/day | Unlimited Calls | 100 SMS/day\n");
				
				while(balance > 0){
					System.out.println("Enter number for recharge : ");
					switch(sc.nextInt()){
						case 1 -> {
						if(balance > 347) {
							balance -= 347;
							System.out.println("Recharge done successfully \n ₹347 | 50 Days | 2.5GB/day | Unlimited Calls | 100 SMS/day");
							}
						}
						case 2 -> {
							if(balance > 599){
								balance -= 599;
								System.out.println("Recharge done successfully \n  ₹599 | 70 Days | 3GB/day | Unlimited Calls | 100 SMS/day");
							}
						}
						case 3 -> {
							if(balance > 2399){
								balance -= 2399;
								System.out.println("Recharge done successfully \n ₹2399 | 365 Days | 2.5GB/day | Unlimited Calls | 100 SMS/day");
							}
						}
					}
					if(balance < 347) {
						System.out.println("Insufficient balance!!, You not have sufficient amount to recharge ");
						break;
					}
					System.out.println("remaining balance : " +balance);
				}
			}
			
			default -> {
				System.out.println("Enter valid sim operator " );
			}
			
		}
		
		//while(balance > 0){
			
		//}
		
		
	}
}