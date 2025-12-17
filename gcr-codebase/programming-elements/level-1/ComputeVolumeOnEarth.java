public class ComputevolumeOnEarth{
	public static void main(String[] args){
		
		// Declaring varible for pen and students
		int radiusInKilometer = 6378;
		
		// volume of earth in kilometer and miles
		double volumeInkilometer = 4/3 * (3.14 * radiusInKilometer * radiusInKilometer * radiusInKilometer);
		double volumeInMiles = volumeInkilometer * 0.621371;
		
		//Display volume earth in kilometer and miles 
		System.out.println( "The volume of earth in cubic kilometers is " + volumeInkilometer+ " and cubic miles is " + volumeInMiles);
		
		
	}
}