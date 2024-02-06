public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(fizzBuzz(i));
        }

    }

    public static String fizzBuzz(int number){
        if(isMultiple(number, 3) && isMultiple(number, 5)){
            return "FizzBuzz";
        } else if(isMultiple(number, 3)){
            return "Fizz";
        } else if(isMultiple(number, 5)){
            return "Buzz";
        }
        return String.format("%s",number);
    }

    public static boolean isMultiple(int number1, int number2){
        return number1 % number2 == 0;
    }
}