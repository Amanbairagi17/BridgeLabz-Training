import java.util.Scanner;

public class QuizApplication{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int student = 0;
		int[] students = new int[5];
		
		//Scanner sc = new Scanner(System.in);

        System.out.println(
					"1. Who is the father of World Wide Web?\n" +
					"   a) Bill Gates\n" +
					"   b) Tim Berners-Lee\n" +
					"   c) Steve Jobs\n"
			);

			System.out.println(
					"2. Which country won the 2023 ODI Cricket World Cup?\n" +
					"   a) Australia\n" +
					"   b) India\n" +
					"   c) Sri Lanka\n"
			);

			System.out.println(
					"3. Who is known as the Fastest Man in the World?\n" +
					"   a) Usain Bolt\n" +
					"   b) Michael Johnson\n" +
					"   c) Carl Lewis\n"
			);

			System.out.println(
					"4. Which gas do plants absorb?\n" +
					"   a) Oxygen\n" +
					"   b) Nitrogen\n" +
					"   c) Carbon Dioxide\n"
			);
			System.out.println(
					"5. Which keyword is used for locking reference in Java?\n" +
					"   a) final\n" +
					"   b) extends\n" +
					"   c) inherit\n"
			);
		while(student < 5){
			System.out.println("Student " +(student+1)+ " test mode active :  ");
			
			int marks = 0;
			for (int i = 1; i <= 5; i++) {
				System.out.print("Enter answer for Question " + i + " (a/b/c): ");
				char ans = sc.next().charAt(0);

				switch (i) {
					case 1 ->{
						marks = (ans == 'b' ? ++marks : marks);
					}
					case 2 -> {
						marks = (ans == 'a' ? ++marks : marks);
					}
					case 3 -> {
						marks = (ans == 'b' ? ++marks : marks);
					}
					case 4 -> {
						marks = (ans == 'c' ? ++marks : marks);
					}
					case 5 -> {
						marks = (ans == 'a' ? ++marks : marks);
					}
					default -> System.out.println("Invalid question");
				}
				
				System.out.println("Correct answer is : " +marks);
			}
			students[student] = marks;
			student++;
			
		}
		
		for(int i=0 ; i<student ; i++){
			System.out.println("Student " + (i+1) + " gets " +students[i]+ " marks ");
		}
        
	}
}