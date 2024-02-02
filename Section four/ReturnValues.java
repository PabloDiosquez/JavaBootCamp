public class ReturnValues{
    public static void main(String[] args) {
        double area1 = calculateArea(2.3, 3.5);
        double area2 = calculateArea(1.6, 3.86);
        double area3 = calculateArea(3.1, 4.5);
    }

    public static double calculateArea(double length, double width){
        return length*width;
    }
}