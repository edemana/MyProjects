import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // Starts the guessing game with a seed value of 5
        guessGame(10);
    }

    // Function to play the guessing game
    public static void guessGame(long seed) {
        // Welcome message
        System.out
                .println("Welcome to the Guessing Game!\nI'm thinking of a number between 1 and 100. Can you guess it");

        // Initializes variables
        Scanner input = new Scanner(System.in);
        int guess, no_of_tries = 1, randomValue;

        // Creates a Random object with a specific seed value
        Random random = new Random(10);
        randomValue = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        // System.out.println(randomValue); // Uncomment to display the actual random
        // value

        // Main game loop
        while (true) {
            System.out.println("Guess a number: ");
            guess = input.nextInt();

            // Checks if the guess is too low, too high, or correct
            if (guess != randomValue) {
                no_of_tries++;

                if (guess < randomValue) {
                    System.out.println("Good try, but that's too low. Try again.");
                }

                if (guess > randomValue) {
                    System.out.println("Good try, but that's too high. Try again.");
                }
            } else {
                // Displays a congratulatory message when the guess is correct
                if (no_of_tries == 1)
                    System.out.println("Yes! You guessed correctly after 1 try! Congratulations.");
                else
                    System.out.println("Yes! You guessed correctly after " + no_of_tries + " tries! Congratulations.");

                // Exits the loop when the correct guess is made
                break;
            }
        }

        // Closes the Scanner
        input.close();
    }
}
