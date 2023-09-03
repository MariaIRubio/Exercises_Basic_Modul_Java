package exercise_discountCalculatorTernaryOperator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the order amount: ");
		long order = scanner.nextLong();
		
		if(order>=100) {
			long discount = order*10/100;
			long total_cost = order - discount;
			
			System.out.println("You get a discount of " + discount + "€");
			System.out.println("The final price is " + total_cost + "€");
		}
		else {
			System.out.println("There are not discounts avalaible");
		}
		
		

	}

}
