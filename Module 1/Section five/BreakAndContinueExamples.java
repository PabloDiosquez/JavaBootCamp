/**
 * The BreakAndContinueExamples class demonstrates the usage of 'break' and 'continue' statements in Java loops.
 */
public class BreakAndContinueExamples {

    /**
     * The main method executes different examples demonstrating the usage of 'break' and 'continue' statements.
     *
     * <p>Example 1: Print numbers from 1 to 10, but stop when the number 5 is reached (using break).
     * <p>Example 2: Print numbers from 1 to 10, but skip the number 5 (using continue).
     * <p>Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break).
     * <p>Example 4: Print all even numbers from 1 to 20, skipping odd numbers (using continue).
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10, but stop when the number 5 is reached (using break)
        System.out.println("Numbers: ");
        for (int i = 1; i < 11; i++) {
            if(i == 5) break;
            System.out.println(i);
        }

        // Example 2: Print numbers from 1 to 10, but skip the number 5 (using continue)
        System.out.println("\nNumbers:");
        for (int i = 1; i < 11; i++) {
            if(i == 5) continue;
            System.out.println(i);
        }

        // Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break)
        for (int i = 21; i < 30; i++) {
            if(isDivisibleBy(i, 3)){
                System.out.println("\nThe smallest number greater than 20 that is divisible by 3: " + i);
                break;
            }
        }

        // Example 4: Print all even numbers from 1 to 20, and skip odd numbers (using continue)
        System.out.println("\nEven numbers:");
        for (int i = 1; i < 21; i++) {
            if(!isEven(i)) continue;
            System.out.println(i);
        }
    }

    /**
     * Checks whether a given number is even.
     *
     * @param number The number to be checked.
     * @return True if the number is even, otherwise false.
     */
    public static boolean isEven(int number){
        return isDivisibleBy(number, 2);
    }

    /**
     * Checks whether the first number is divisible by the second number.
     *
     * @param number1 The number to be divided.
     * @param number2 The divisor.
     * @return True if the first number is divisible by the second number, otherwise false.
     */
    public static boolean isDivisibleBy(int number1, int number2){
        return number1 % number2 == 0;
    }
}