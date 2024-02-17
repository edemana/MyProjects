import java.util.Scanner;

public class TryMe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String first = input.next();
        String second = input.next();
        if (first.equalsIgnoreCase(second)) {
            System.out.println("They are the same.");
        } else {
            System.out.println("False");
        }
    }
}
