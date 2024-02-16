import java.util.Arrays;

/**
 * This class represents a simple weather program that converts temperatures between Celsius and Fahrenheit.
 */
public class Weather {
    
    /**
     * The main method of the Weather class, which demonstrates temperature conversion.
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {    
        // Array representing temperatures in Celsius
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        
        // Converting temperatures to Fahrenheit
        double[] fahrenheit = celsiusToFahrenheit(celsius);

        // Printing temperatures in Celsius and Fahrenheit
        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");

    }

    /**
     * Converts temperatures from Celsius to Fahrenheit.
     * @param celsius an array of temperatures in Celsius
     * @return an array of temperatures converted to Fahrenheit
     */
    public static double[] celsiusToFahrenheit(double[] celsius){
        // Creating an array to store temperatures in Fahrenheit
        double[] fahrenheit = new double[celsius.length];
        // Converting temperatures
        for (int i = 0; i < fahrenheit.length; i++) {
            fahrenheit[i] = (celsius[i] / 5 * 9) + 32;
        }
        return fahrenheit;
    }

    /**
     * Prints temperatures along with their temperature type.
     * @param temperatures an array of temperatures
     * @param tempType the type of temperature (e.g., Celsius or Fahrenheit)
     */
    public static void printTemperatures(double[] temperatures, String tempType){
        System.out.print(tempType + ": ");
        for (double temperature : temperatures) {
            System.out.print(temperature + " ");
        }
        System.out.print("\n");
    }

}