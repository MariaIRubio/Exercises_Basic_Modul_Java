package exercise_multiplicationTable_;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a value: ");
		int n = scanner.nextInt();
		System.out.println("The multiplication table of " + n + " is: ");

		for (int i = 1; i <= 10; i++) {
			int multiply = i * n;
			System.out.println(n + " x " + i + " = " + multiply);
		}

		scanner.close();

	}

}
