package exercise2_recursion_;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number;

		do {
			System.out.println("Enter a positive number: ");
			number = scanner.nextInt();

		} while (number < 0);

		scanner.close();

		recursion(number, 0);
		System.out.println("Countdown complete!");

	}

	public static void recursion(int a, int b) {

		if (a > b) {
			System.out.println(a);
			recursion(a - 1, b);
		}

	}

}
