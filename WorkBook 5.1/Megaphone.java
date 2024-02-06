/**
 * The Megaphone class demonstrates a simple Java program that prints a message multiple times using a for loop.
 */
public class Megaphone {
    /**
     * The main method is the entry point of the program.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Using a for loop to repeat the printing of a message 10 times
        for (int i = 0; i < 10; i++) {
            // Printing a message with the current loop index (i) and a fixed text
            System.out.println(i + ". If Java was easy, they would call it Python!");
        }
    }
}
