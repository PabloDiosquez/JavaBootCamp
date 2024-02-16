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

            printwordArr(wordArr);

            printMisses(misseswordArr);

            userGuess = userGuess(scan);

            if (secretWord.contains(String.valueOf(userGuess))) {
                updatewordArr(secretWord, wordArr, userGuess);
                printwordArr(wordArr);
                userGuessesCount++;

                checkWin(secretWord, userGuessesCount, missesCount);

                
            } else {
                updateMisses(misseswordArr, userGuess, missesCount);
                printMisses(misseswordArr);
                missesCount++;
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

    public static void refresh(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

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

    public static void printMisses(char[] misseswordArr) {
        System.out.print("\n\nMisses: ");
        for (char letter : misseswordArr) {
            System.out.print(letter);
        }
    }


    public static void updatewordArr(String secretWord, char[] wordArr, String userGuess) {
        char userGuessChar = userGuess.charAt(0); // Convertir la conjetura a un solo carácter
        
        int index = secretWord.indexOf(userGuessChar); // Encontrar la primera ocurrencia de la conjetura
        
        // Mientras haya ocurrencias de la conjetura en la palabra secreta
        while (index != -1) {
            wordArr[index] = userGuessChar; // Actualizar la letra en la posición correspondiente
            index = secretWord.indexOf(userGuessChar, index + 1); // Encontrar la próxima ocurrencia
        }
    }

    public static void printwordArr(char[] wordArr){
        System.out.print("\nWord: ");
            for (char letter : wordArr) {
                System.out.print(letter +  " ");
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
