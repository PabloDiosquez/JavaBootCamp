/**
 * The HighScore class generates an array of random scores and identifies the highest score along with its seat number.
 */
public class HighScore {
    
    /**
     * The main method generates an array of random scores and identifies the highest score along with its seat number.
     * 
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        // Generate an array of random scores
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        
        int highScore = 0;
        int seat = 0;
        System.out.print("Here are the scores: ");    
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            // Update highScore and seat if the current score is higher
            if (scores[i] > highScore) {
                highScore = scores[i];
                seat = i;
            }
        }
        
        // Display the highest score and its seat number
        System.out.println("\n\nThe highest score is: " + highScore + ". Impressive!");
        System.out.println("It's the gentleman in seat: " + seat + ". Give that man a cookie!");

    }
    
    /**
     * Generates a random number between 0 and 49999 (inclusive).
     * 
     * @return The generated random number.
     */
    public static int randomNumber() {
        double randomDouble = Math.random() * 50000;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
}