import java.sql.Time;

public class Calendar {
    public static void main(String[] args) throws InterruptedException {
        // Specify a day (can be any day)
        String day = "Friday";
        
        // Print a message asking if the person is free on the specified day
        System.out.println("Hey, are you free on " + day + "?");
    
        // Indicate that the program is checking the calendar
        System.out.println("Hmm, let me check my calendar.");
    
        // Check the 'calendar' and provide a response based on the day
        Thread.sleep(3000);
        
        switch (day) {
            case "Monday":
                System.out.println("Sorry, I have to stay at work late."); 
                break;
            case "Tuesday":
                System.out.println("It looks like I have meetings all day."); 
                break;
            case "Wednesday":
                System.out.println("I have a dentist appointment. Some other time!"); 
                break;
            case "Thursday":
                System.out.println("Sorry, Thursday is date night!"); 
                break;
            case "Friday":
            case "Saturday":
            case "Sunday":
                System.out.println("I'm free!"); 
                break;
            default:
                System.out.println("That's not a day."); // Handle invalid day input
                break;
        }
    }
}
