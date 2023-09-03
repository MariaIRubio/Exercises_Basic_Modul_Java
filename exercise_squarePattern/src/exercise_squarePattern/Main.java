package exercise_squarePattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value: ");
		
		int n = scanner.nextInt();
		
		System.out.println("Square Pattern of size " + n);
		System.out.println();
		
		for(int i=1; i<=n; i++) {
			for(int x=1; x<=n; x++){
				System.out.print("* ");
			}
			
			System.out.println();

			scanner.close();
		}

	}

}
