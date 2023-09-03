package exercise_UniqueNumberCounter_TreeSet;

import java.util.*;

class Methods{
	
	TreeSet<Integer> unique_numbers = new TreeSet<>();
	
	public void input_numbers(Integer numbers) {
		unique_numbers.add(numbers);
	}
	
	public void count_uniqueNumbers() {
		int count = unique_numbers.size();
		System.out.println("Count of unique numbers " + count);
	}
	
	public void display_uniqueNumbers() {
		for(Integer number:unique_numbers) {
			System.out.println(number);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		
		TreeSet<Integer> unique_numbers = new TreeSet<>();
		Scanner scanner = new Scanner(System.in);
		Methods method = new Methods();
		
		int choice = 0;
		System.out.println("Programm of unique numbers.");
		System.out.println("---------------------------");
		do {System.out.println("Choose an option: ");
			System.out.println("1. Input numbers.");
			System.out.println("2. Count unique numbers.");
			System.out.println("3. Display unique number count.");
			System.out.println("4. Exit.");
			
			System.out.print("Your option: ");
			System.out.println();
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1: 
				System.out.println("Your choice is Input numbers.");
				System.out.println("Enter the numbers. Press 'ready' to finish.");
				while (true) {
					if(scanner.hasNextInt()) {
						int numbers = scanner.nextInt();
						method.unique_numbers.add(numbers);
					}else {
						String input = scanner.nextLine();
						if(input.equalsIgnoreCase("ready")) {
						break;}
					}
				}System.out.println("Numbers added");
				System.out.println("---------------------------");
				break;
				
			case 2: 
				System.out.println("Your choice is Count unique numbers.");
				System.out.println();
				method.count_uniqueNumbers();
				System.out.println();
				break;
				
			case 3: 
				System.out.println("Your choice is Display unique numbers count.");
				System.out.println();
				method.display_uniqueNumbers();
				System.out.println("---------------------------");
				break;
				
			}
			
		}while(choice != 4);
		System.out.println("Exiting programm.");
	}

}
