import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        guessGame(5);
    }

    public static void guessGame(long seed) {
        System.out.println(
                "Welcome to the Guessing Game!\nI'm thinking of a number between 1 and 100. Can you guess it");
        Scanner input = new Scanner(System.in);
        int guess, no_of_tries = 1, randomValue;
        Random random = new Random(5);
        randomValue = random.nextInt(100) + 1;
        // System.out.println(randomValue);

        while (true) {
            System.out.println("Guess a number: ");
            guess = input.nextInt();
            if (guess != randomValue) {
                no_of_tries++;
                if (guess < randomValue) {
                    System.out.println("Good try, but that's too low. Try again.");
                }
                if (guess > randomValue) {
                    System.out.println("Good try, but that's too high. Try again.");
                }
            } else {
                if (no_of_tries == 1)
                    System.out.println("Yes! You guessed correctly after 1 try! Congratulations.");
                else
                    System.out.println("Yes! You guessed correctly after " + no_of_tries + " tries! Congratulations.");
                break;
            }
        }
        input.close();
    }
}