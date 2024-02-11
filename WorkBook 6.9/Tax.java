import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};

        double[] afterTax = new double[4];

        for (int i = 0; i < price.length; i++) {
            afterTax[i] = price[i] + 0.13*price[i];
        }

        System.out.print("The original price are: " + Arrays.toString(price));
        System.out.println("The price after tax are: " + Arrays.toString(afterTax));
    }
}
