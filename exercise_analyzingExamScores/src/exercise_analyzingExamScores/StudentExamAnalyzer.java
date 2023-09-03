package exercise_analyzingExamScores;

public class StudentExamAnalyzer {
	
	public float calculateAverage(double[] arr) {
		
		float sum = 0;
		float average = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			average = (float) sum / arr.length;
		}
		return average;
	}

	public double findHighestScore(double[] arr) {
		double max = arr[0];
		double min = arr[0];
		for (double number : arr) {
			if (number > max) {
				max = number;
			}
			if (number < min) {
				min = number;
			}
		}
		return max;
	}

	public int countAboveAverage(double[] arr) {
		double average = calculateAverage(arr);

		int count = 0;
		for (double number : arr) {
			if (number > average) {
				count++;
			}
		}
		return count;
	}

	public float calculatePercentage(double[] arr) {
		float aboveAverageCount = countAboveAverage(arr);
		float percentage = ((float) aboveAverageCount / arr.length) * 100;

		return percentage;
	}
}
