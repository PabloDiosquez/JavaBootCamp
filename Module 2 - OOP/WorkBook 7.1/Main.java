import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Represents a person with basic information such as name, nationality, date of birth, passport, and seat number.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Update each field in the object before printing them.

        person.name = "Paul McCartney"; // Setting the name of the person
        person.nationality = "UK"; // Setting the nationality of the person
        person.dateOfBirth = "June 18, 1942"; // Setting the date of birth of the person
        person.passport = new String[]{"@ABC", person.name, person.nationality, person.dateOfBirth}; // Creating passport information for the person
        person.seatNumber = 10; // Setting the seat number assigned to the person

        // Printing out the details of the person
        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
    }   
}