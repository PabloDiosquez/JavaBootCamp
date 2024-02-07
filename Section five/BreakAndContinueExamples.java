public class BreakAndContinueExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10, but stop when the number 5 is reached (using break)
        // TODO: Write a loop that prints numbers from 1 to 10, but stops when the number 5 is reached using the 'break' statement
        for (int i = 1; i < 11; i++) {
            if(i == 5) break;
            System.out.println(i);
        }

        // Example 2: Print numbers from 1 to 10, but skip the number 5 (using continue)
        // TODO: Write a loop that prints numbers from 1 to 10, but skips the number 5 using the 'continue' statement
        for (int i = 1; i < 11; i++) {
            if(i == 5) continue;
            System.out.println(i);
        }

        // Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break)
        // TODO: Write a loop that finds the smallest number greater than 20 that is divisible by 3 using the 'break' statement
        int i = 0;
        while (true) {
            i++;
            if(i > 20 && i % 3 == 0) break;
        }
        System.out.println("Smallest number greather than 20 that is divisible by 3: " + i);

        // Example 4: Print all even numbers from 1 to 20, and skip odd numbers (using continue)
        // TODO: Write a loop that prints all even numbers from 1 to 20, skipping odd numbers using the 'continue' statement
        for (int j = 1; j < 21; j++) {
            if(isOdd(j)) continue;
            System.out.println(j);
        }
        
    }

    public static boolean isOdd(int number){
        return number % 2 != 0;
    }
}
