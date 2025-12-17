public class PenDistribution{
	public static void main(String[] args){
		
		// Declaring varible for pen and students
		int pen = 14;
		int students = 4;
		
		int distrubutedPen = pen / students;
		int remainingPen = pen % students;
		
		System.out.println( "The Pen Per Student is " +distrubutedPen+ " and the remaining pen not distributed is " +remainingPen);
		
		
	}
}