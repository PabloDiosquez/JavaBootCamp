public class HighScore {
    public static void main(String[] args) {
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

            if(score > highScore){
                highScore = score;
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
    } 
    
    /**
     * Function name: randomNumber
     * 
     * @return (int)
     * 
     * Inside the function:
     *  - return a random number between 0 and 499999.
     */
    public static int randomNumber(){
        return (int)(Math.random()*500000);
    }

}
