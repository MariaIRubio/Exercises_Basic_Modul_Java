package exercise_stringArrayOperations;

public class Main {

	public static void main(String[] args) {

		String[] words = { "apple", "strawberry", "grape", "grapefruit", "watermelon", "pineapple" };
		
		System.out.println("Array of Strings: ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		String longestString = findLongestString(words);
		System.out.println("Longest string: "  + longestString);

	}
	
	public static String findLongestString(String[] arr) {
		String longest = arr[0];
		for (int i = 1; i< arr.length; i++) {
			if(arr[i].length() > longest.length()) {
				longest = arr[i];
			}
		}
		return longest;
	}
}
