/**
 * This class represents a grocer with a list of aisles containing different products.
 */
public class Grocer {

    /**
     * The main method prints out the aisle number where coffee is located.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Array representing the aisles in the store
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        // Print a message asking if coffee is sold
        System.out.println("\nDo you sell coffee?");

        // Iterate through the aisles to find coffee
        for (int i = 0; i < aisles.length; i++) {
            // Check if the current aisle contains coffee
            if(aisles[i].equals("coffee")){
                // Print the aisle number where coffee is located
                System.out.println("\nWe have that in aisle: " + i);
            }
        }
    }
}