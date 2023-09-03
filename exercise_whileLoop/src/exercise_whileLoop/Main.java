package exercise_whileLoop;

public class Main {

	public static void main(String[] args) {
		NumberCounter counter = new NumberCounter();

		counter.countAndDisplay(1, 10);
	}

}

class NumberCounter {

	public void countAndDisplay(int start, int end) {
		int current = start;
		while (current <= end) {
			System.out.println(current);
			current++;
		}

	}

}
