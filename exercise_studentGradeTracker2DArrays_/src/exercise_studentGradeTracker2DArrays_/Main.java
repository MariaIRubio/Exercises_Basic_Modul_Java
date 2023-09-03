package exercise_studentGradeTracker2DArrays_;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce number of Students to track: ");
		int numStudents = scanner.nextInt();
		scanner.nextLine();
		String[] nameStudent = new String[numStudents];

		for (int i = 0; i < numStudents; i++) {
			System.out.print("Introduce the name of the student: " + (i + 1) + ": ");
			nameStudent[i] = scanner.nextLine();
		}

		System.out.println("--------");

		System.out.println("Introduce how many grades of each student you want to track");
		int numGrades = scanner.nextInt();
		scanner.nextLine();

		double[][] list = new double[numStudents][numGrades];
		for (int i = 0; i < numStudents; i++) {
			for (int j = 0; j < numGrades; j++) {
				System.out.print("Introduce the grade for: " + nameStudent[i] + ": ");
				list[i][j] = scanner.nextDouble();
				scanner.nextLine();
			}
		}

		for (int i = 0; i < numStudents; i++) {
			System.out.print(nameStudent[i] + ": ");
			for (int j = 0; j < numGrades; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}

	}

}
