package exercise_emailList_HashSet;

import java.util.HashSet;
import java.util.Scanner;

class EmailList {
	HashSet<String> email_list = new HashSet<>();

	public void addEmail(String email) {
		email_list.add(email);
	}

	public void displayEmail() {
		System.out.println("Email list: ");
		for (String email : email_list) {
			System.out.println(email);
		}
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		EmailList email_list = new EmailList();

		System.out.print("Enter your email Address. Type 'exit' to finish. ");
		System.out.println("Email: ");
		String email_user;

		while (true) {
			email_user = scanner.nextLine();
			if (email_user.equalsIgnoreCase("exit")) {
				break;
			}
			email_list.addEmail(email_user);
		}

		email_list.displayEmail();

		scanner.close();
	}
}
