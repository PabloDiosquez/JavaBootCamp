/**
 * The HighScore class generates an array of random scores and identifies the highest score.
 */
public class HighScore {
    
    /**
     * The main method generates an array of random scores and identifies the highest score.
     * 
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        // Generate an array of random scores
        int[] scores = {
            randomNumber(),
            randomNumber(),
            randomNumber(),
            randomNumber(),
            randomNumber(),
            randomNumber(),
            randomNumber(),
            randomNumber(),
            randomNumber(),
            randomNumber(),
        };

        int highScore = 0;
        
        System.out.print("Here are the scores: ");
        for (int score : scores) {
            System.out.print(score + " ");

            // Update highScore if the current score is higher
            if(score > highScore){
                highScore = score;
            }
        }

        // Display the highest score
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
    } 
    
    /**
     * Generates a random number between 0 and 499999 (inclusive).
     * 
     * @return The generated random number.
     */
    public static int randomNumber(){
        return (int)(Math.random()*500000);
    }

}