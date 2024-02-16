import java.util.Arrays;

/**
 * This class represents a simple lottery ticket program.
 */
public class LotteryTickets {
    
    /**
     * The main method of the LotteryTickets class, which demonstrates printing lottery ticket numbers.
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {

        // Array representing the numbers on a lottery ticket
        int[] ticket = {34, 43, 45, 65, 21, 54};
        // Creating a copy of the ticket array
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);

        // Printing numbers for Ticket 1
        System.out.print("Ticket 1 numbers: ");
        printTicketNumbers(ticket);   

        // Printing numbers for Ticket 2
        System.out.print("Ticket 2 numbers: ");
        printTicketNumbers(ticket2);  
    } 

    /**
     * Prints the numbers on a lottery ticket.
     * @param tickets an array representing the numbers on a lottery ticket
     */
    public static void printTicketNumbers(int[] tickets){
        // Loop through the array and print each number
        for (int ticketNumber : tickets) {
            System.out.print(ticketNumber + " ");
        }
        // Print two new lines after printing all numbers
        System.out.print("\n\n");
    }
}