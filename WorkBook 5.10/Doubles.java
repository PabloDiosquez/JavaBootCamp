public class Doubles {
    public static void main(String[] args) {
        int dice1, dice2;
        dice1 = rollDice();
        dice2 = rollDice();

        System.out.print("Dice 1: " + dice1);
        System.out.print("\nDice 2: " + dice2);

        while (dice1 != dice2) {
            dice1 = rollDice();
            dice2 = rollDice();

            System.out.print("\nDice 1: " + dice1);
            System.out.print("\nDice 2: " + dice2);
        }

    }

    /**
     * Function name: rollDice -- rolls a dice between 1 and 6
     * 
     * @return randomNumber (int)
     */
    public static int rollDice(){
        return (int)(Math.random()*6 + 1);
    }

}





