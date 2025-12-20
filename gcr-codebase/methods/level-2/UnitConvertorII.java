public class UnitConvertorII{
	// convert yard to feet
	public static double convertYardToFeet (double yard) {
       return yard * 3;
    }

    // feet to yard
    public static double feet2yards (double feet) {
        return feet * 0.333;
    }

    // Meters to inch
    public static double convertMetersToInch(double meters) {
        return meters * 39.3701;
    }

    // Inch to meters
    public static double convertInchToMeter(double inch) {
        return inch * 0.0254;
    }
	
	// Inch to cm
    public static double convertInchToCentimeter(double inch) {
        return inch * 2.54;
    }
	
	public static void main(String[] args){
		System.out.println(convertYardToFeet(10));
		System.out.println(convertInchToMeter(10));
		System.out.println(convertMetersToInch(10));
		System.out.println(convertInchToCentimeter(10));
		
	}
}