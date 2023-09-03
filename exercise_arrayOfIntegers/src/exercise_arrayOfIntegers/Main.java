package exercise_arrayOfIntegers;

public class Main {

	public static int calculateSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}

	public static int findMaxValue(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static int findMinValue(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static double calculateAverage(int[] arr) {
		int sum = calculateSum(arr);
		return (double) sum / arr.length;
	}

	public static void main(String[] args) {

		int numbers[] = { 16, 8, 23, 35, 11, 6, 19 };
		int sum = calculateSum(numbers);
		int min = findMaxValue(numbers);
		int max = findMinValue(numbers);
		double average = calculateAverage(numbers);

		System.out.println("Sum of the numbers: " + sum);
		System.out.println("Maximum value: " + max);
		System.out.println("Minimun value: " + min);
		System.out.println("Average value: " + average);
	}

}
