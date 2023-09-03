package exercise_analyzingExamScores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		StudentExamAnalyzer calculate = new StudentExamAnalyzer();
		System.out.print("Enter the number of students scores you want to calculate: ");
		int n = scanner.nextInt();

		double[] userArray = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter the score of student " + (i + 1) + ": ");
			userArray[i] = scanner.nextDouble();
		}
		

		// double[] studentsScores = {5.7, 6.3, 9.8, 7.1, 5.2, 4.4, 7.9};

		double average = calculate.calculateAverage(userArray);
		System.out.println("Average score: " + average);

		double highestScore = calculate.findHighestScore(userArray);
		System.out.println("Highest score: " + highestScore);

		int aboveAverageCount = calculate.countAboveAverage(userArray);
		System.out.println("Students above average: " + aboveAverageCount);

		double aboveAveragePercentage = calculate.calculatePercentage(userArray);
		System.out.println("Percentage of students above average: " + aboveAveragePercentage + "%");
		
		scanner.close();
	}

}
