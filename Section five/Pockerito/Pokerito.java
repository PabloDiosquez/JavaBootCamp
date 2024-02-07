import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(">>Let's play Pokerito. Type anything when you're ready.\n" + 
        "\n" + 
        ">>It's like Poker, but lot simpler.\n" + 
        ">>\n" + 
        ">> There are two playersyou and the computer.\n" + 
        ">> The dealer will giveach player one card.\n" + 
        ">> Then, the dealer wildraw five cards (the rive\n" + 
        ">> The player with thmost river matchewins!\n" + 
        ">> If the matches arequal, everyone's winner!\n" + 
        ">>\n" + 
        ">> Ready? Type anythinif you are.");
        scan.nextLine();
        String userCard     = randomCard();
        String computerCard = randomCard();
        
        System.out.println("Here's your card:");
        System.out.println(userCard);
        System.out.println("Here's the computer card:");
        System.out.println(computerCard);


        int yourMatches = 0;
        int computerMatches = 0;

        
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        scan.nextLine();
        
        for (int i = 1; i < 6; i++) {
            String card = randomCard();

            System.out.println("Card: " + i);
            System.out.println(card);

            if(userCard.equals(card)){
                yourMatches++;
            } 

            if(computerCard.equals(card)){
                computerMatches++;
            }

            scan.nextLine();
        }

        
        // Get the winner
        

        System.out.println("Your number of matches: " + yourMatches); 
        System.out.println("Computer number of matches: " + computerMatches); 

        if(yourMatches > computerMatches){
            System.out.println("You win!");
        } else if (computerMatches > yourMatches){
            System.out.println("The computer wins!");
        } else {
            System.out.println("Everyone wins!");
        }

        scan.close();
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
