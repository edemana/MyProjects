
//This program computes the change to give to the student and, to help the cashier, a breakdown of the denominations of notes and coins (in Ghana Cedis) to give to the student.
import java.util.Scanner;

public class EssentialStore {
    // Final variables that store the various denominations of the cedi
    public final static double twoHundredCedis = 200.00;
    public final static double hundredCedis = 100.00;
    public final static double fiftyCedis = 50.00;
    public final static double twentyCedis = 20.00;
    public final static double tenCedis = 10.00;
    public final static double fiveCedis = 5.00;
    public final static double twoCedi = 2.00;
    public final static double oneCedi = 1.00;
    public final static double fiftyPesewas = 0.50;
    public final static double twentyPesewas = 0.20;
    public final static double tenPesewas = 0.10;

    // Reads input from user
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        double costOfItemPurchased, amountPaid;
        System.out.println("Enter the total cost of items purchased: ");
        costOfItemPurchased = input.nextDouble();
        System.out.println("Enter the amount paid: ");
        amountPaid = input.nextDouble();
        computeChangeBreakdown(costOfItemPurchased, amountPaid);

        input.close();

    }

    // This method returns the amount of change to be given the buyer
    public static double computeChangeBreakdown(double acost, double apaid) {
        double changeAmount = Math.round((apaid - acost) * 100.00) / 100.00;
        System.out.println(changeAmount);

        System.out.printf("Change to give: \u00A2%.2f%n", changeAmount);
        changeAmount = printDenominationType(changeAmount, twoHundredCedis, "\u00A2200.00 note");
        changeAmount = printDenominationType(changeAmount, hundredCedis, "\u00A2100.00 note");
        changeAmount = printDenominationType(changeAmount, fiftyCedis, "\u00A250.00 note");
        changeAmount = printDenominationType(changeAmount, twentyCedis, "\u00A220.00 note");
        changeAmount = printDenominationType(changeAmount, tenCedis, "\u00A210.00 note");
        changeAmount = printDenominationType(changeAmount, fiveCedis, "\u00A25.00 note");
        changeAmount = printDenominationType(changeAmount, twoCedi, "\u00A22.00 coin");
        changeAmount = printDenominationType(changeAmount, oneCedi, "\u00A21.00 coin");
        changeAmount = printDenominationType(changeAmount, fiftyPesewas, "50ps note");
        changeAmount = printDenominationType(changeAmount, twentyPesewas, "20ps coin");
        changeAmount = printDenominationType(changeAmount, tenPesewas, "10ps coin");

        return changeAmount;
    }

    // This method also determines which particular number and denomination type the
    // buyer should receive as change
    public static double printDenominationType(double change, double denomination, String marker) {
        int count = (int) (change / denomination);
        if (count > 0) {
            System.out.printf("%d %s%n", count, marker);
            change -= count * denomination;
        }
        double newChange = Math.round(change * 100.00) / 100.0;
        // System.out.println(newChange);

        return newChange;

    }
}
