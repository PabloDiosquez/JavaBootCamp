/**
 * This class generates a 2D array filled with random numbers and prints it.
 */
public class RandomArray {
    
    /**
     * The main method creates a 2D array of random numbers and prints it.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[][] array = new int[100][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumber();
            }
        }
        
        print2DArray(array);
    }

    /**
     * Generates a random integer between 0 and 99.
     * @return Random integer.
     */
    public static int randomNumber(){
        return (int)(Math.random()*100);
    }

    /**
     * Prints the given 2D array.
     * @param array 2D array to be printed.
     */
    public static void print2DArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}