package exercise_recursion_;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a positive number: ");
		int number = scanner.nextInt();
		
		scanner.close();
		
		if (number < 0) {
		System.out.println("Enter a positive number");}
		
		else {
			recursion(1, number);
			System.out.println("Printing complete!");
		}


	}
	
	public static void recursion(int value, int value2) {
		
		if(value <= value2) {
			System.out.println(value);
			recursion(value + 1, value2);
		}
		
		/*if (value > value2) {
		 * return;}
		 * else{
		 * System.out.println(first};
		 * recursion(value +1, value2);}*/

	}

}
