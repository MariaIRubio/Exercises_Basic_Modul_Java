package exercise_Project2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of bills you want to calculate: ");
        int n = scanner.nextInt();
        
        double[] userArray = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the amount of bill " + (i + 1) + ": ");
            userArray[i] = scanner.nextDouble();
        }

        System.out.println("You entered the following bills:");
        for (double num : userArray) {
            System.out.print(num + "€ ");
        }

        scanner.close();
        
        Average_calculator get = new Average_calculator();
        double result = get.average(userArray);
        
        System.out.println();
        System.out.println("Average of your bills: " + result + "€");
        
        String validForDisccount = result>=50 ? "To thank you for your fidelity you get a 10% disccount.":"Thanks for your purchases. Keep summing points with us to get disccounts in the future.";
        System.out.println(validForDisccount);
        
        Disccount calculate = new Disccount();
        double result2 = calculate.disccount(result);
        System.out.println("Your disccount for the next purchase is: " + result2 + "€");
    }
}

