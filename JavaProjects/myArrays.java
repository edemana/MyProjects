
import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;

public class myArrays {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter number of viewers: ");
            int lenViewers = input.nextInt();
            String[] names = new String[lenViewers];
            int[] views = new int[lenViewers];
            System.out.println("Enter the name of viewers and the number of views: ");
            int sum = 0;
            for (int i = 0; i < lenViewers; i++) {
                names[i] = input.next();
                views[i] = input.nextInt();
                sum = sum + views[i];
            }
            System.out.print(sum + "\n");

            System.out.println(Arrays.toString(names));
        }
    }

    public static double averageViews(int[] list) {
        return 0;

    }
    //

}
