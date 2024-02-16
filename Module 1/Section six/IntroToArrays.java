import java.util.Arrays;
/**
 * The IntroToArrays class demonstrates basic operations with arrays in Java.
 */
public class IntroToArrays {

    /**
     * The main method creates and prints an array of kingdom names.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Array of kingdom names
        String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "East Anglia"};

        // Print each kingdom name individually
        System.out.println(kingdoms[0]);
        System.out.println(kingdoms[1]);
        System.out.println(kingdoms[2]);
        System.out.println(kingdoms[3]);

        // Print the entire array using Arrays.toString method
        System.out.println(Arrays.toString(kingdoms));
    }
}