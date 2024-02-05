import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        // Read user response
        String response = scan.nextLine();

        if (response.toLowerCase().equals("yes")) {
            System.out.println("Great!\nrock - paper - scissors, shoot!");

            // Get user's choice
            String userChoice = scan.nextLine();

            // Get computer's choice
            String computerChoice = computerChoice();

            // Get game result
            String result = result(userChoice, computerChoice);

            // Print the result
            printResult(userChoice, computerChoice, result);

        } else {
            System.out.println("Darn, some other time...!");
        }

        // Close the scanner
        scan.close();
    }

    /**
     * Function name: computerChoice
     * It picks randomly between rock, paper, and scissors.
     * @return a choice (String).
     */
    public static String computerChoice() {
        // Generate a random number between 0 and 2
        int randomNumber = (int) (Math.random() * 3);
        System.out.println(randomNumber);

        // Map the random number to a choice
        if(randomNumber == 0) return "rock";
        if(randomNumber == 1) return "paper";
        return "scissors";
    }

    /**
     * Function name: result
     * It returns the result of the game.
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @return result (String)
     */
    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        // Check different game scenarios
        if (yourChoice.equals(computerChoice)) {
            result = "It's a tie";
        } else if (
                (yourChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (yourChoice.equals("paper") && computerChoice.equals("rock")) ||
                (yourChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            result = "You win! 👽";
        } else if (
                (yourChoice.equals("rock") && computerChoice.equals("paper")) ||
                (yourChoice.equals("paper") && computerChoice.equals("scissors")) ||
                (yourChoice.equals("scissors") && computerChoice.equals("rock"))
        ) {
            result = "You lose! 😖";
        } else {
            System.out.println("INVALID CHOICE.");
            System.exit(0);
        }
        return result;
    }

    /**
     * Function name: printResult
     * It prints everything (user's choice, computer's choice, and result).
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     */
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }
}