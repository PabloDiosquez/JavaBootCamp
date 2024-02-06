/**
 * The Tip class represents a simple program to calculate a tip for the waiter based on the bill amount.
 */
public class Tip {

    /**
     * The main method initializes a bill amount, prints a thank you message, and calculates the tip for the waiter.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Initialize the bill amount
        double bill = 53.5;

        // Print a thank you message
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");

        // Calculate and display the tip for the waiter
        tipTheWaiter(bill);
    }

    /**
     * Calculates and prints the tip for the waiter based on a given bill amount.
     *
     * @param bill The total bill amount for the meal.
     */
    public static void tipTheWaiter(double bill) {
        // Calculate the tip as 15% of the bill
        double tipAmount = 0.15 * bill;

        // Display a message appreciating the service and the calculated tip amount
        System.out.println("Your service was wonderful! Please, accept this tip: $" + tipAmount);
    }
}