package exercise_doWhileLoop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	EvenNumberCounter count = new EvenNumberCounter();	
	
	System.out.println("Enter your input: ");
	int input = scanner.nextInt();
	
	count.countAndDisplay(input);
	}

}

 class EvenNumberCounter{
	
	public void countAndDisplay(int limit) {
		
		int number = 2;
		
			do {
				System.out.println(number);
				number += 2;
			
			}while(number <= limit);
		}
		
}
