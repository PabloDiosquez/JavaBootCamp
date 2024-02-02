/**
 * The ReturnValues class demonstrates the calculation of the area and the use of return values.
 */
public class ReturnValues {

    /**
     * The main method of the ReturnValues class, which is the entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Calculate and store the areas for different sets of length and width
        double area1 = calculateArea(2.3, 3.5);
        double area2 = calculateArea(1.6, 3.86);
        double area3 = calculateArea(3.1, 4.5);
    }

    /**
     * The calculateArea method calculates the area based on the given length and width.
     *
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     * @return The calculated area.
     */
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}