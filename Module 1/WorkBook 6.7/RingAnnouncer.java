/**
 * The RingAnnouncer class keeps track of wins and losses in a boxing match.
 */
public class RingAnnouncer {
    
    /**
     * The main method counts the number of wins and losses in a boxing match record.
     * 
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        // Array representing the boxing match record
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;
        int losses = 0;

        // Count the number of wins and losses
        for (String result : record) {
            if(result.equals("WIN")){
                wins++;
            } else {
                losses++;
            } 
        }
        
        // Display the professional record
        System.out.println("\nWith a professional record of " + wins + " Wins and " + losses + " losses.");
        System.out.println("He is the pride of Oracle: Java Fury!");
    }
}