import java.util.Random;

/**
 * This class demonstrates the use of various built-in functions in Java.
 */
public class BuiltInFunctions {

    /**
     * Scenario 1
     * Find a built-in function that prints the message on the console.
     * @param message (String) The message to be printed.
     */
    public static void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Scenario 2
     * Find a built-in function that returns the length of a string.
     * @param example (String) The input string.
     * @return length (int) The length of the input string.
     */
    public static int getStringLength(String example) {
        return example.length();
    }

    /**
     * Scenario 3
     * Find a built-in function that converts a string to lowercase.
     * @param upperCase (String) The input string in uppercase.
     * @return lowerCase (String) The input string converted to lowercase.
     */
    public static String convertToLowerCase(String upperCase) {
        return upperCase.toLowerCase();
    }

    /**
     * Scenario 4
     * Find a built-in function that checks if a string starts with a specified prefix.
     * @param programming (String) The input string.
     * @param prefix (String) The specified prefix to check.
     * @return startsWithPrefix (boolean) True if the string starts with the specified prefix; false otherwise.
     */
    public static boolean startsWithPrefix(String programming, String prefix) {
        return programming.startsWith(prefix);
    }

    /**
     * Scenario 5
     * Find a built-in function that replaces all occurrences of a specified character in a string with another character.
     * @param original (String) The original string.
     * @param oldChar (char) The character to be replaced.
     * @param newChar (char) The character to replace with.
     * @return replacedString (String) The string after replacement.
     */
    public static String replaceChar(String original, char oldChar, char newChar) {
        return original.replace(oldChar, newChar);
    }

    /**
     * Scenario 6
     * Find a built-in function that calculates the square root of a number.
     * @param number (double) The input number.
     * @return squareRoot (double) The square root of the input number.
     */
    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    /**
     * Scenario 7
     * Find a built-in function that calculates the power of a number.
     * @param base (double) The base number.
     * @param exponent (double) The exponent.
     * @return power (double) The result of raising the base to the exponent power.
     */
    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Scenario 8
     * Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
     * @return randomNumber (double) The generated random number.
     */
    public static double generateRandomNumber() {
        return Math.random();
    }

    /**
     * Scenario 9
     * Find a built-in function that returns the larger of two numbers.
     * @param number1 (int) The first number.
     * @param number2 (int) The second number.
     * @return maxNumber (int) The larger of the two numbers.
     */
    public static int getMaxNumber(int number1, int number2) {
        return Math.max(number1, number2);
    }

    /**
 * Main method to demonstrate the use of various built-in functions in Java.
 * @param args Command-line arguments (not used).
 */
public static void main(String[] args) {

    // Scenario 1: Printing a message
    String message = "Hello, World!";
    printMessage(message);

    // Scenario 2: Finding the length of a string
    String example = "Java";
    int length = getStringLength(example);
    System.out.println("Length of the string '" + example + "': " + length);

    // Scenario 3: Converting a string to lowercase
    String upperCase = "JAVA";
    String lowerCase = convertToLowerCase(upperCase);
    System.out.println("Uppercase: " + upperCase + ", Lowercase: " + lowerCase);

    // Scenario 4: Checking if a string starts with a specified prefix
    String programming = "Java programming";
    String prefix = "Java";
    boolean doesStartWithPrefix = startsWithPrefix(programming, prefix);
    System.out.println("Does the string start with the prefix '" + prefix + "'? " + doesStartWithPrefix);

    // Scenario 5: Replacing all occurrences of a specified character in a string
    String original = "Java is fun!";
    char oldChar = 'a';
    char newChar = 'e';
    String updatedString = replaceChar(original, oldChar, newChar);
    System.out.println("Original: " + original + ", Updated: " + updatedString);

    // Scenario 6: Calculating the square root of a number
    double number = 9;
    double squareRoot = calculateSquareRoot(number);
    System.out.println("Square root of " + number + " is: " + squareRoot);

    // Scenario 7: Calculating the power of a number
    double base = 2;
    double exponent = 3;
    double power = calculatePower(base, exponent);
    System.out.println(base + " raised to the power of " + exponent + " is: " + power);

    // Scenario 8: Generating a random number between 0.0 (inclusive) and 1.0 (exclusive)
    double randomDecimal = generateRandomNumber();
    System.out.println("Random number: " + randomDecimal);

    // Scenario 9: Finding the larger of two numbers
    int number1 = 5;
    int number2 = 10;
    int largerNumber = getMaxNumber(number1, number2);
    System.out.println("The larger number between " + number1 + " and " + number2 + " is: " + largerNumber);
    }
}