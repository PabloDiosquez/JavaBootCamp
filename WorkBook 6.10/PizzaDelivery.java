import java.util.Scanner;

/**
 * This class represents a simple pizza delivery program.
 */
public class PizzaDelivery {
    
    /**
     * The main method of the PizzaDelivery class, which handles the pizza ordering process.
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scan = new Scanner(System.in);
        
        // Prompting the user to enter the number of pizza toppings
        System.out.println("How many pizza toppings do you want?");
        int numToppings = scan.nextInt(); 
        scan.nextLine(); // Consume newline
        
        // Prompting the user to enter each topping
        System.out.println("Great, enter each topping!");
        
        // Creating an array to store the toppings
        String[] toppings = new String[numToppings]; // Length of array equals what the user inputs.
        
        // Task 1 here: Looping through the toppings array to populate it with user input
        for (int i = 0; i < toppings.length; i++) {
            System.out.print(i + "." + " "); // Displaying index for user reference
            toppings[i] = scan.nextLine();
        }

        // Displaying the toppings ordered by the user
        System.out.println("\nThank you! Here are the toppings you ordered");
        
        for (String topping : toppings) {
            System.out.println(">> " + topping);
        }
        
        // Prompting the user to confirm the order
        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        // Closing the scanner to release resources
        scan.close();         
    }
}