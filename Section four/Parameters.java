/**
 * The Parameters class demonstrates the calculation of the area using length and width parameters.
 */
public class Parameters {

    /**
     * The main method of the Parameters class, which is the entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Calculate and display the area for different sets of length and width
        calculateArea(2.3, 3.5);
        calculateArea(1.6, 2.4);
        calculateArea(2.6, 4.3);
    }

    /**
     * The calculateArea method calculates and prints the area based on the given length and width.
     *
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     */
    public static void calculateArea(double length, double width) {
        System.out.println("Area: " + length * width);
    }
}