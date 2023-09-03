package exercise_factorialCalculation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a value: ");
		int n = scanner.nextInt();
		
		scanner.close();
		int factorial = 1;
		
		for(int i=1; i <= n; i++) {
			
			factorial *= i;
			System.out.println(i);
		}
		
		System.out.println( factorial);
	}
	
}