import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        String[] wordList = {
                "apple", "banana", "chocolate", "dog", "elephant",
                "fireplace", "guitar", "happiness", "island", "jazz",
                "kangaroo", "lemon", "mountain", "notebook", "ocean"
        };
        if (args.length != 0) {
            wordList = args;
        }

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < wordList.length; i++) {
            // Initialize the guessedWord with asterisks
            StringBuilder guessedWord = new StringBuilder("*".repeat(wordList[i].length()));
            // Continue until the word is guessed or too many attempts are made
            while (true) {
                System.out.println("(Guess) Enter a letter in word " + guessedWord);
                String letter = input.next();

                char guessedLetter = letter.charAt(0);
                if (guessedWord.toString().contains(String.valueOf(guessedLetter))) {
                    System.out.println("You already guessed " + guessedLetter);
                    continue; // Skip the rest of the loop and prompt again
                }
                // Check if the guessed letter is in the word
                if (wordList[i].contains(String.valueOf(guessedLetter))) {
                    // Update guessedWord with the correctly guessed letter
                    for (int j = 0; j < wordList[i].length(); j++) {
                        if (wordList[i].charAt(j) == guessedLetter) {
                            guessedWord.setCharAt(j, guessedLetter);

                        }
                    }

                    // Check if the word is fully guessed
                    if (guessedWord.toString().equals(wordList[i])) {
                        System.out.println(
                                "The word is " + wordList[i] + "." + "You missed "
                                        + " attempt(s).\nDo you want to continue? Enter y or n: ");
                        String response = input.next();
                        if (response == "y") {

                            continue;
                        } else {
                            break;
                        }

                        // break;
                    }
                } else {
                    int attempts = 0;
                    attempts += 1;
                    System.out.println(guessedLetter + " is not in the word.");
                }
            }
        }
    }
}
