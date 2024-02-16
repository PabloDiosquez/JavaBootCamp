/**
 * The EvenOrOdd class determines whether numbers from 0 to 19 are even or odd.
 * It iterates through the numbers and prints whether each number is even or odd.
 */
public class EvenOrOdd {
    
    /**
     * The main method of the EvenOrOdd class.
     * It iterates through numbers from 0 to 19 and prints whether each number is even or odd.
     *
     * @param args The command-line arguments passed to the program (unused).
     */
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if(isEven(i)){
                System.out.println(i + " - even");
            } else {
                System.out.println(i + " - odd");
            }
        }
    }

    /**
     * Determines whether a number is even or odd.
     *
     * @param number The number to check.
     *               It can be any integer value.
     * @return true if the number is even, false otherwise.
     */
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
