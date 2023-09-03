package exercise_dictionary_TreeSet;
import java.util.*;

class Methods{
	TreeSet<String> words = new TreeSet<>();
	Scanner scanner = new Scanner(System.in);
	
	public void add_word(String inputWords) {
		String[] wordsArray = inputWords.split(",\\s*");  // Split input by commas
         
             if(words.contains(inputWords)) {
            	 System.out.println(inputWords + " already exixts in the dictionar");
             }else {
            	 for (String word : wordsArray) {
                     words.add(word.trim());  // Add each word to the TreeSet
                     
             }System.out.println("The word(s) " + inputWords + " is added to the dictionary");
         }
		
		System.out.println();
	}
	
	public void search_word(String input) {
		if(words.contains(input)) {
			System.out.println("- " + input + "-. Word founded in dictionary.");
		}else {
			System.out.println("- " + input + "-. Word not founded in dictionary.");
		}System.out.println();
	}
	
	public void display_dictionary() {
		System.out.println("Here is the dictionary: ");
		for(String word:words) {
			System.out.println("- "+word);
		}System.out.println();
	}
	
	
	public void start() {
		int choice;
		System.out.println("Dictionary App.");
		do {
			System.out.println("1. Add a word.");
			System.out.println("2. Search for a word.");
			System.out.println("3. Display dictionary.");
			System.out.println("4. Exit the program. ");
			System.out.println("Choose an option: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Your option: Add a word.");
				System.out.println("Enter the word (or words separated with a coma) you want to add:");
				String word = scanner.nextLine();
				add_word(word);
				System.out.println();
				break;
				
			case 2: 
				System.out.println("Your option: Search for a word.");
				System.out.println("Enter the word you are looking for: ");
				String input = scanner.nextLine();
				search_word(input);
				System.out.println();
				break;
			
			case 3: 
				System.out.println("Your option: Display Dictionary.");
				display_dictionary();
				System.out.println();
				break;
			}
			
		}while(choice !=4);
		System.out.println("Exiting the program.");
		
	}
}

public class Main {

	public static void main(String[] args) {
		
		Methods method = new Methods();
		
		method.start();
	}

}
