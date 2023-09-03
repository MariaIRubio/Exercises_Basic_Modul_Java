package exercise_gradeCalculatorTernaryOperator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your score please: ");
		int score = scanner.nextInt();
		
		String grade = score<60 ? "F" : 
						score>=60 && score<=69 ? "D": 
						score>=70 && score<=79 ? "C" : 
						score>=80 && score<=89 ? "B" : 
						score>=90 ? "A": 
						"Invalid score";
		
		System.out.println("Your score is: " + grade);
		
		scanner.close();
	}

}
