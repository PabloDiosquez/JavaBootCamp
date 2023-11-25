public class JavaMart {
    public static void main(String[] args) {
        // Initializing the amount of money in the wallet
        double wallet = 100;
    
        // Price of a toy car
        double toyCar = 5.99;
        
        // Checking if there's enough money to buy the toy car
        System.out.println("Can I get this car?");
        if (wallet >= toyCar) {
            // If there's enough money, print a confirmation message
            System.out.println("Sure!\n");
            wallet -= toyCar;
        } else {
            // If there's not enough money, print an apology message with the remaining balance
            System.out.println("Sorry, I only have " + wallet + " left.");
        }
    
        // Price of Nike shoes
        double nike = 95.99;
    
        // Checking if there's enough money to buy the Nike shoes
        System.out.println("Can I get these Nike shoes?");
        if (wallet >= nike) {
            // If there's enough money, print a confirmation message
            System.out.println("Sure!\n");
            wallet -= toyCar;
        } else {
            // If there's not enough money, print an apology message with the remaining balance
            System.out.println("Sorry, I only have " + wallet + " left.");
        }
    }
}
