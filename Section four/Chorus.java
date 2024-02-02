/**
 * The Chorus class represents a program that sings a chorus five times.
 */
public class Chorus {

    /**
     * The main method of the Chorus class, which is the entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Chorus needs to be sung 5 times
        singChorus();
        singChorus();
        singChorus();
        singChorus();
        singChorus();
    }

    /**
     * The singChorus method prints the lyrics of the chorus to the console.
     */
    public static void singChorus(){
        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on good times");
        System.out.println("Don't blame it on the boogie\n");
    } 
}