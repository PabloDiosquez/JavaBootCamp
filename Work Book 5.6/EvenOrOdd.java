public class EvenOrOdd {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if(isEven(i)){
                System.out.println(i + " - even");
            } else {
                System.out.println(i + " - odd");
            }
        }
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
