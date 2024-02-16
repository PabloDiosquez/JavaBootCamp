import java.util.Scanner;

public class Hangman {

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

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        playHangman();
    }

    public static void playHangman(){
        String secretWord = randomWord(words);
        char[] wordArr = createCharArray(secretWord.length(), '_');
        int userGuessesCount = 0;
        int missesCount  = 0;
        String userGuess;
        char[] misseswordArr = new char[6];

        while (true) {
            refresh();

            checkForMaxMisses(missesCount, secretWord);

            System.out.println(secretWord);

            printGallowsStage(gallows, missesCount);

            print("Word: ", wordArr);

            print("Misses: ", misseswordArr);

            userGuess = userGuess(scan);

            if (secretWord.contains(String.valueOf(userGuess))) {
                int occurrencesCount = updatewordArr(secretWord, wordArr, userGuess);
                print("Word: ", wordArr);
                userGuessesCount += occurrencesCount;

                checkWin(secretWord, userGuessesCount, missesCount);

            } else {
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
     * If so, prints a message indicating loss and the secret word, and exits the program.
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

    public static String userGuess(Scanner scan){
        System.out.print("\n\nGuess: ");
        return scan.nextLine();
    }

    public static void checkWin(String secretWord, int guessesCount, int missesCount){
        if(guessesCount == secretWord.length()){
            refresh();
            System.out.print("\n" + gallows[missesCount] + "\nYou Win!!\nSECRET WORD: " + secretWord);
            System.exit(0);
        }
    }

    public static void printGallowsStage(String[] gallows, int missesCount) {
    System.out.print(gallows[missesCount]);
}

    public static void updateMisses(char[] misseswordArr, String userGuess, int missesCount) {
        misseswordArr[missesCount] = userGuess.charAt(0);
    }
   
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

    public static void print(String message, char[] arr){
        System.out.print("\n" + message);
            for (char character : arr) {
                System.out.print(character +  " ");
            }
    }

    public static char[] createCharArray(int size, char initialValue) {
        char[] charArray = new char[size];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = initialValue;
        }
        return charArray;
    }
}
