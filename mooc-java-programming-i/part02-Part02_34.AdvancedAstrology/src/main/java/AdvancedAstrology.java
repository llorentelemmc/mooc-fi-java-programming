
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printSpaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void christmasTree(int height) {
        //top of tree
        int y = 0;
        for (int i = height; i > 0; i--) {
            printSpaces((i - 1));
            printStars((height - i + 1) + y); //formula for star length
            y++;
        }

        //tree base
        int x = 0;
        while (x < 2) {
            printSpaces(height - 2);
            printStars(3);
            x++;
        }
    }


    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(7);
        System.out.println("---");
        christmasTree(15);
    }
}


