/**
 * The Exams class assigns seats to students for their exams.
 */
public class Exams {

    /**
     * The main method assigns seats to students and displays the seating arrangement.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Array of student names
        String[] seats = {"Harry", "Neville", "Ron", "Hermione", "Seamus"}; 

        // Prompt for the start of exams
        System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");
        
        // Assign and print seat for each student
        System.out.println(seats[0] + ", you will take seat " + 0);
        System.out.println(seats[1] + ", you will take seat " + 1);
        System.out.println(seats[2] + ", you will take seat " + 2);
        System.out.println(seats[3] + ", you will take seat " + 3);
        System.out.println(seats[4] + ", you will take seat " + 4);
    }
}