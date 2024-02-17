import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user and displays net salary
        System.out.print("Enter your gross monthly salary (GH¢): ");
        double grossSalary = input.nextDouble();
        double answer = IncomeTax(grossSalary);
        System.out.printf("Net Income: GH¢%.2f%n", answer);
        input.close();
    }

    public static double IncomeTax(double grossIncome) {
        double tax = 0;
        double remainingIncome = grossIncome;

        if (remainingIncome <= 402) {
        } else if (remainingIncome <= 512) {
            tax += (remainingIncome - 402) * 0.055;
        } else if (remainingIncome <= 642) {
            tax += (remainingIncome - 512) * 0.1 + 5.5;
        } else if (remainingIncome <= 3642) {
            tax += (remainingIncome - 642) * 0.175 + 18.5;
        } else if (remainingIncome <= 20037) {
            tax += (remainingIncome - 3642) * 0.25 + 543.5;
        } else if (remainingIncome <= 50000) {
            tax += (remainingIncome - 20037) * 0.30 + 4642.25;
        } else if (remainingIncome > 50000) {
            tax += (remainingIncome - 50000) * 0.35 + 13631.15;
        }

        double netSalary = grossIncome - tax;
        return netSalary;
    }
}