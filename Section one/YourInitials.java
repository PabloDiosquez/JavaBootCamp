public class YourInitials {
    public static void main(String[] args) {
         drawP();
         System.out.println();
         drawD();
    }

    public static void drawP() {
        int height = 10;
        int width = 8;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || (i < height / 2 && j < width - 1) || (i == height / 2 && j <= width / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawD() {
        int height = 10;
        int width = 8;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || (j == width - 1 && i != 0 && i != height - 1) || (i == 0 || i == height - 1) && j < width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}