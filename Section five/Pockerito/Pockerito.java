import java.util.Scanner;

/**
 * The Pockerito class implements a simple card game named Pockerito.
 * It allows a player to draw cards and compares them with the dealer's cards.
 */
public class Pockerito {

    /**
     * The main method starts the Pockerito game.
     */
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Explain the rules of the game
        explainTheRules();
        scan.nextLine();

        // Draw cards for the user and the computer
        String userCard = randomCard();
        String computerCard = randomCard();

        // Present the drawn cards to the user
        presentTheCards(userCard, computerCard);

        // Prompt the user to continue
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        scan.nextLine();

        // Initialize variables to count matches
        int yourMatches = 0;
        int computerMatches = 0;
        // Draw five cards for the dealer
        for (int i = 1; i < 6; i++) {
            // Generate a random card for the dealer
            String card = randomCard();

            // Print the dealer's drawn card
            System.out.println("Card: " + i);
            System.out.println(card);

            // Check if the user's card matches the drawn card
            if (userCard.equals(card)) {
                yourMatches++;
            }
            // Check if the computer's card matches the drawn card
            if (computerCard.equals(card)) {
                computerMatches++;
            }

            // Prompt the user to continue
            scan.nextLine();
        }

        // Print the number of matches for both the user and the computer
        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);
        // Determine and print the winner of the game
        System.out.println(getTheWinner(yourMatches, computerMatches));

        // Close the Scanner object to prevent resource leak
        scan.close();
    }

    /**
     * Explains the rules of the Pokerito game to the player.
     * This method provides an overview of the game and instructions on how to play.
     */
    public static void explainTheRules() {
        // Print the game instructions and rules
        System.out.println(">>Let's play Pokerito. Type anything when you're ready.\n" +
                "\n" +
                ">>It's like Poker, but a lot simpler.\n" +
                ">>\n" +
                ">> There are two players - you and the computer.\n" +
                ">> The dealer will give each player one card.\n" +
                ">> Then, the dealer will draw five cards (the river).\n" +
                ">> The player with the most river matches wins!\n" +
                ">> If the matches are equal, everyone's a winner!\n" +
                ">>\n" +
                ">> Ready? Type anything if you are.");
    }

    /**
     * Presents the drawn cards to the player.
     * 
     * @param userCard     the card drawn by the player
     * @param computerCard the card drawn by the computer
     */
    public static void presentTheCards(String userCard, String computerCard) {
        // Print the user's card
        System.out.println("Here's your card:");
        System.out.println(userCard);

        // Print the computer's card
        System.out.println("Here's the computer's card:");
        System.out.println(computerCard);
    }

    /**
     * Determines the winner of the game based on the number of matches.
     * 
     * @param userMatches     the number of matches for the player
     * @param computerMatches the number of matches for the computer
     * @return a string indicating the winner of the game
     */
    public static String getTheWinner(int userMatches, int computerMatches) {
        // Compare the number of matches for the player and the computer
        if (userMatches > computerMatches) {
            return "User wins!";
        } else if (computerMatches > userMatches) {
            return "The computer wins";
        }
        // If the number of matches is equal, declare everyone as winners
        return "Everyone wins!";
    }

    /**
     * Function name – randomCard
     * 
     * @return (String)
     * 
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card that matches the random number (get the String
     *         values from cards.text).
     */
    public static String randomCard() {
        int randomNumber = (int) (Math.random() * 13 + 1);

        switch (randomNumber) {
            case 1:
                return "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";
            case 2:
                return "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";
            case 3:
                return "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";
            case 4:
                return "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";
            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
            case 12:
                return "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";
            default:
                return "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";
        }
    }

}
