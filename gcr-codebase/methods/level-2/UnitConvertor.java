
public class UnitConvertor{
	// convert km to miles
	public static double convertKmToMiles(double km) {
       return km * 0.621371;
    }

    // Miles to km
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // Meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }
	
	/*public static void main(String[] args){
		System.out.println(convertKmToMiles(10));
		System.out.println(convertMilesToKm(10));
		System.out.println(convertMetersToFeet(10));
		System.out.println(convertFeetToMeters(10));
		
	}*/
}