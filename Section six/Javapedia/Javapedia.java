import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        
        int response = scan.nextInt();
        scan.nextLine();
        
        String[][] figures = new String[response][3]; 
        
        for (int i = 0; i < figures.length; i++) {
            System.out.println("\n\tFigure " + (i+1)); 

                System.out.print("\t - Name: ");
                figures[i][0] = scan.nextLine();  

                System.out.print("\t - Date of birth: ");
                figures[i][1] = scan.nextLine();
            
                System.out.print("\t - Occupation: ");
                figures[i][2] = scan.nextLine();
             
                System.out.print("\n");
        }

        System.out.println("These are the values you stored:"); 
        print2DArray(figures); 

        System.out.print("\nWho do you want information on? ");
        String option = scan.nextLine();

        searchByName(figures, option);        

        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */
    public static void print2DArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void searchByName(String[][] array, String name){
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */
        for (int i = 0; i < array.length; i++) {
            if(array[i][0].equalsIgnoreCase(name)){
                System.out.println("\tName: " + array[i][0]);
                System.out.println("\tDate of birth: " + array[i][1]);
                System.out.println("\tOccupation: " + array[i][2]);
            }
        }
    }

}
