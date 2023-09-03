package exercise_ArrayList_shoppingList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> ShoppingList = new ArrayList<>();
		int choice;

		do {
			System.out.println("Shopping List Manager");
			System.out.println("---------------------");
			System.out.println("1. Add an item.");
			System.out.println("2. Remove an item.");
			System.out.println("3. Display the list.");
			System.out.println("4. Exit.");
			System.out.println("----------------------");
			System.out.print("Choose an option to continue: ");
			System.out.println();
			choice = scanner.nextInt();
			scanner.nextLine();
			String answer = choice == 1 ? "Add an item."
					: choice == 2 ? "Remove an item."
							: choice == 3 ? "Display the list." : choice == 4 ? "Exit" : "Wrong input";
			System.out.println("Your choice is: " + answer);
			System.out.println();

			switch (choice) {
			case 1:

				System.out.print("How many items you want to add?: ");
				int number1 = scanner.nextInt();
				scanner.nextLine(); // Consume the newline character after reading the number

				String[] items = new String[number1];

				for (int i = 0; i < number1; i++) {
					System.out.print("Enter the item you want to add (" + (i + 1) + "): ");
					items[i] = scanner.nextLine();

				}
				System.out.println();

				for (String newItem : items) {
					ShoppingList.add(newItem);
					System.out.println("- " + newItem + " is now in your list.");
				}
				System.out.println();
				break;

			case 2:

				if (!ShoppingList.isEmpty()) {
					System.out.println("This are the items of your list: ");

					for (int i = 0; i < ShoppingList.size(); i++) {
						System.out.println((i + 1) + ". " + ShoppingList.get(i));
					}

					System.out.println("How many do you want to remove?: ");
					int number2 = scanner.nextInt();
					scanner.nextLine(); // Consume the newline character after reading the number

					String[] items2 = new String[number2];
					for (int i = 0; i < number2; i++) {
						System.out.print("Enter the item you want to remove (" + (i + 1) + "): ");
						items2[i] = scanner.nextLine();
					}

					for (String removeItem : items2) {
						if (ShoppingList.contains(removeItem)) {
							ShoppingList.remove(removeItem);
							System.out.println();
							System.out.println(removeItem + " is removed from the list.");
							System.out.println();
						} else {
							System.out.println("Item not founded on the list.");
							System.out.println();
						}

					}
				} else {
					System.out.println("No items to remove.");
				}

				break;

			case 3:

				if (!ShoppingList.isEmpty()) {
					System.out.println("This is your shopping list: ");
					for (int i = 0; i < ShoppingList.size(); i++) {
						System.out.println((i + 1) + ". " + ShoppingList.get(i));
					}
					System.out.println();
				} else {
					System.out.println("Shopping list is empty");
				}
				break;

			case 4:

				System.out.println("Exiting the program.");
				System.out.println("Good bye!");
				break;
			}

		} while (choice != 4);

	}
}
