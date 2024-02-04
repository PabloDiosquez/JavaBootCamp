/**
 * The Scope class demonstrates the concept of variable scope in Java,
 * showcasing global and local variables and their accessibility within the class.
 */
public class Scope {
    
    // Global variables to store the rectangle's length and width (accessible within the whole class)
    // static double length = 2;
    // static double width = 4;

    /**
     * The main method initializes local variables for the rectangle's length and width,
     * then calls methods to calculate and print the area and perimeter.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Local variables to store the rectangle's length and width within the main method
        double length = 2;
        double width = 4;

        // Calculate and print the area of the rectangle
        calculateArea(length, width);

        // Calculate and print the perimeter of the rectangle
        calculatePerimeter(length, width);
    }

    /**
     * Calculates the area of a rectangle using the provided parameters.
     * Prints the calculated area to the console.
     *
     * @param param1 The length of the rectangle.
     * @param param2 The width of the rectangle.
     */
    public static void calculateArea(double param1, double param2) {
        // Local variable to store the area (accessible only within this function)
        double area = param1 * param2;
        System.out.println("Area of the rectangle: " + area);
    }

    /**
     * Calculates the perimeter of a rectangle using the provided parameters.
     * Prints the calculated perimeter to the console.
     *
     * @param param1 The length of the rectangle.
     * @param param2 The width of the rectangle.
     */
    public static void calculatePerimeter(double param1, double param2) {
        // Local variable to store the perimeter (accessible only within this function)
        double perimeter = 2 * (param1 + param2);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}