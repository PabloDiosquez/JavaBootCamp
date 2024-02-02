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
        printArea(2.3, 3.5);

        // Example usage of explainArea method
        String englishExplanation = explainArea("English");
        System.out.println(englishExplanation);
    }

    /**
     * The calculateArea method calculates the area based on the given length and width.
     *
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     * @return The calculated area.
     * @throws IllegalArgumentException If either length or width is less than 0.
     */
    public static double calculateArea(double length, double width) {
        // Check for invalid dimensions
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be non-negative values.");
        }
        
        // Calculate and return the area
        return length * width;
    }

    /**
     * The explainArea method provides a language-specific explanation of how the area is calculated.
     *
     * @param language The language for which to provide an explanation.
     * @return A string with an explanation of the area calculation in the specified language.
     */
    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est égale à la longueur * la largeur";
            case "Spanish":
                return "Área es igual a largo * ancho";
            default:
                return "Language not available";
        }
    }

    /**
     * The printArea method prints a formatted message about the area of a rectangle with given length and width.
     *
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     */
    public static void printArea(double length, double width) {
        System.out.println(String.format("A rectangle with a length %s and a width %s has an area %s", length, width, calculateArea(length, width)));
    }
}