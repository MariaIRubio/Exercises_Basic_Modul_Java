package exercise_shoppingCart_HashMap;

import java.util.*;


class Method {

	Map<String, Integer> cartList = new HashMap<>();
	Map<String, Double> priceList = new HashMap<>();
	Scanner scanner = new Scanner(System.in);

	public void add_item() {
		System.out.println("Add item: ");
		String item = scanner.nextLine();

		if (cartList.containsKey(item)) {
			System.out.println(item + " is already in the list.");
		} else {
			System.out.println("Add amount: ");
			int amount = scanner.nextInt();
			scanner.nextLine();
			cartList.put(item, cartList.getOrDefault(item, 0) + amount);
			System.out.println(amount + " " + item + " added to the cart.");
		}
	}

	public void display_cart() {
		if (!cartList.isEmpty()) {
			System.out.println("Cart contents: ");
			for (String item : cartList.keySet()) {
				System.out.println(item + " : " + cartList.get(item));
			}
		} else {
			System.out.println("The Cart is empty.");
		}

	}

	public void calculate_price() {
		double totalPrice = 0.0;
		if (!cartList.isEmpty()) {
			for (String item : cartList.keySet()) {
				if (priceList.containsKey(item)) {
					totalPrice += cartList.get(item) * priceList.get(item);
					System.out.println(
							cartList.get(item) + " " + item + " x " + priceList.get(item) + "€ = " + totalPrice);
				}
			}
			System.out.println("Total price: " + totalPrice + "€");
		} else {
			System.out.println("The cart is empty.");
		}

	}

	public void menu() {

		int choice;

		do {
			System.out.println("Shopping Cart Menu");
			System.out.println("1. Add item to cart.");
			System.out.println("2. Display cart contents.");
			System.out.println("3. Calculate total price.");
			System.out.println("Choose an option: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 1:
				System.out.println("Choice: Add item to cart.");
				add_item();
				System.out.println();
				break;

			case 2:
				System.out.println("Choice: Display cart contents.");
				display_cart();
				System.out.println();
				break;

			case 3:
				System.out.println("Choice: Calculate total price.");
				calculate_price();
				System.out.println();
				break;

			case 4:
				System.out.println("Exiting program.");
				break;

			default:
				System.out.println("Incorrect choice. Choose a valid option.");

			}

		} while (choice != 4);

	}

	public void start() {

		menu();

	}

}

public class Main {

	public static void main(String[] args) {

		Method method = new Method();

		method.priceList.put("banana", 1.20);
		method.priceList.put("melon", 7.30);
		method.priceList.put("bread", 4.50);
		method.priceList.put("müsli", 3.45);
		method.priceList.put("milk", 2.17);

		method.start();
	}

}
