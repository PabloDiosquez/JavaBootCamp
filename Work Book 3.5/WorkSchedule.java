public class WorkSchedule {
    public static void main(String[] args) {
        // Declaration and initialization of variables
        int day = 3;  // Represents the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)
        boolean holiday = true;  // Indicates whether it is a holiday or not
    
        // Checking if it's a holiday
        if (holiday) {
            // If it is a holiday, print the following message
            System.out.println("Woohoo, no work!");
        } else if (day == 6 || day == 7) {
            // If it's not a holiday, check if it's Saturday (6) or Sunday (7)
            // If it is, print the following message
            System.out.println("It's weekend, no work!");
        } else {
            // If it's neither a holiday nor a weekend, print the following message
            System.out.println("Wake up at 7:00 :(");
        }
    }
}
