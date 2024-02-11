import java.util.Arrays;

/**
 * This class calculates the price after applying tax.
 */
public class Tax {
    
    /**
     * The main method of the Tax class, which calculates the price after applying tax.
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Array representing original prices
        double[] price = {1.99, 2.65, 3.99, 4.99};

        // Array to store prices after tax
        double[] afterTax = new double[price.length];

        // Calculating prices after tax
        for (int i = 0; i < price.length; i++) {
            afterTax[i] = price[i] + 0.13 * price[i]; // Applying 13% tax
        }

        // Displaying original prices
        System.out.println("The original prices are: " + Arrays.toString(price));

        // Displaying prices after tax
        System.out.println("The prices after tax are: " + Arrays.toString(afterTax));
    }
}