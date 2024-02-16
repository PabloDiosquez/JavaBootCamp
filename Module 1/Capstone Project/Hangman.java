import java.util.Scanner;

/**
 * A class representing the Hangman game.
 */
public class Hangman {

    // Scanner object for user input
    static Scanner scan = new Scanner(System.in);

    /**
     * The main method of the Hangman game.
     * It starts the game by calling the playHangman() method.
     *
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        // Start the Hangman game
        playHangman();
    }

    /**
     * Plays a game of Hangman.
     */
    public static void playHangman() {
        // Select a random word from the list of words
        String secretWord = randomWord(words);

        // Create an array to store the guessed characters, initially filled with
        // underscores
        char[] wordArr = createCharArray(secretWord.length(), '_');

        // Initialize variables to keep track of user guesses and misses
        int userGuessesCount = 0;
        int missesCount = 0;

        // Create an array to store the missed characters
        char[] misseswordArr = new char[6]; // assuming max allowed misses is 6

        // Main game loop
        while (true) {
            // Clear the console screen
            refresh();

            // Check if the player has reached the maximum allowed misses
            checkForMaxMisses(missesCount, secretWord);

            // Display the secret word (for debugging purposes)
            System.out.println(secretWord);

            // Print the current stage of the gallows
            printGallowsStage(gallows, missesCount);

            // Print the word with guessed characters filled in
            print("Word: ", wordArr);

            // Print the missed characters
            print("Misses: ", misseswordArr);

            // Prompt the user for a guess
            String userGuess = userGuess(scan);

            // Check if the guessed character is in the secret word
            if (secretWord.contains(String.valueOf(userGuess))) {
                // If the guessed character is in the word, update the word array and check for
                // win
                int occurrencesCount = updatewordArr(secretWord, wordArr, userGuess);
                print("Word: ", wordArr);
                userGuessesCount += occurrencesCount;
                checkWin(secretWord, userGuessesCount, missesCount);
            } else {
                // If the guessed character is not in the word, update the misses array and
                // increment misses count
                updateMisses(misseswordArr, userGuess, missesCount);
                print("Misses: ", misseswordArr);
                missesCount++;
            }
        }
    }

    /**
     * Returns a random word from the given array of words.
     *
     * @param words An array of strings representing the words to choose from.
     * @return A randomly selected word from the provided array.
     */
    public static String randomWord(String[] words) {
        return words[(int) (Math.random() * words.length)];
    }

    /**
     * Clears the console screen.
     */
    public static void refresh() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Checks if the number of misses has reached the maximum allowed misses.
     * If so, prints a message indicating loss and the secret word, and exits the
     * program.
     *
     * @param missesCount The number of misses made by the player.
     * @param secretWord  The secret word the player is trying to guess.
     */
    public static void checkForMaxMisses(int missesCount, String secretWord) {
        final int MAX_ALLOWED_MISSES = 6;
        if (missesCount == MAX_ALLOWED_MISSES) {
            System.out.print("\n\nYou've reached the maximum allowed misses. You Lose!");
            System.out.print("\n" + gallows[6] + "\nSECRET WORD: " + secretWord);
            System.exit(0);
        }
    }

    /**
     * Prompts the user to input a guess and returns the guess as a string.
     *
     * @param scan A Scanner object to read user input.
     * @return The user's guess as a string.
     */
    public static String userGuess(Scanner scan) {
        System.out.print("\n\nGuess: ");
        return scan.nextLine();
    }

    /**
     * Checks if the player has guessed all the characters in the secret word.
     * If so, prints a message indicating victory and the secret word, and exits the
     * program.
     *
     * @param secretWord   The secret word the player is trying to guess.
     * @param guessesCount The number of guesses made by the player.
     * @param missesCount  The number of misses made by the player.
     */
    public static void checkWin(String secretWord, int guessesCount, int missesCount) {
        if (guessesCount == secretWord.length()) {
            refresh();
            System.out.print("\n" + gallows[missesCount] + "\nYou Win!!\nSECRET WORD: " + secretWord);
            System.exit(0);
        }
    }

    /**
     * Updates the misses array with the guessed character at the specified index.
     *
     * @param misseswordArr An array to store missed characters.
     * @param userGuess     The user's guess.
     * @param missesCount   The count of misses.
     */
    public static void updateMisses(char[] misseswordArr, String userGuess, int missesCount) {
        misseswordArr[missesCount] = userGuess.charAt(0);
    }

    /**
     * Updates the word array with the guessed character and returns the count of
     * occurrences.
     *
     * @param secretWord The secret word to be guessed.
     * @param wordArr    The array representing the word with guessed characters
     *                   filled in.
     * @param userGuess  The user's guess.
     * @return The count of occurrences of the guessed character in the secret word.
     */
    public static int updatewordArr(String secretWord, char[] wordArr, String userGuess) {
        char userGuessChar = userGuess.charAt(0);

        int index = secretWord.indexOf(userGuessChar);

        int occurrencesCount = 0;

        while (index != -1) {
            wordArr[index] = userGuessChar;
            index = secretWord.indexOf(userGuessChar, index + 1);
            occurrencesCount++;
        }
        return occurrencesCount;
    }

    /**
     * Prints the gallows stage corresponding to the number of misses.
     *
     * @param gallows     An array of strings representing different stages of the
     *                    gallows.
     * @param missesCount The number of misses made by the player, indicating which
     *                    stage of the gallows to print.
     */
    public static void printGallowsStage(String[] gallows, int missesCount) {
        System.out.print(gallows[missesCount]);
    }

    /**
     * Prints a message followed by the characters in the provided array.
     *
     * @param message The message to be printed before the characters.
     * @param arr     An array of characters to be printed.
     */
    public static void print(String message, char[] arr) {
        System.out.print("\n" + message);
        for (char character : arr) {
            System.out.print(character + " ");
        }
    }

    /**
     * Creates and returns a character array of the specified size with each element
     * initialized to the given initial value.
     *
     * @param size         The size of the character array to create.
     * @param initialValue The initial value to fill each element of the array with.
     * @return The created character array.
     */
    public static char[] createCharArray(int size, char initialValue) {
        char[] charArray = new char[size];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = initialValue;
        }
        return charArray;
    }

    public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra" };

    public static String[] gallows = { "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a trailing escape
                                  // character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

}
