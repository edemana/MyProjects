
/**
 * Hangman Game
 * 
 * This program allows a player to play the Hangman game.
 * A random word is chosen, and the player has to guess the word
 * by entering letters. The player has a limited number of attempts
 * to guess the word correctly.
 * 
 * Author: Edem K. Anagbah
 * Date: 22/2/2024
 */

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] words;

        // Checks if command-line parameters are provided
        if (args.length == 0) {
            // Default words if no command-line parameters are provided
            words = new String[] { // The approach to declaring a new array object does not limit the size of args
                    "apple", "banana", "chocolate", "dog", "elephant",
                    "fireplace", "guitar", "happiness", "island", "jazz",
                    "kangaroo", "lemon", "mountain", "notebook", "ocean"
            };
        } else {
            words = args;
        }

        // Creates Scanner and Random objects for user input and word selection
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Main game loop
        while (true) {
            // Select a random word from the array
            String wordToGuess = words[random.nextInt(words.length)];

            // Initializes guessed word
            char[] guessedWord = initializeGuessedWord(wordToGuess.length());

            // Initializes variables for tracking misses and guessed letters
            int misses = 0;
            boolean wordGuessed = false;
            StringBuilder guessedLetters = new StringBuilder();

            // Inner loop for guessing letters in the word
            while (!wordGuessed) {
                // Prompt user to enter a letter
                char guess = getUserInput(guessedWord, guessedLetters, misses);

                // Checks if the guessed letter is correct
                boolean correctGuess = checkGuess(wordToGuess, guessedWord, guessedLetters, guess);

                // If the guess is incorrect, increment misses
                if (!correctGuess) {
                    System.out.println("       " + guess + " is not in the word.");
                    misses++;
                }

                // Checks if the entire word has been guessed
                wordGuessed = String.valueOf(guessedWord).equals(wordToGuess);

                // Displays the word if it's guessed and break out of the loop
                if (wordGuessed) {
                    System.out.println("The word is " + wordToGuess + ". You missed " + misses + " time(s).");
                    break;
                }
            }

            // Asks if the player wants to play another round
            System.out.print("Do you want to guess another word? Enter y or n: ");
            String playAgain = input.next();
            if (!playAgain.equalsIgnoreCase("y")) {
                break; // Exit the game loop if the player doesn't want to play again
            }
        }

        // Thanks the player for playing and close the Scanner
        System.out.println("Thanks for playing Hangman. Goodbye!");
        input.close();
    }

    /**
     * This method is limited to the Hangman class and
     * it hides the words to be guessed. It takes the parameter;
     * 
     * @param length The length of the word ot be guessed
     * @return An array representing the guessed word
     */
    private static char[] initializeGuessedWord(int length) {
        char[] guessedWord = new char[length];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '*';
        }
        return guessedWord;
    }

    /**
     * This method is only limited to the Hangman class and it takes a letter
     * from the user and checks if the letter has already been guessed.
     * It takes the parameters below;
     * 
     * @param guessedWord    The current state of the guessed word
     * @param guessedLetters The letters that have been guessed
     * @param misses         The number of incorrect guesses
     * @return The letter entered by the user
     */
    private static char getUserInput(char[] guessedWord, StringBuilder guessedLetters, int misses) {
        Scanner input = new Scanner(System.in);
        char guess;

        while (true) {
            // Prompts user to enter a letter
            System.out.print("(Guess) Enter a letter in the word " + String.valueOf(guessedWord) + " > ");
            String userInput = input.next();

            // Checks if the input is a single letter
            if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
                guess = userInput.charAt(0);

                // Checks if the letter has already been guessed
                if (guessedLetters.toString().contains(String.valueOf(guess))) {
                    System.out.println("       " + guess + " is already in the word.");
                    misses++;
                } else {
                    guessedLetters.append(guess);
                    break; // Break out of the loop if the input is valid
                }
            } else {
                System.out.println("Please enter a valid letter.");
                input.close();
            }
        }

        return guess;
    }

    /**
     * This method is limited to Hangman class and it checks the users guesses.
     * It takes the parameters below.
     * 
     * @param wordToGuess    The word to be guessed
     * @param guessedWord    The current state of the guessed word
     * @param guessedLetters The letters that have been guessed
     * @param guess          The letter guessed by the user
     * @return True if the guessed letter is correct, otherwise false
     */
    private static boolean checkGuess(String wordToGuess, char[] guessedWord, StringBuilder guessedLetters,
            char guess) {
        boolean correctGuess = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                guessedWord[i] = guess;
                correctGuess = true;
            }
        }
        return correctGuess;
    }
}