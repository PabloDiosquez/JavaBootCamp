import java.util.Scanner;

/**
 * This class represents a simple guessing game where the user tries to guess a secret number.
 */
public class Guess {

    /**
     * The main method of the Guess class.
     * This method initializes a secret number and prompts the user to guess it.
     * It continues to prompt the user until the correct guess is made.
     * @param args The command-line arguments passed to the program (not used in this program).
     */
    public static void main(String[] args) {
        // The secret number to be guessed
        int secretNumber = 5;

        // Prompt the user to guess a number between 1 and 5
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");

        // Initialize a scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Continuously prompt the user to guess until they guess the correct number
        while (scan.nextInt() != secretNumber) {
            // If the guess is incorrect, prompt the user to guess again
            System.out.print("Guess again: ");
        }

        // If the correct guess is made, inform the user
        System.out.println("You got it!");

        // Close the scanner to release system resources
        scan.close();
    }
}