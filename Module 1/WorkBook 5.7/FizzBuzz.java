/**
 * The FizzBuzz class implements the FizzBuzz game logic.
 * It determines whether a given number is a multiple of 3, 5, or both,
 * and returns the corresponding Fizz, Buzz, or FizzBuzz string.
 */
public class FizzBuzz {
    
    /**
     * The main method of the FizzBuzz class.
     * It iterates through numbers from 0 to 19 and prints the result of the FizzBuzz game for each number.
     *
     * @param args The command-line arguments passed to the program (unused).
     */
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            // Print the result of the FizzBuzz game for the current number
            System.out.println(fizzBuzz(i));
        }
    }

    /**
     * Determines the result of the FizzBuzz game for a given number.
     *
     * @param number The number to evaluate.
     *               It can be any integer value.
     * @return The result of the FizzBuzz game for the given number:
     *         - "FizzBuzz" if the number is a multiple of both 3 and 5.
     *         - "Fizz" if the number is a multiple of 3 but not 5.
     *         - "Buzz" if the number is a multiple of 5 but not 3.
     *         - The number itself if it's not a multiple of 3 or 5.
     */
    public static String fizzBuzz(int number){
        if(isMultiple(number, 3) && isMultiple(number, 5)){
            return "FizzBuzz";
        } else if(isMultiple(number, 3)){
            return "Fizz";
        } else if(isMultiple(number, 5)){
            return "Buzz";
        }
        return String.format("%s",number); // Return the number itself if not a multiple of 3 or 5
    }

    /**
     * Checks if a number is a multiple of another number.
     *
     * @param number1 The number to be checked for being a multiple.
     *                It can be any integer value.
     * @param number2 The number by which to check for being a multiple.
     *                It can be any integer value.
     * @return true if number1 is a multiple of number2, false otherwise.
     */
    public static boolean isMultiple(int number1, int number2){
        return number1 % number2 == 0;
    }
}