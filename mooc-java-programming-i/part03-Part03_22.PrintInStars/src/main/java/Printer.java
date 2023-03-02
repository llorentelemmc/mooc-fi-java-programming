
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] foo) {
        for (int i = 0; i < foo.length; i++) {
            printStars(foo[i]);
        }
    }

    public static void printStars(int number) {
        int i = 1;
        while (i <= number) {
            System.out.print("*");
            i++;
        }

        System.out.println();

    }

}
