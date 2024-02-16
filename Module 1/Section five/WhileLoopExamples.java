public class WhileLoopExamples {

    /**
     * Main method to demonstrate different examples and improve loop
     * implementations and variable names.
     */
    public static void main(String[] args) {
        // Example 1: Roll a dice until a 6 is rolled
        int rollsUntilSix = 0; // Variable to count the number of rolls until a 6 is rolled
        while (rollDice() != 6) {
            rollsUntilSix++;
        }
        System.out.println("Rolls until 6: " + rollsUntilSix);

        // Example 2: Generate random numbers between 1 and 100 until a number greater
        // than 90 is generated
        int numbersUntilGreaterThan90 = 0; // Variable to count the number of random numbers generated until a number
                                           // greater than 90 is generated
        while (generateRandomNumber() <= 90) {
            numbersUntilGreaterThan90++;
        }
        System.out.println("Numbers until > 90: " + numbersUntilGreaterThan90);

        // Example 3: Keep doubling a random number until it's greater than 125
        int doublesUntilGreaterThan125 = 0; // Variable to count the number of doublings until a number greater than 125
                                            // is reached
        int number = generateRandomNumber();
        while (number <= 125) {
            number *= 2;
            doublesUntilGreaterThan125++;
        }
        System.out.println("Doubles until > 1000: " + doublesUntilGreaterThan125);
    }

    /**
     * Function to simulate rolling a dice (returns a random integer between 1 and
     * 6).
     *
     * @return A random integer between 1 and 6.
     */
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    /**
     * Function to generate a random integer between 1 and 100.
     *
     * @return A random integer between 1 and 100.
     */
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}