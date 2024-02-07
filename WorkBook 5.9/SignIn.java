import java.util.Scanner;

/**
 * This class represents a simple sign-in process for a fictional application named "Javagram".
 * Users are prompted to enter their username and password, and the program checks if they match predefined credentials.
 */
public class SignIn {

    /**
     * The main method of the SignIn class.
     * This method simulates a sign-in process where users enter their username and password.
     * If the entered credentials match the predefined ones, the user is successfully signed in.
     * @param args The command-line arguments passed to the program (not used in this program).
     */
    public static void main(String[] args) {
        // Predefined username and password
        String username = "Samantha";
        String password = "Java Love";

        // Initialize a scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Welcome message for the sign-in process
        System.out.println("\nWelcome to Javagram! Sign in below\n");

        // Prompt the user to enter their username
        System.out.print("- Username: ");
        String usernameEntry = scan.nextLine();

        // Prompt the user to enter their password
        System.out.print("- Password: ");
        String passwordEntry = scan.nextLine();

        // Continuously prompt the user for credentials until correct ones are provided
        while (!usernameEntry.equals(username) || !passwordEntry.equals(password)) {
            // If the entered credentials are incorrect, inform the user and prompt again
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("- Password: ");
            passwordEntry = scan.nextLine();
        }

        // If the correct credentials are provided, inform the user about successful sign-in
        System.out.println("\nSign in successful. Welcome!");

        // Close the scanner to release system resources
        scan.close();
    }
}