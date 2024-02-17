import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GiveTry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter min value: ");
        int min = scanner.nextInt();

        System.out.print("Enter max value: ");
        int max = scanner.nextInt();

        System.out.print("Enter count: ");
        int count = scanner.nextInt();

        if (count <= (max - min)) {
            System.out.println("Count should be greater than (max - min).");
            return;
        }

        int[] randomNumbers = generateRandomNumbers(min, max, count);
        int[] histogram = calculateHistogram(randomNumbers);

        drawHistogram(min, max, histogram);
    }

    public static int[] generateRandomNumbers(int min, int max, int count) {
        Random random = new Random();
        int[] randomNumbers = new int[count];

        for (int i = 0; i < count; i++) {
            randomNumbers[i] = (int) (min + Math.random() * (max - min) + 1);
        }

        return randomNumbers;
    }

    public static int[] calculateHistogram(int[] numbers) {
        int[] histogram = numbers;

        // for (int number : numbers) {
        // histogram[number - numbers[0]]++;
        // }

        return histogram;
    }

    public static void drawHistogram(int min, int max, int[] histogram) {
        for (int i = 0; i < (max - min) + 1; i++) {
            System.out.printf("%3d: ", min + i);

            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
