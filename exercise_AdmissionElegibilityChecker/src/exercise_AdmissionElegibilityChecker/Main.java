package exercise_AdmissionElegibilityChecker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your GPA: ");
		float gpa = scanner.nextFloat();
		
		System.out.print("Enter your SAT:");
		long sat = scanner.nextLong();
		
		String admission = gpa>= 3.5 && sat>= 1500 ? "Admited":"Not admited";
		
		System.out.println(admission);

	}

}
