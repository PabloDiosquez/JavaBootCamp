import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        int[][] grades = new int[3][4];

        // Harry
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 76;

        // Ron
        grades[1][0] = 65;
        grades[1][1] = 64;
        grades[1][2] = 61;
        grades[1][3] = 67;

        // Hermione
        grades[2][0] = 95;
        grades[2][1] = 98;
        grades[2][2] = 99;
        grades[2][3] = 100;

        System.out.println("Harry: " + Arrays.toString(grades[0]));
        System.out.println("Ron: " + Arrays.toString(grades[1]));
        System.out.println("Hermione: " + Arrays.toString(grades[2]));

    }
}
