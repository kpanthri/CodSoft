/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codsoft;

/**
 *
 * @author Lenovo
 */


   import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int start = 1;
        int end = 100;
        boolean playAgain = true;

        while (playAgain) {
            int generatedGuess = random.nextInt(end - start + 1) + start;
            int tries = 0;
            boolean correctnum = false;
            int maxTries = 6;
            int score = 0;
           

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Choose a number between " + start + " and " + end + ".");
            System.out.println("Can you guess what it is? You have " + maxTries + " attempts.");

            while (tries < maxTries && !correctnum) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                tries++;

                if (generatedGuess > userGuess) {
                    System.out.println("Too low! Try again.");
                } else if (generatedGuess < userGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    correctnum = true;
                    System.out.println("Congratulations! You've guessed the correct number in " + tries + " tries.");
                      score+=5;
                      break;
                }
            }

            if (!correctnum) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + generatedGuess + ".");
            }
            System.out.println("Your total score is :"+score);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        scanner.close();
        System.out.println("Thank you for playing! Goodbye.");
    }
}


