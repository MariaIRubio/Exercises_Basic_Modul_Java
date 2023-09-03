package exercise_languageTranslator_HashMap;

import java.util.*;
import java.util.Map.Entry;

class Methods {

	Map<String, String> translator = new HashMap<>();
	Scanner scanner = new Scanner(System.in);

	public void add_translation(String word, String translation) {

		System.out.println("Enter a word in English: ");
		word = scanner.nextLine();

		if (translator.containsKey(word)) {
			System.out.println(word + " already exist in the system.");
		} else {
			System.out.println("Enter the translation in Spanish: ");
			translation = scanner.nextLine();
			translator.put(word, translation);
			System.out.println(word + " and its translation is added to the system.");
		}
		System.out.println();
	}

	public void look_up(String translation) {

		System.out.println("Enter a word in Spanish: ");
		translation = scanner.nextLine();

		boolean found = false;

		for (Entry<String, String> map : translator.entrySet()) {
			if (map.getValue().equalsIgnoreCase(translation)) {
				System.out.println("Translation for " + translation + ": " + map.getKey());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println(translation + " not found in the system.");
		}
		System.out.println();
	}

	public void display_translator() {

		for (Entry<String, String> map : translator.entrySet()) {
			System.out.println(map.getKey() + ": " + map.getValue());
			
		}System.out.println();
	}

	public void start() {

		int choice;

		do {
			System.out.println("Language Translator Menu.");
			System.out.println("1. Add a translation.");
			System.out.println("2. Look up translation.");
			System.out.println("3. Display translator.");
			System.out.println("4. Exit the program.");
			System.out.println("Choose an option: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 1:
				System.out.println("You choose 'Add a translation'");
				add_translation(null, null);
				break;

			case 2:
				System.out.println("You choose 'Look up translation'");
				System.out.println();
				look_up(null);
				break;

			case 3:
				System.out.println("You choose 'Display translator'");
				System.out.println();
				display_translator();
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
