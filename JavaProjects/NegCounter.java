import java.util.*;

public class NegCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size:\n");
        int list_size = scanner.nextInt();

        int[] list = new int[list_size];
        System.out.println("Enter numbers:\n");
        for (int i = 0; i < list_size; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println(find_negatives(list));
        scanner.close();
    }

    public static int find_negatives(int[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < 0) {
                count += 1;
            }
        }
        return count;
    }
}