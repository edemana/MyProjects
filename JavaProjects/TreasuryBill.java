
// This program compute the total value of an investment and the interest earned over a period
import java.util.Scanner;

public class TreasuryBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reads input from the user
        System.out.print("Enter the initial amount to invest (principal): ¢");
        double principal = input.nextDouble();

        System.out.print("Enter the amount to be added to the investment account in each period (deposit): ¢");
        double deposit = input.nextDouble();

        System.out.print("Enter the yearly interest rate (APR): ");
        double rate = input.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int periodsPerYear = input.nextInt();

        System.out.print("Enter the number of years the investment will accrue over: ");
        double totalPeriods = input.nextDouble();

        input.close();

        // Computes and displays the total interest of the investment earned
        double overallInterest = computeInvestmentValue(principal, rate, periodsPerYear, deposit, totalPeriods);
        // System.out.println(overallInterest);
        System.out.printf("Total interest earned after %.1f year(s): ¢%.2f%n", totalPeriods, overallInterest);

        // Compute and display the total value of the investment earned
        double totalInvested = principal + (periodsPerYear - 1) * deposit; // Initial investment + additional deposits
        double ValueOfInvestment = totalInvested + overallInterest;
        System.out.printf("Total value of the investment after %d periods: ¢%.2f%n", periodsPerYear*totalPeriods, ValueOfInvestment);
    }

    // This method returns the overall interest earned over a period
    public static double computeInvestmentValue(double principal, double rate, int periodsPerYear, double deposit,
            double totalPeriods) {

        double r = rate / 100;
        double n = periodsPerYear * totalPeriods;
        double totalValue = 0;
        for (int i = 0; i < n; i++) {
            double b = (principal + i * deposit + totalValue) * (r / n);
            totalValue += b;

        }

        return totalValue;
    }
}
