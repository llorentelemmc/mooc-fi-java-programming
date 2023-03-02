
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int sum = first + second;
        int difference = first - second;
        int product = first * second;
        double quotient = 1.0 * first/second;
        String firstString = String.valueOf(first);
        String secondString = String.valueOf(second);
        System.out.println(firstString + " + " + secondString + " = " + sum);
        System.out.println(firstString + " - " + secondString + " = " + difference);
        System.out.println(firstString + " * " + secondString + " = " + product);
        System.out.println(firstString + " / " + secondString + " = " + quotient);
    }
}
