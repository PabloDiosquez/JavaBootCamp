import java.util.Scanner;

/**
 * This class represents a grocer with a list of aisles containing different products.
 */
public class Grocer {

    /**
     * The main method interacts with the user to find products in the store.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scan = new Scanner(System.in);        
        
        // Array representing the products available in the store
        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        // Welcome message
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?");

        // Get user response
        String response = scan.nextLine();
        
        // Iterate through the store to find the requested product
        for (int i = 0; i < store.length; i++) {
            // Check if the current product matches the user response
            if(store[i].equals(response)){
                // Print the aisle number where the product is located
                System.out.println("\nWe have that in aisle: " + i);
            }
        }
        
        // Close the scanner to release resources
        scan.close();
    }
}