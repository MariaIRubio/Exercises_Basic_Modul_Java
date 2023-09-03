package exercise_votingEligibilityChecker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter your age: ");
	int age = scanner.nextInt();
	
	System.out.println("Are you citizien?: Answer true or false ");
	boolean status = scanner.nextBoolean();
	
	String elegible = (age>=18 && status) ? "Elegible to vote":"Not elegible to vote";
	
	System.out.println(elegible);
	
	scanner.close();

	}

}
