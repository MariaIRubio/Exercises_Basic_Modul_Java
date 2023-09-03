package exercise_studentDataBase_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Methods {
	Scanner scanner = new Scanner(System.in);
	Map<String, Integer> database = new HashMap();

	public void add_student(Integer ID, String input) {
		System.out.println("Enter the name of the Student you want to add:");
		input = scanner.nextLine();
		System.out.println("Enter the ID of the Student: ");
		ID = scanner.nextInt();
		if (database.containsKey(input)) {
			System.out.println(input + " is already in the database");
		} else {
			database.put(input, ID);
			System.out.println("The student " + input + " with the ID " + ID + " is added to the database.");
		}

		System.out.println();
	}

	public void retrieve_studentID() {
		System.out.println("Enter the name of the Student: ");
		String name = scanner.nextLine();

		boolean found = false;
		for (Entry<String, Integer> entry : database.entrySet()) {
			if (entry.getKey().equalsIgnoreCase(name)) {
				System.out.println("ID for student " + name + ": " + entry.getValue());
				found = true;
				break;
			}

			if(!found){
				System.out.println("Student " + name + " not found in the database.");
			}
		}
	}

	public void display_database() {
		for (Entry<String, Integer> map : database.entrySet()) {
			System.out.println(map.getKey() + ": " + map.getValue());
		}
	}

	public void start() {

		int choice;
		System.out.println("Student Database Menu");
		do {
			System.out.println("1. Add a student.");
			System.out.println("2. Retrieve student ID.");
			System.out.println("3. Display database.");
			System.out.println("4. Exit the program. ");
			System.out.println("Choose an option: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Your option: Add a student.");
				add_student(choice, null);
				System.out.println();
				break;

			case 2:
				System.out.println("Your option: Retrieve student ID.");
				retrieve_studentID();
				System.out.println();
				break;

			case 3:
				System.out.println("Your option: Display Database.");
				display_database();
				System.out.println();
				break;
			}

		} while (choice != 4);
		System.out.println("Exiting the program.");

	}

}

public class Main {

	public static void main(String[] args) {

		Methods method = new Methods();

		method.start();

	}

}
