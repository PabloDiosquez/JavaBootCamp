import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String response = scan.nextLine();

        //Task 2 - Print this if the decision is "yes"
        if(response == "yes"){
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
                // Task 3 - Pick up each value 
            
            scan.nextLine();
            double savings = scan.nextDouble();
            double cardDebt = scan.nextDouble();
            System.out.println("\nHow many years have you worked for?");
            int years = scan.nextInt();

            System.out.println("What is your name?");
            String userName = scan.nextLine();

            if(){
                System.out.println("Congratulations <name> You have been approved!");
            } else {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }
               
        } else {
            System.out.println("\nOK. Have a nice day!");
        }

        scan.close();
    }
}
