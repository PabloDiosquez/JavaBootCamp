import java.util.Arrays;

/**
 * This class demonstrates the reference trap in Java arrays.
 */
public class ReferenceTrap {
    
    /**
     * The main method of the ReferenceTrap class, which demonstrates the reference trap.
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Array representing staff members last year
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        
        // Printing staffLastYear array
        System.out.println(Arrays.toString(staffLastYear));

        // The state of a variable should not change because you updated another.
        // Solution: Make another array.

        // Creating a new array to avoid modifying staffLastYear
        String[] staffThisYear = new String[staffLastYear.length];

        // Copying elements from staffLastYear to staffThisYear
        for (int i = 0; i < staffLastYear.length; i++) {
            staffThisYear[i] = staffLastYear[i];
        }

        // Updating a value in staffThisYear
        staffThisYear[1] = "Abby";

        // Printing staffThisYear array after modification
        System.out.println(Arrays.toString(staffThisYear));
    }
}