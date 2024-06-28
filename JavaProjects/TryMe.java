import java.util.Scanner;

public class TryMe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String first = input.nextLine(); // Use nextLine() to read the full sentence

        System.out.println("Enter another sentence: ");
        String second = input.nextLine(); // Use nextLine() to read the full sentence

        if (first.equalsIgnoreCase(second)) {
            System.out.println("They are the same.");
        } else {
            System.out.println("False");
        }

        input.close(); // Close the scanner to prevent resource leak
    }
}
