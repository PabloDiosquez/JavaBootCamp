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
        String secretWord = randomWord(words);
        char[] letters = new char[secretWord.length()];
        int misses = 0;
        String guess;
        char[] missesLetters = new char[6];

        for (int i = 0; i < letters.length; i++) {
            letters[i] = '_';
        }

        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            if(misses == 6){
                break;
            }

            System.out.println(secretWord);
            printGallows(gallows, misses);

            System.out.print("\nWord: ");

            printLetters(letters);

            printMisses(missesLetters);

            System.out.print("\n\nGuess: ");
            guess = scan.nextLine();

            if (secretWord.contains(String.valueOf(guess))) {
                updateLetters(secretWord, letters, guess);
                printLetters(letters);
            } else {
                updateMisses(missesLetters, guess, misses);
                printMisses(missesLetters);
                misses++;
            }
        }

    }

    /**
     * Function name: randomWord
     * 
     * @param words
     * @return
     */
    public static String randomWord(String[] words) {
        return words[(int) (Math.random() * words.length)];
    }

    public static void printGallows(String[] gallows, int misses) {
        System.out.print(gallows[misses]);
    }

    public static void updateMisses(char[] missesLetters, String guess, int misses) {
        missesLetters[misses] = guess.charAt(0);
    }

    public static void printMisses(char[] missesLetters) {
        System.out.print("\n\nMisses: ");
        for (char letter : missesLetters) {
            System.out.print(letter);
        }
    }


    public static void updateLetters(String secretWord, char[] letters, String guess){
        int index = secretWord.indexOf(guess);
        letters[index] = guess.charAt(0);
    }

    public static void printLetters(char[] letters){
        System.out.print("\t");
            for (char letter : letters) {
                System.out.print(letter +  " ");
            }
    }
}
