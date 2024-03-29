/**
 * This class provides examples of for loops in Java.
 */
public class ForLoopExamples {

    /**
     * Main method containing examples of for loops.
     *
     * @param args The command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10
        // TODO: Write a for loop that prints numbers from 1 to 10
        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }

        // Example 2: Print "Hello, world!" 5 times
        // TODO: Write a for loop that prints "Hello, world!" 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        // Example 3: Print the multiplication table of 5 up to 10
        // TODO: Write a for loop that prints the multiplication table of 5 up to 10 (5 x 1, 5 x 2, ..., 5 x 10)
        System.out.println("\nMultiplication table");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + 5 * i);
        }

        // Example 4: Print the numbers from 10 to 1 in reverse order
        // TODO: Write a for loop that prints numbers from 10 to 1 in reverse order
        System.out.println("\nReverse order");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Example 5: Print the first 10 even numbers
        // TODO: Write a for loop that prints the first 10 even numbers
        System.out.println("\nEven numbers");
        for (int i = 0; i < 20; i += 2) {
            System.out.println(i);
        }
    }
}