
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfValues = 0;
        int sumOfValues = 0;

        while (true) {
            System.out.println("Give a number:");

            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            numberOfValues = numberOfValues + 1;

            sumOfValues = number + sumOfValues;

        }


        System.out.println("Number of numbers: " + numberOfValues);

        System.out.println("Sum of the numbers: " + sumOfValues);


    }
}
