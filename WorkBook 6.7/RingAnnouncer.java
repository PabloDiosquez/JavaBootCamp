public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;
        int losses = 0;

        for (String result : record) {
            if(result.equals("WIN")){
                wins++;
            } else {
                losses++;
            } 
        }
        
        System.out.println("\nWith a professional record of " + wins + " Wins and " + losses + " losses.");
        System.out.println("He is the pride of oracle: Java Fury!");
    }
}
