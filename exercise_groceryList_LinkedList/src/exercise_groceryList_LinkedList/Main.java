package exercise_groceryList_LinkedList;

import java.util.LinkedList;
import java.util.List;

class GroceryItem{ // Create a GroceryItem class to create  items with two attributes name and price
	String name;
	double price;
	
	public GroceryItem(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item: " + name + ", " + price + "€";
	}
	
}

class GroceryList{ // GroceryList class contains the LinkedList of GroceryItem type objects. 
	List<GroceryItem> items = new LinkedList<>(); //GroceryItem is the type   - items the name of the LinkedList. we need to initialize this variable local.
		
	//This class contains the methods to add and to display the list
	
	public void addItem(String name, double price) {
		GroceryItem item = new GroceryItem(name, price); //Create a new object wit the new parameters name and price
		items.add(item);
	}
	
	public void displayList() {
		System.out.println("---Grocery List---");
		System.out.println("Your list contain: ");
		for(GroceryItem item:items) { //GroceryItem is the type we created      items is the LinkedList to created
			System.out.println(item);
		}
	}
}


public class Main {

	public static void main(String[] args) {
	
		
		GroceryList grocery_list = new GroceryList(); // instance created 
		
		
		grocery_list.addItem("bananas", 12.5);
		grocery_list.addItem("pineapple", 6.3);
		grocery_list.addItem("melon", 10.5);
		
		grocery_list.displayList();

	}

}


