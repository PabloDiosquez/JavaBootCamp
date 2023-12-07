public class LogicalOperators {
    public static void main(String[] args) {
    /**********************AND OPERATOR**********************/

    // Declare and initialize boolean variables
    boolean hasDrivingLicense = true;
    boolean hasInsurance = true;

    // Check if both conditions (hasDrivingLicense and hasInsurance) are true
    if(hasDrivingLicense && hasInsurance){
        System.out.println("You can legally drive.");
    } else {
        System.out.println("You cannot legally drive");
    }

    // Declare and initialize variables for age and income
    int age = 25;
    double income = 45000;

    // Check if both conditions (age >= 21 and income >= 40000) are true
    if(age >= 21 && income >= 40000){
        System.out.println("You are eligible for a loan.");
    } else {
        System.out.println("You are not eligible for a loan.");
    }

    // Declare and initialize variables for input username and password, and correct username and password
    String inputUsername = "JohnDoe";
    String inputPassword = "password123";
    String correctUsername = "JohnDoe";
    String correctPassword = "password123";

    // Check if both inputUsername matches correctUsername and inputPassword matches correctPassword
    if(inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)){
        System.out.println("Access granted!");
    } else {
        System.out.println("Invalid username or password");
    }

    /**********************OR OPERATOR**********************/

    // Declare and initialize boolean variables
    boolean hasGoodPerformance = true;
    boolean isLongTermEmployee = false;
    
    // Check if at least one condition (hasGoodPerformance or isLongTermEmployee) is true
    if(hasGoodPerformance || isLongTermEmployee){
        System.out.println("The user is eligible for a promotion.");
    } else {
        System.out.println("The user is not eligible for a promotion.");
    }

    // Declare and initialize variables for user age and whether a parent is present
    int userAge = 17;
    boolean isParentPresent = true;

    // Check if at least one condition (userAge >= 18 or isParentPresent) is true
    if(userAge >= 18 || isParentPresent){
        System.out.println("You can enter the venue.");
    } else {
        System.out.println("You cannot enter the venue.");
    }

    // Declare and initialize variables for member age and membership status
    int memberAge = 16;
    boolean hasMembership = false;

    // Check if at least one condition (memberAge >= 18 or hasMembership) is true
    if(memberAge >= 18 || hasMembership){
        System.out.println("The user can access the service.");
    } else {
        System.out.println("The user cannot access the service.");
    }

    /**********************NOT OPERATOR**********************/

    // Declare and initialize a string variable for payment option
    String option = "cash";

    // Check if the option is not equal to "cash" or "credit"
    boolean cashOrCredit = option.equals("cash") || option.equals("credit");

    // Check if the payment option is not "cash" or "credit"
    if (!cashOrCredit){
        System.out.println("Please choose another payment option.");
    } else {
        System.out.println("Sold. Pleasure doing business with you!");
    }

    // Declare and initialize a char variable for a letter
    char letter = 'A';

    // Check if the letter is not a vowel
    boolean isVowel = (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');

    // Check if the letter is not a vowel and print the result
    if(isVowel){
        System.out.println("The letter " + letter + " is a consonant");
    } else {
        System.out.println("The letter " + letter + " is a vowel.");
    }

    // Declare and initialize a string variable for a move
    String move = "stay";
    boolean isHitOrStay = move.equals("hit") || move.equals("stay");

    // Check if the move is not "hit" or "stay" and print the result
    if(!isHitOrStay){
        System.out.println("Please choose a valid move");
    } else {
        System.out.println("You win 10 bucks!");
        }
    }
}