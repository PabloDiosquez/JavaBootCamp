public class DocComments {
    public static void main(String[] args) {
        greet();
    }

    /**
     * Function name: greet
     *
     * Inside the function:
     *  1. prints 'Hi'. 
     */
    public static void greet(){
        System.out.println("Hi!");
    }

    /**
     * Function name: printText
     * 
     * @param name (String)
     * @param age  (String)
     *
     * Inside the function:
     *  1. Prints the name and age as part of the text.
    */
    public static void printText(String name, String age){
        System.out.println("Hi! I'm " + name + " and I'm " + age + " years old.");
    }

    /**
     * Function name: calculateArea
     * 
     * @param lenght (double)
     * @param width  (double)
     * @return       (double)
     * 
     * Inside the function:
     *  1. calculates the area and returns it.
     */
    public static double calculateArea(double lenght, double width){
        return lenght*width;
    }
}
