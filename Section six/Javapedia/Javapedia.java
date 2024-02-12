import java.util.Scanner;

/**
 * Javapedia class allows users to register historical database and search for information about them.
 */
public class Javapedia {

    /**
     * The main method for registering historical database and searching for information.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        
        int people = scan.nextInt();
        scan.nextLine();
        
        String[][] database = new String[people][3]; 
        
        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();  

            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();
            
            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();
             
            System.out.print("\n");
        }

        System.out.println("\nThese are the values you stored:"); 
        print2DArray(database); 

        System.out.print("\nWho do you want information on? ");
        String name = scan.nextLine();
        System.out.print("\n");
        searchByName(database, name);        

        scan.close();
    }

    /**
     * Prints the 2D array representing the database of historical database.
     * @param array 2D array containing historical database' information.
     */
    public static void print2DArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /**
     * Searches the database for a historical figure by name and prints their information if found.
     * @param array 2D array containing historical database' information.
     * @param name Name of the historical figure to search for.
     */
    public static void searchByName(String[][] array, String name){
        for (int i = 0; i < array.length; i++) {
            if(array[i][0].equalsIgnoreCase(name)){
                System.out.println("\tName: " + array[i][0]);
                System.out.println("\tDate of birth: " + array[i][1]);
                System.out.println("\tOccupation: " + array[i][2]);
            }
        }
    }
}