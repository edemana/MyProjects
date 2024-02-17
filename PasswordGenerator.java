
// This program generates a random password and checks if it is valid
import java.security.SecureRandom; //This class provides a cryptographically strong random number generator (RNG).
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read input from the user
        System.out.print("Enter mimum password length: ");
        int mLength = input.nextInt();

        System.out.print("Enter mimum number of uppercase characters: ");
        int mUpperCase = input.nextInt();

        System.out.print("Enter mimum number of digits: ");
        int mDigits = input.nextInt();

        System.out.print("Enter mimum number of special characters: ");
        int mSpecialChars = input.nextInt();

        System.out.print("Enter allowed special characters: ");
        String allowedSpecialChars = input.next();

        input.close();

        // Generates and displays a random password
        String password = generatePassword(mLength, mUpperCase, mDigits, mSpecialChars, allowedSpecialChars);
        System.out.println("Generated Password: " + password);

        // Checks if the generated password is valid
        boolean isValid = checkPassword(password, mLength, mUpperCase, mDigits, mSpecialChars,
                allowedSpecialChars);
        System.out.println("Is the password valid? " + isValid);
    }

    public static String generatePassword(int mLength, int mUpperCase, int mDigits, int mSpecialChars,
            String allowedSpecialChars) {
        SecureRandom random = new SecureRandom(); // Helps generate random numbers
        StringBuilder password = new StringBuilder(); // StringBuilder enables the use of the append method

        for (int i = 0; i < mUpperCase; i++) {
            // Generates the random characters for the password
            password.append((char) (random.nextInt(26) + 'A'));
        }

        for (int i = 0; i < mDigits; i++) {
            // Generates the random digits for the password
            password.append(random.nextInt(10));
        }

        for (int i = 0; i < mSpecialChars; i++) {
            // Selects a random special character
            int index = random.nextInt(allowedSpecialChars.length());
            password.append(allowedSpecialChars.charAt(index));
        }

        while (password.length() < mLength) {
            int category = random.nextInt(3); // 0 for uppercase, 1 for digits, 2 for special characters

            switch (category) {
                case 0:
                    password.append((char) (random.nextInt(26) + 'A'));
                    break;
                case 1:
                    password.append(random.nextInt(10));
                    break;
                case 2:
                    int index = random.nextInt(allowedSpecialChars.length());
                    password.append(allowedSpecialChars.charAt(index));
                    break;
            }
        }

        // Shuffles the generated password
        char[] passwordArray = password.toString().toCharArray();
        for (int i = passwordArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = passwordArray[index];
            passwordArray[index] = passwordArray[i];
            passwordArray[i] = temp;
        }

        return new String(passwordArray);
    }

    public static boolean checkPassword(String password, int mLength, int mUpperCase, int mDigits,
            int mSpecialChars, String allowedSpecialChars) {
        int upperCaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        // Implements the logic to check if the password satisfies the rules
        // Converts password into an array which is looped through to spot any presence
        // of Uppercase, digits and special characters
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCaseCount++; // indicates if there is an uppercase letter in password
            } else if (Character.isDigit(ch)) {
                digitCount++; // indicates if there is a digit in the password
            } else if (allowedSpecialChars.contains(String.valueOf(ch))) {
                specialCharCount++;// indicates if there is a special character in the password
            }
        }

        return password.toCharArray().length >= mLength &&
                upperCaseCount >= mUpperCase &&
                digitCount >= mDigits &&
                specialCharCount >= mSpecialChars; // returns a boolean
    }
}
