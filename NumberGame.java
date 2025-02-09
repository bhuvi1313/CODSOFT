package javapackage;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int roundsWon = 0;

        do {
            int attempts = 0;
            int maxAttempts = 10;
            int generatedNumber = random.nextInt(100) + 1;
            boolean correctGuess = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have generated a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");

            // Start the guessing loop
            while (attempts < maxAttempts && !correctGuess) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < generatedNumber) {
                    System.out.println("Too low!");
                } else if (userGuess > generatedNumber) {
                    System.out.println("Too high!");
                } else {
                    correctGuess = true;
                    System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                }
            }

            if (!correctGuess) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + generatedNumber + ".");
            }

            roundsWon += correctGuess ? 1 : 0;

            // Ask if the user wants to play another round
            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine(); // consume the newline
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        // Display the score
        System.out.println("Game over! You won " + roundsWon + " rounds.");
        scanner.close();
    }
}
