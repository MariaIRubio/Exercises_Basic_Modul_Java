package exercise_multiplicationQuiz;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int number1 = random.nextInt(11) + 1;
		int number2 = random.nextInt(11) + 1;
		System.out.println("Let's play a multiplication game.");
		System.out.println("How much is " + number1 + " x " + number2 + " ?");
		int result = number1 * number2;

		boolean correct;

		do {
			System.out.print("Give your answer: ");
			int answerUser = scanner.nextInt();

			correct = result == answerUser;
			if (correct) {
				System.out.println("Correct answer!!");

			} else {
				System.out.println("Wrong answer. Try again. ");
			}
		} while (!correct);

		scanner.close();
	}

}
