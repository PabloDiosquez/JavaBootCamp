/**
 * The ArrayLoopExamples class demonstrates various examples of array manipulation using loops.
 */
public class ArrayLoopExamples {

    /**
     * The main method contains examples of array manipulation using loops.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Example 1: Print the elements of an integer array using a for loop
        int[] numbers = {22, 24, 26, 29, 30};
        System.out.println("Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Example 2: Print the elements of a string array using a for loop
        String[] strArray = {"apple", "banana", "cherry"};
        System.out.println("\nString array:");
        for (String str : strArray) {
            System.out.println(str);
        }

        // Example 3: Print every second element of an integer array
        int[] grades = {95, 80, 85, 70, 90, 60, 88, 78};
        System.out.println("\nGrades:");
        for (int i = 1; i < grades.length; i+=2) {
            System.out.println(grades[i]);
        }

        // Example 4: Double the elements of an integer array
        int[] values = {3, 5, 7, 9, 11};
        System.out.println("\nValues:");
        for (int value : values) {
            System.out.println(2*value);   
        }

        // Example 5: Capitalize the elements of a string array
        String[] colors = {"red", "green", "blue"};
        System.out.println("\nColors:");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(Character.toUpperCase(colors[i].charAt(0))+ colors[i].substring(1));
        }

        // Example 6: Find the index of a specific value in an integer array
        int[] data = {4, 7, 4, 1, 4, 9, 4};
        int targetValue = 4;
        System.out.println("\nFind the index:");
        for (int i = 0; i < data.length; i++) {
            if(data[i] == targetValue){
                System.out.println("Index: " + i);
            }
        }
    }
}