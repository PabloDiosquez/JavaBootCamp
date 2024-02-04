/**
 * The Weather class provides functionality to convert temperatures between Fahrenheit and Celsius
 * and print temperature values in both scales.
 */
public class Weather {

    /**
     * The main method demonstrates the usage of the Weather class by initializing temperatures
     * at different times of the day (noon, evening, and midnight) and printing them in both Fahrenheit and Celsius.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Temperature at noon in Fahrenheit
        double noon = 77;

        // Temperature during the evening in Fahrenheit
        double evening = 61;

        // Temperature at midnight in Fahrenheit
        double midnight = 55;

        // Print temperatures for each time of the day
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
    }

    /**
     * Converts temperature from Fahrenheit to Celsius.
     *
     * @param fahrenheit The temperature in Fahrenheit to be converted.
     * @return The temperature converted to Celsius.
     */
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    /**
     * Prints the temperature in both Fahrenheit and Celsius scales.
     *
     * @param fahrenheit The temperature in Fahrenheit to be printed.
     */
    public static void printTemperatures(double fahrenheit){
        // Print temperature in Fahrenheit
        System.out.println("F: "+ fahrenheit);

        // Print temperature converted to Celsius
        System.out.println("C: " + fahrenheitToCelsius(fahrenheit));
    }
}