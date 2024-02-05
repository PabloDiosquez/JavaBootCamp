import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three numbers between 1 and 6: ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (isLessThanOne(num1, num2, num3) || isLessThanOneHigherThanSix(num1, num2, num3)){
            System.out.println("You enter numbers outside the valid range");
            System.exit(0);
        }

        int sumOfNumbers = num1+num2+num3;
        int sumOfDiceRolls = rollDice() + rollDice() + rollDice();

        System.out.println("Your sum: " + sumOfNumbers);
        System.out.println("Dice sum: "+ sumOfDiceRolls);

        if(userWon(sumOfNumbers, sumOfDiceRolls)){
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Better luck next time!");
        }

        scan.close();
    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls){
        return sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 3;
    }

    public static int rollDice(){
        return (int)(Math.random()*6 + 1);
    }

    public static boolean isLessThanOne(int num1, int num2, int num3){
        return num1 < 1 || num2 < 1 || num3 < 1;
    }

    public static boolean isLessThanOneHigherThanSix(int num1, int num2, int num3){
        return num1 > 6 || num2 > 6 || num3 > 6;
    }
}
