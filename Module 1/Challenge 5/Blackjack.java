import java.util.Scanner;

/**
 * The Blackjack class implements a simple text-based Blackjack game.
 */
public class Blackjack {

    /** Scanner object for user input. */
    public static Scanner scan = new Scanner(System.in);

    /**
     * The main method starts the Blackjack game.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();

        // Draw initial cards for player and dealer
        int card1 = drawRandomCard();
        int card2 = drawRandomCard();
        System.out.println("You get a \n" + cardString(card1) + "\nand a \n" + cardString(card2));

        int total = Math.min(card1, 10) + Math.min(card2, 10);
        System.out.println("Your total is: " + total);

        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();
        System.out.println(
                "The dealer shows\n" + cardString(dealerCard1) + "\nand has a card facing down\n" + faceDown());

        int dealerTotal = Math.min(dealerCard1, 10) + Math.min(dealerCard2, 10);
        System.out.println("The dealer's total is hidden");

        int newCard;
        while (true) {
            if (hitOrStay().equalsIgnoreCase("hit")) {
                newCard = drawRandomCard();
                System.out.println(cardString(newCard));
                total += newCard;
                System.out.println("Your new total is: " + total);

                if (total > 21) {
                    System.out.println("Bust! Player loses");
                    System.exit(0);
                }
            } else
                break;
        }

        System.out.println("Dealer's turn\nThe dealers cards are\n" + dealerCard1 + "\nand a \n" + dealerCard2);

        int dealerNewCard;
        while (true) {
            if (dealerTotal > 17) {
                break;
            }
            dealerNewCard = drawRandomCard();
            System.out.println("Dealer gets a\n" + cardString(dealerNewCard));
            dealerTotal += dealerNewCard;
            System.out.println("Dealer's total is " + dealerTotal);
        }

        if (dealerTotal > 21) {
            System.out.println("Bust! Dealer loses");
            System.exit(0);
        }

        if (total > dealerTotal) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer wins!");
        }

        scan.close();
    }

    /**
     * Function name – drawRandomCard
     * 
     * @return (int)
     *
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card.
     */
    public static int drawRandomCard() {
        return (int) (Math.random() * 13 + 1);
    }

    /**
     * Function name – cardString
     * 
     * @param cardNumber (int)
     * @return (String)
     *
     *         Inside the function:
     *         1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber) {
        switch (cardNumber) {
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
            case 13:
                return "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";
            default:
                return "Not possible";
        }
    }

    public static String faceDown() {
        return "   _____\n" +
                "  |     |\n" +
                "  |  J  |\n" +
                "  | JJJ |\n" +
                "  |  J  |\n" +
                "  |_____|\n";
    }

    /**
     * Function name – hitOrStay
     * 
     * @return (String)
     *
     *         Inside the function:
     *         1. Asks the user to hit or stay.
     *         2. If the user doesn't enter "hit" or "stay", keep asking them to try
     *         again by printing:
     *         Please write 'hit' or 'stay'
     *         3. Returns the user's option
     */
    public static String hitOrStay() {
        String response;
        while (true) {
            System.out.println("Would you like to hit or stay?");
            response = scan.nextLine();

            if (response.equalsIgnoreCase("hit") || response.equalsIgnoreCase("stay")) {
                return response;
            }
        }
    }
}