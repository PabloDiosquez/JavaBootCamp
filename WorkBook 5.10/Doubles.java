/**
 * The Doubles class simulates rolling two dice until doubles are rolled.
 */
public class Doubles {

    /**
     * The main method of the Doubles class.
     * It simulates rolling two dice until doubles are rolled.
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        int dice1, dice2;
        dice1 = rollDice(); // Rolling the first dice
        dice2 = rollDice(); // Rolling the second dice

        System.out.print("Dice 1: " + dice1);
        System.out.print("\nDice 2: " + dice2 + "\n");

        // Continue rolling until doubles are rolled
        while (dice1 != dice2) {
            dice1 = rollDice(); // Roll the first dice again
            dice2 = rollDice(); // Roll the second dice again

            System.out.print("\nDice 1: " + dice1);
            System.out.print("\nDice 2: " + dice2 + "\n");
        }
        System.out.print("You rolled doubles!");
    }

    /**
     * Generates a random number between 1 and 6, simulating rolling a six-sided dice.
     * @return A random integer between 1 and 6 (inclusive)
     */
    public static int rollDice(){
        return (int)(Math.random()*6 + 1); // Returns a random integer between 1 and 6
    }

}