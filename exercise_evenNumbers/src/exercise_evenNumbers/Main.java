package exercise_evenNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a starting value: ");
		int a = scanner.nextInt();
		
		System.out.println("Enter a ending value: ");
		int b = scanner.nextInt();
		
		System.out.println("Even numbers between " + a + " and " + b + " are: ");
		
		for(int i=a; i<=b; i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
		}
		scanner.close();
	}

}
