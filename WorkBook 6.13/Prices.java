import java.util.Arrays;

/**
 * The Prices class represents a program to store and display prices of items.
 * It demonstrates the usage of a two-dimensional array to store prices
 * of different categories of items.
 */
public class Prices {

    /**
     * The main method initializes a two-dimensional array to store prices
     * of items in different categories and displays them accordingly.
     */
    public static void main(String[] args) {
        // double[][] prices = new double[3][5];

        // prices[0][0] = 12.99;
        // prices[0][1] = 8.99;
        // prices[0][2] = 9.99;
        // prices[0][3] = 10.49;
        // prices[0][4] = 11.99;

        // prices[1][0] = 0.99;
        // prices[1][1] = 1.99;
        // prices[1][2] = 2.49;
        // prices[1][3] = 1.49;
        // prices[1][4] = 2.99;

        // prices[2][1] = 8.99;
        // prices[2][2] = 7.99;
        // prices[2][3] = 9.49;
        // prices[2][4] = 9.99;
        // prices[2][5] = 10.99;

        // Declaring and initializing the two-dimensional array 'prices'
        double[][] prices = {
            {12.99, 8.99, 9.99, 10.49, 11.99},   // Prices of baking items
            {0.99, 1.99, 2.49, 1.49, 2.99},      // Prices of beverage items
            {8.99, 7.99, 9.49, 9.99, 10.99}      // Prices of cereal items
        };

        // Displaying prices for each category of items
        System.out.println("Baking: " + Arrays.toString(prices[0]));
        System.out.println("Beverage: " + Arrays.toString(prices[1]));
        System.out.println("Cereals: " + Arrays.toString(prices[2]));
    }
}