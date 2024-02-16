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
        // Declaring and initializing the two-dimensional array 'grades'
        int[][] grades = {
            {72, 74, 78, 76},   // Harry's grades
            {65, 64, 61, 67},   // Ron's grades
            {95, 98, 99, 100}   // Hermione's grades
        };

        // Displaying grades for each student using Arrays.toString
        System.out.println("Harry: " + Arrays.toString(grades[0]));
        System.out.println("Ron: " + Arrays.toString(grades[1]));
        System.out.println("Hermione: " + Arrays.toString(grades[2]));

        System.out.println();

        // Displaying grades for each student using loops
        System.out.print("Harry's grades: ");
        for (int i = 0; i < grades[0].length; i++) {
            System.out.print(grades[0][i] + " ");
        }

        System.out.print("\nRon's grades: ");
        for (int i = 0; i < grades[1].length; i++) {
            System.out.print(grades[1][i] + " ");
        }

        System.out.print("\nHermione's grades: \n");
        for (int i = 0; i < grades[2].length; i++) {
            System.out.print(grades[2][i] + " ");
        }

        // Displaying grades for each student using nested loops
        System.out.println("\nGrades:");
        for (int i = 0; i < grades.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("Harry: ");
                    break;
                case 1:
                    System.out.print("Ron: ");
                    break;
                case 2:
                    System.out.print("Hermione: ");
                    break;
            }
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
}