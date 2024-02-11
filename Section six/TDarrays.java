import java.util.Arrays;

/**
 * The TDarrays class demonstrates the usage of two-dimensional arrays 
 * to store and display grades of students.
 */
public class TDarrays {

    /**
     * The main method initializes a two-dimensional array to store grades
     * and displays them for three students: Harry, Ron, and Hermione.
     * 
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        // int[][] grades = new int[3][4];

        // // Harry's grades
        // grades[0][0] = 72;
        // grades[0][1] = 74;
        // grades[0][2] = 78;
        // grades[0][3] = 76;

        // // Ron's grades
        // grades[1][0] = 65;
        // grades[1][1] = 64;
        // grades[1][2] = 61;
        // grades[1][3] = 67;

        // // Hermione's grades
        // grades[2][0] = 95;
        // grades[2][1] = 98;
        // grades[2][2] = 99;
        // grades[2][3] = 100;

        // Declaring and initializing the two-dimensional array 'grades'
        int[][] grades = {
            {72, 74, 78, 76},   // Harry's grades
            {65, 64, 61, 67},   // Ron's grades
            {95, 98, 99, 100}   // Hermione's grades
        };

        // Displaying grades for each student
        System.out.println("Harry: " + Arrays.toString(grades[0]));
        System.out.println("Ron: " + Arrays.toString(grades[1]));
        System.out.println("Hermione: " + Arrays.toString(grades[2]));

        System.out.println();
    }
}