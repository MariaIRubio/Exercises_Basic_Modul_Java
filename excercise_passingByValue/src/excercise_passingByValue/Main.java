package excercise_passingByValue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the current year: ");
		int year = scanner.nextInt();
		System.out.println("1.Current year: " + year);
		
		System.out.println("Enter your birth year: ");
		int birth = scanner.nextInt();
		System.out.println("2.Birth year: " + birth);
		
		System.out.println("3.Values before swap: " + year + " " + birth);
		
		scanner.close();
		
		swap(year, birth);
		System.out.println("6.Again same values back: " + year + " " + birth);
		}
	
	public static void swap(int value1, int value2) {
		System.out.println("4.Still same values before swap: " + value1 + " " + value2);
		int temp = value1;
		value1 = value2;
		value2 = temp;
		System.out.println("5.Values already swapped: " + value1 + " " + value2);
		
	}

}
