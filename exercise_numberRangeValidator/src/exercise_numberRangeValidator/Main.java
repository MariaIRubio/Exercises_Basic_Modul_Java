package exercise_numberRangeValidator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		String valid = number >= 10 && number <= 50 ? "Number is within the valid range " : "Number is not within the valid range";
		
		System.out.println(valid);
	}

}
