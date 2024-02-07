/**
 * The NestedLoops class demonstrates nested loops in Java.
 * It contains a main method that prints a sequence of numbers within nested loops.
 */
public class NestedLoops {

    /**
     * The main method demonstrates nested loops by printing a sequence of numbers.
     * It prints the outer loop index and the inner loop index.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        
        // Outer loop iterates 3 times
        for (int i = 0; i < 3; i++) {
            System.out.println("Run: " + i);
            
            // Inner loop iterates 3 times
            for (int j = 0; j < 3; j++) {
                System.out.println(j);
            }
        }
    }
}