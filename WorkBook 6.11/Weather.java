import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {    
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFahrenheit(celsius);

        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Farenheit");

    }

    /**
     * Function name: celsiusToFahrenheit
     * 
     * @param celsius ( double[] )
     * @return fahrenheit ( double[] )
     * 
     * Inside the function:
     *  - 1. Creates a double[] array called 'fahrenheit'.
     *  - 2. Updates the fahrenheit values (F = (C / 5 * 9 ) + 32).
     *  - 3. return fahrenheit.
     */
    public static double[] celsiusToFahrenheit(double[] celsius){
        double[] fahrenheit = new double[celsius.length];
        for (int i = 0; i < fahrenheit.length; i++) {
            fahrenheit[i] = (celsius[i] / 5 * 9) + 32;
        }
        return fahrenheit;
    }

    public static void printTemperatures(double[] temperatures, String tempType){
        System.out.print(tempType + ": ");
        for (double temperature : temperatures) {
            System.out.print(temperature + " ");
        }
        System.out.print("\n");
    }

}
