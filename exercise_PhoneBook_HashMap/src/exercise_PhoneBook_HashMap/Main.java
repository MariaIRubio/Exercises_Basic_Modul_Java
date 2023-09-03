package exercise_PhoneBook_HashMap;

import java.util.*;
import java.util.Map.Entry;

class Method {

	Map<String, Integer> phoneBook = new HashMap<>();
	Scanner scanner = new Scanner(System.in);

	public void add_contact(String name, int number) {

		System.out.println("Introduce the name: ");
		name = scanner.nextLine();

		if (phoneBook.containsKey(name)) {
			System.out.println(name + " is already in your phone book.");
		} else {
			System.out.println("Introduce the phone number of " + name);
			number = scanner.nextInt();
			scanner.nextLine();
			phoneBook.put(name, number);
			System.out.println(name + " added to the phone book.");
		}
	}

	
	
	public void look_up(String searchName) {
		System.out.println("Introduce the name: ");
		searchName = scanner.nextLine();
			
		boolean found = false;

		for (Entry<String, Integer> contact : phoneBook.entrySet()) {
			if (contact.getKey().equalsIgnoreCase(searchName)) {
				System.out.println(searchName + ": " + contact.getValue());
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println(searchName + " is not in the phone book.");
		}
	}
	
	
	
	public void display_phoneBook() {
		for(Entry<String, Integer> contact: phoneBook.entrySet()) {
			System.out.println(contact.getKey()+ ": "+ contact.getValue());
		}
	}

	
	
	public void start() {

		System.out.println("Phone Book Menu");
		int choice;

		do {
			System.out.println("1. Add contact.");
			System.out.println("2. Look up phone number.");
			System.out.println("3. Display phone book.");
			System.out.println("4. Exit the program.");
			System.out.println("Choose an option: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Choice: Add a contact.");
				add_contact(null, choice);
				System.out.println();
				break;

			case 2:
				System.out.println("Choice: Look up a number.");
				look_up(null);
				System.out.println();
				break;

			case 3:
				System.out.println("Choice: Display phone book.");
				display_phoneBook();
				System.out.println();
				break;
			}

		} while (choice != 4);
		System.out.println("Exiting the program.");
	}
}

public class Main {

	public static void main(String[] args) {

		Method method = new Method();

		method.start();
	}

}
