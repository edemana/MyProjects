
//import java.lang.Math;
import java.util.Scanner;

public class Classes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.print("Enter number of decimal places: ");
        int ndp = input.nextInt();

        // double ceil = Math.ceil(area);
        double ans2 = area(radius);
        double ans = roundToNdp(ans2, ndp);

        System.out.println(ans2);
        // System.out.println(Math.ceil(circumference));
        System.out.println(ans);
        input.close();
    }

    public static double area(double radius) {
        double area = Math.PI * (radius * radius);
        return area;
    }

    public static double circumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static double roundToNdp(double num, int ndp) {
        double step1 = num * Math.pow(10, ndp);
        double step2 = Math.ceil(step1);
        double step3 = step2 / Math.pow(10, ndp);
        return step3;

    }
}
