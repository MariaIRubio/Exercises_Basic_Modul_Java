package exercise2_passingByValue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a value: ");
		int input = scanner.nextInt();
		
		scanner.close();
		
		int result = increase(input);
		
		System.out.println("Your original value is " + input +  " and the incremented value is " + result);
		
	}
	
	public static int increase(int value) {
		return value + 1;
		
	}

}
