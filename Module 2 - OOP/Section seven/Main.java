public class Main{
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.make = "Toyota";
        toyota.price = 10000;
        toyota.year = 2020;
        toyota.color = "Green";

        Car nissan = new Car();
        nissan.make = "Nissan";
        nissan.price = 9000;
        nissan.year = 2019;
        nissan.color = "Black";
        
        System.out.println("This " + toyota.make + " is worth $" + toyota.price + 
        ". It was built in " + toyota.year + ". It is " + toyota.color + ".\n");
        System.out.println("This " + nissan.make + " is worth $" + nissan.price + 
        ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
    }
} 