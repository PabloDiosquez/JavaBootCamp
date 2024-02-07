import java.util.Scanner;

/**
 * The JavaRolls class implements a simple text-based dice rolling game called Rolling Java.
 * Players roll a virtual dice, aiming to score points and win the game by reaching a certain score.
 */
public class JavaRolls {

    /**
     * The main method starts the Rolling Java game.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();

        System.out.println("Great! Here are the rules:\n>> If you roll a 6, the game stops.\n>> If you roll a 4, nothing happens.\n>> Otherwise, you get 1 point.\n>> You must collect at least 3 points to win. Enter anything to roll:");
        scan.nextLine();
        
        int diceRoll;
        int score = 0;
        while (true) {
            diceRoll = rollDice();
            System.out.print("\nYou rolled a " + diceRoll + "\n");
            if(diceRoll == 6){
                System.out.println("End of game.");
                break;
            }
            if(diceRoll == 4){
                System.out.println("Zero points. Keep rolling.");
                continue;
            }
            System.out.println("One point.");
            score++;
        }

        if(score > 3){
            System.out.println("Score: " + score + "\nWow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :(");
        }
    }

    /**
     * Generates a random number between 1 and 6, simulating a dice roll.
     * 
     * @return the randomly generated number (int) representing the result of the dice roll
     */
    public static int rollDice(){
        return (int)(Math.random()*6 + 1);
    }
}