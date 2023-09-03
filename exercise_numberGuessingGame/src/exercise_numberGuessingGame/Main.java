package exercise_numberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int number = random.nextInt(101)+1;
		System.out.println("Hey! Let's play! uess a number between 1 and 100: ");
		int guess;

		
		do{	System.out.print("Enter your guess: ");
		guess = scanner.nextInt();
			if(guess < number) {
				System.out.print("Your guess is too low. ");
			} else if (guess > number) {
				System.out.print("Your guess is too high. ");
			} else {
				System.out.println("Correct answer! Well done!");
				System.out.println("The number is " + number);	
			}
	
		} while(guess != number);
		
		scanner.close();
	}
}