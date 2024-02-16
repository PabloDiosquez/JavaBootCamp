import java.util.Scanner;

/**
 * The CountingTool class is a simple program that prompts the user to choose a number and counts up to that number.
 */
public class CountingTool {
    /**
     * The main method is the entry point of the program.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creating a Scanner object to read user input

        System.out.print("Hi Timmy! Choose a number to count to: ");
        int choice = scan.nextInt(); // Reading the user's choice for the number to count to

        // Using a for loop to count from 0 to the user's chosen number
        for (int i = 0; i <= choice; i++) {
            System.out.print(i + " "); // Printing each number in the sequence
        }

        scan.close(); // Closing the Scanner to avoid resource leaks
    }
}
