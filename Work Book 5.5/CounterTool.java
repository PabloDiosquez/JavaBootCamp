import java.util.Scanner;

/**
 * The CounterTool class represents a tool for counting numbers by a specified step.
 * It prompts the user to enter the step size, starting number, and stopping number, and then counts from the starting number to the stopping number by the specified step.
 */
public class CounterTool {
    
    /**
     * The main method of the CounterTool class.
     * It prompts the user to input the step size, starting number, and stopping number,
     * and then counts from the starting number to the stopping number by the specified step.
     *
     * @param args The command-line arguments passed to the program (unused).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depstops.");
        System.out.println("Oh, ok...");

        // Prompt user to enter the step size
        System.out.print("1. Pick a number to count by: ");
        int step = scan.nextInt();

        // Prompt user to enter the starting number
        System.out.print("2. Pick a number to start counting from: ");
        int start = scan.nextInt();

        // Prompt user to enter the stopping number
        System.out.print("3. Pick a number to count to: ");
        int stop = scan.nextInt();

        // Count from the starting number to the stopping number by the specified step
        for (int i = start; i <= stop; i += step) {
            System.out.print(i + " ");
        }

        scan.close(); // Close the scanner to release system resources
    }
}