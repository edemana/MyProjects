import java.util.Scanner;
import java.lang.Math;

public class CaseStudy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(
                "Welcome to my program. This program helps calculate the angles of a triangle.\nAll it requires are the x and y coordinates of the triangle.\nEnter first x coordinate: ");
        double x1 = input.nextDouble();
        System.out.println("Enter first y coordinate: ");
        double y1 = input.nextDouble();
        System.out.println("Enter second x coordinate: ");
        double x2 = input.nextDouble();
        System.out.println("Enter second y coordinate: ");
        double y2 = input.nextDouble();
        System.out.println("Enter third x coordinate: ");
        double x3 = input.nextDouble();
        System.out.println("Enter third y coordinate: ");
        double y3 = input.nextDouble();

        double a = getLength(x1, y1, x3, y3);
        double b = getLength(x2, y2, x3, y3);
        double c = getLength(x1, y1, x2, y2);

        double A = Math.toDegrees(Math.acos(((a * a - b * b - c * c) / (-2 * b * c))));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
        System.out.printf("The angles are: A = %.1f, B = %.1f and C = %.1f. ", A, B, C);
        // System.out.println(b);

        input.close();

    }

    public static double getLength(double x1, double y1, double x2, double y2) {
        double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return d;
    }

}
