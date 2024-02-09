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
        // Instructions for this workbook are on Learn the Part (Workbook 6.2).
        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");

        // Array of student names
        String[] seats = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};
        
        // Assign and print seat for each student
        for (int i = 0; i < seats.length; i++) {
            System.out.println(seats[i] + ", you will take seat " + i);
        }
    }
}