import java.util.Scanner;

public class Tgame {
    public static void main(String[] args) {
        String[] wordList = {
                "apple", "banana", "chocolate", "dog", "elephant",
                "fireplace", "guitar", "happiness", "island", "jazz",
                "kangaroo", "lemon", "mountain", "notebook", "ocean"
        };

        if (args.length != 0) {
            wordList = args;
        }

        try (Scanner input = new Scanner(System.in)) {
            for (String word : wordList) {
                int attempts = 0;
                StringBuilder guessedWord = new StringBuilder("*".repeat(word.length()));

                while (attempts < 6) {
                    System.out.println("(Guess) Enter a letter in word " + guessedWord);
                    String letter = input.next();

                    char guessedLetter = letter.charAt(0);

                    if (guessedWord.toString().contains(String.valueOf(guessedLetter))) {
                        System.out.println("You already guessed " + guessedLetter);
                        continue;
                    }

                    if (word.contains(String.valueOf(guessedLetter))) {
                        for (int j = 0; j < word.length(); j++) {
                            if (word.charAt(j) == guessedLetter) {
                                guessedWord.setCharAt(j, guessedLetter);
                            }
                        }

                        if (guessedWord.toString().equals(word)) {
                            System.out.println("The word is " + word + ". You missed " + attempts + " attempt(s).");
                            break;
                        }
                    } else {
                        attempts++;
                        System.out.println(guessedLetter + " is not in the word. Attempts left: " + (6 - attempts));
                    }
                }
            }
        }

        System.out.println("Thanks for playing. Goodbye!");
    }
}
