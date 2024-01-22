import java.util.Scanner;

/**
 * This class represents a simple mortgage application system for the Royal Bank of Java.
 */
public class Bank {

    /**
     * The main method of the program that handles the mortgage application process.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Welcome message
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String decision = scan.nextLine();

        // Task 2 - Print this if the decision is "yes"
        if (decision.toLowerCase().equals("yes")) {
            System.out.println("\nGreat! In one line" +
                    "\nHow much money do you have in your savings?" +
                    "\nAnd, how much do you owe in credit card debt?");

            // Reading user input for savings and credit card debt
            double savings = scan.nextDouble();
            double cardDebt = scan.nextDouble();

            // Reading user input for years worked
            System.out.println("\nHow many years have you worked for?");
            int years = scan.nextInt();

            // Reading user input for name (clearing the buffer)
            System.out.println("What is your name?");
            scan.nextLine();
            String name = scan.nextLine();

            // Checking eligibility for a mortgage
            if (savings >= 10000 && cardDebt < 5000 && years > 2) {
                System.out.println("Congratulations " + name + " You have been approved!");
            } else {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }

        } else {
            // Print this if the decision is "no"
            System.out.println("\nOK. Have a nice day!");
        }

        // Closing the Scanner to prevent resource leak
        scan.close();
    }
}
