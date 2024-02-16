/**
 * The AreaCalculator class provides a simple console-based area calculator for different geometric shapes.
 */
public class AreaCalculator {

    /**
     * The main method serves as the entry point for the area calculator application.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");

        // Calculating areas for different shapes
        double square = areaSquare(2);
        double rectangle = areaRectangle(1, 2);
        double triangle = areaTriangle(1, 2);
        double circle = areaCircle(2);

        // Printing the calculated areas
        printAreas(square, rectangle, triangle, circle);
    }

    /**
     * Calculates and returns the area of a square.
     * @param side (double) The side length of the square.
     * @return the area (double) The area of the square.
     * 
     * Inside the function: 
     *  1. If the side is negative, prints "Error: impossible" and terminates the java program.
     *  2. Calculates the area of the square using the formula A = side².
     */
    public static double areaSquare(double side) {
        if (side < 0) {
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return side * side;
    }

    /**
     * Calculates and returns the area of a rectangle.
     * @param length (double) The length of the rectangle.
     * @param width  (double) The width of the rectangle.
     * @return the area (double) The area of the rectangle.
     * 
     * Inside the function: 
     *  1. If the length or width is negative, prints "Error: impossible" and terminates the program.
     *  2. Calculates the area of the rectangle using the formula A = length * width.
     */
    public static double areaRectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return length * width;
    }

    /**
     * Calculates and returns the area of a triangle.
     * @param base   (double) The base length of the triangle.
     * @param height (double) The height of the triangle.
     * @return the area (double) The area of the triangle.
     * 
     * Inside the function: 
     *  1. If the base or height is negative, prints "Error: impossible" and terminates the program.
     *  2. Calculates the area of the triangle using the formula A = (base * height) / 2.
     */
    public static double areaTriangle(double base, double height) {
        if (base < 0 || height < 0) {
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return (base * height) / 2;
    }

    /**
     * Calculates and returns the area of a circle.
     * @param radius (double) The radius of the circle.
     * @return the area (double) The area of the circle.
     * 
     * Inside the function: 
     *  1. If the radius is negative, prints "Error: impossible" and terminates the program.
     *  2. Calculates the area of the circle using the formula A = π * radius².
     */
    public static double areaCircle(double radius) {
        if (radius < 0) {
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Prints the calculated areas for square, rectangle, triangle, and circle.
     * @param square    (double) The area of the square.
     * @param rectangle (double) The area of the rectangle.
     * @param triangle  (double) The area of the triangle.
     * @param circle    (double) The area of the circle.
     * 
     * Inside the function:
     *  1. Prints: "Square area: <square area>"
     *  2. Prints: "Rectangle area: <rectangle area>"
     *  3. Prints: "Triangle area: <triangle area>"
     *  4. Prints: "Circle area: <circle area>"
     */
    public static void printAreas(double square, double rectangle, double triangle, double circle) {
        System.out.println("Square area: " + square);
        System.out.println("Rectangle area: " + rectangle);
        System.out.println("Triangle area: " + triangle);
        System.out.println("Circle area: " + circle);
    }
}