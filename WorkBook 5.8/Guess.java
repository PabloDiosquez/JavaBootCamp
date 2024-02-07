import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
       int secretNumber = 5;

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       
       Scanner scan = new Scanner(System.in);

       while (scan.nextInt() != secretNumber) {
            System.out.print("Guess again: ");
       }
       System.out.println("You got it!");
    
        scan.close();
    }

}
