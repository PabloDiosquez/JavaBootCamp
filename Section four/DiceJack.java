import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three numbers between 1 and 6: ");

        // Read three numbers from the user
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        // Check if numbers are outside the valid range
        if (isLessThanOne(num1, num2, num3) || isGreaterThanSix(num1, num2, num3)) {
            System.out.println("You entered numbers outside the valid range");
            System.exit(0);
        }

        // Calculate the sum of the entered numbers and the sum of three dice rolls
        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDiceRolls = rollDice() + rollDice() + rollDice();

        // Display the sums
        System.out.println("Your sum: " + sumOfNumbers);
        System.out.println("Dice sum: " + sumOfDiceRolls);

        // Check if the user won and print the result
        if (userWon(sumOfNumbers, sumOfDiceRolls)) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Better luck next time!");
        }

        // Close the scanner
        scan.close();
    }

    /**
     * Function name: userWon
     * It determines if the user won based on the sums of numbers and dice rolls.
     * @param sumNumbers (int)
     * @param sumDiceRolls (int)
     * @return true if the user won, false otherwise.
     */
    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return sumNumbers > sumDiceRolls && Math.abs((sumNumbers - sumDiceRolls)) < 3;
    }

    /**
     * Function name: rollDice
     * It simulates rolling a six-sided die.
     * @return a random number between 1 and 6 (inclusive).
     */
    public static int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    /**
     * Function name: isLessThanOne
     * It checks if any of the given numbers is less than 1.
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return true if any number is less than 1, false otherwise.
     */
    public static boolean isLessThanOne(int num1, int num2, int num3) {
        return num1 < 1 || num2 < 1 || num3 < 1;
    }

    /**
     * Function name: isGreaterThanSix
     * It checks if any of the given numbers is greater than 6.
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return true if any number is greater than 6, false otherwise.
     */
    public static boolean isGreaterThanSix(int num1, int num2, int num3) {
        return num1 > 6 || num2 > 6 || num3 > 6;
    }
}