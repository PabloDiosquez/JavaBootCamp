/**
 * The Beer class represents a simple program that sings the "99 bottles of beer" song.
 * It contains a main method to start the program and a sing method to sing each verse of the song.
 */
public class Beer {
    
    /**
     * The main method of the Beer class.
     * It starts the program by singing the "99 bottles of beer" song.
     *
     * @param args The command-line arguments passed to the program (unused).
     */
    public static void main(String[] args) {
        for (int i = 99; i > 0; i--) {
            sing(i);
        }
    }

    /**
     * The sing method sings a verse of the "99 bottles of beer" song for a given number of bottles.
     *
     * @param i The number of bottles of beer on the wall.
     *          It must be a positive integer.
     */
    public static void sing(int i){
        // Print the verse of the song
        System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!\n" +
                           "take one down, pass it around " + (i - 1) + " bottles of beer on the wall!");
    }

}