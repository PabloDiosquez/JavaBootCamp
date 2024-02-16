/**
 * This class represents a simple receipt for purchasing apples.
 */
public class Receipt {
    
    /**
     * The main method of the Receipt class, which generates a receipt for purchasing apples.
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Array containing types of apples
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};

        // Array containing prices of corresponding apples
        double[] prices = {1.99, 1.49, 1.29};

        // Displaying the header for the receipt
        System.out.println("Here's your receipt:\n");

        // Iterating through each apple type and its price to print on the receipt
        for (int i = 0; i < apples.length; i++) {
            System.out.println("\t" + apples[i] + ": " + "$" + prices[i]);
        }
    }
}