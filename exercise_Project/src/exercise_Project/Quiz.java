package exercise_Project;

import java.util.Scanner;

public class Quiz {
	     String[] questions;
	     String[] answers;

	    public Quiz(String[] questions, String[] strings) {
	        this.questions = questions;
	        this.answers = answers;
	    }

	    public void startQuiz(Scanner scanner) {
	        int score = 0;
	        int questionNumber = 1;

	        for (String question:questions) {
	            boolean answerCorrect = false;

	            while (!answerCorrect) {
	                System.out.println("Question " + questionNumber + ": " + question);
	                String userAnswer = scanner.nextLine();
	                if (userAnswer.equalsIgnoreCase(answers)) {
	                    System.out.println("Correct!");
	                    score++;
	                    answerCorrect = true;
	                } else {
	                    System.out.println("Incorrect! Try again.");
	                }
	                
	            }
	            questionNumber++;
	        }

	        System.out.println("Your score is: " + score + " points");
	    }
	}



