import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Update each field in the object before printing them.

        person.name = "Paul McCartney";
        person.nationality = "UK";
        person.dateOfBirth = "June 18, 1942";
        person.passport = new String[]{};
        person.seatNumber = 10;

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
    }

        
}
