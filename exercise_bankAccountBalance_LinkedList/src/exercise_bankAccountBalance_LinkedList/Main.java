package exercise_bankAccountBalance_LinkedList;

import java.util.LinkedList;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		List<Double> bank_balance = new LinkedList<>();
		
		
		addAccount(bank_balance, 1000.0);
		addAccount(bank_balance, 1500.0);
		addAccount(bank_balance, 500.0);
		
		displayBalance(bank_balance);

	}

	public static void addAccount(List<Double> list, double balance) {
			list.add(balance);
	}
	
	public static void displayBalance(List<Double> list) {
		System.out.println("Account Balance: ");
		for(Double balance:list) {
			System.out.println("• $"+balance);
		}
	}

}
