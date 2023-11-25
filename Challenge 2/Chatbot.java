import java.util.Scanner;

/**
 * The Chatbot class interacts with the user, gathering information about their name, home, age,
 * and favorite programming language. It then shares some information about itself and concludes
 * the conversation. Note: This code assumes the user inputs are valid and doesn't handle
 * potential input errors.
 */
public class Chatbot {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name and store it in the 'name' variable
        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();

        // Greet the user and ask about their home, storing the response in the 'home' variable
        System.out.println("Hi " + name + "! I'm Javabot. Where are you from?");
        String home = scanner.nextLine();

        // Share a comment about the user's home and provide information about the bot's origin
        System.out.println("I hear it's beautiful at " + home + "! I'm from a place called Oracle.");

        // Ask the user about their age and perform a simple calculation related to the bot's age
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("So you're " + age + ", cool! I'm 400 years old.\nThis means I'm " + (400 / age) + " times older than you.");

        // Prompt the user for their favorite programming language and say goodbye
        System.out.println("Enough about me. What's your favorite language? (just don't say Python)");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String language = scanner.nextLine();
        System.out.println(language + " that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}