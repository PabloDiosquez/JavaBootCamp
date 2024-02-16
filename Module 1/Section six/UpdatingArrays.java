import java.util.Arrays;

/**
 * This class demonstrates updating arrays in Java.
 */
public class UpdatingArrays {
    
    /**
     * The main method of the UpdatingArrays class, which demonstrates updating arrays.
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Original menu array
        String[] menu = {"Espresso", "Ice Coffee", "Macchiato"};

        // Updating the third element of the menu array
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        // You cannot change the length of an array!
        
        // Creating a new array to accommodate additional items
        String[] newMenu = new String[5];

        // Copying elements from the original menu array to the newMenu array
        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }

        // Adding new items to the newMenu array
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";

        // Displaying the updated menu
        System.out.println(Arrays.toString(newMenu));
    }
}