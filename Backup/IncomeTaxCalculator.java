import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        // Creates a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Takes input from the user for gross monthly salary
        System.out.print("Enter your gross monthly salary (GH¢): ");
        double grossSalary = input.nextDouble();

        // Calculates net income using the IncomeTax function
        double answer = IncomeTax(grossSalary);

        // Displays the calculated net income
        System.out.printf("Net Income: GH¢%.2f%n", answer);

        // Close the Scanner to prevent resource leaks
        input.close();
    }

    // Function to calculate income tax and net salary
    public static double IncomeTax(double grossIncome) {
        // Initializes variables
        double tax = 0;
        double remainingIncome = grossIncome;

        // Calculates tax based on income brackets
        if (remainingIncome <= 402) {
            // No tax for income up to 402
            // Note: This block is intentionally left empty
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

        // Calculates net salary after deducting tax
        double netSalary = grossIncome - tax;
        return netSalary;
    }
}
